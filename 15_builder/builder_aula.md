# Padrão Builder em Java: Manual vs. Bibliotecas (Com Validações e Valores Padrão)

Este guia apresenta 4 formas diferentes de implementar o padrão **Builder** para a mesma classe (`Produto`), partindo das implementações manuais (classe interna e externa) até o uso das bibliotecas **Lombok** e **Immutables**.

Todos os exemplos abaixo incluem:
* **Campo Obrigatório com Validação:** `nome` (não pode ser nulo ou vazio).
* **Campo Obrigatório sem Valor Padrão:** `preco` (deve ser maior ou igual a zero).
* **Campo Opcional com Valor Padrão:** `estoque` (assume `0` caso não seja informado).

---

## Builder1: Classe Interna Estática (Abordagem Clássica / Effective Java)

Nesta abordagem tradicional, o builder é uma classe `public static` dentro da própria classe alvo. O construtor de `Produto` é `private`, garantindo que o objeto só seja criado através do builder após passar pelas validações.

### 1. Definição da Classe (`Produto.java`)

```java
public class Produto {
    private final String nome;
    private final double preco;
    private final int estoque;

    // Construtor privado: apenas o Builder1 interno tem acesso
    private Produto(Builder1 builder) {
        this.nome = builder.nome;
        this.preco = builder.preco;
        this.estoque = builder.estoque;
    }

    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public int getEstoque() { return estoque; }

    // Classe Builder Interna Estática
    public static class Builder1 {
        private String nome;
        private double preco;
        private int estoque = 0; // Valor padrão definido na declaração

        public Builder1 nome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder1 preco(double preco) {
            this.preco = preco;
            return this;
        }

        public Builder1 estoque(int estoque) {
            this.estoque = estoque;
            return this;
        }

        public Produto build() {
            // Validação centralizada antes da criação do objeto
            if (nome == null || nome.isBlank()) {
                throw new IllegalArgumentException("O nome do produto é obrigatório.");
            }
            if (preco < 0) {
                throw new IllegalArgumentException("O preço não pode ser negativo.");
            }
            return new Produto(this);
        }
    }
}
```

### 2. Como Utilizar

```java
public class ExemploBuilder1 {
    public static void main(String[] args) {
        // Estoque omitido: assumirá o valor padrão 0
        Produto produto = new Produto.Builder1()
                .nome("Teclado Mecânico")
                .preco(350.00)
                .build();
    }
}
```

---

## Builder2: Classe Externa Independente

Aqui, o builder é uma classe separada em seu próprio arquivo (`Builder2.java`). Como está fora de `Produto`, a classe `Produto` precisa expor um construtor `public` ou de pacote (*package-private*) para ser instanciada.

### 1. Definição da Classe Principal (`Produto.java`)

```java
public class Produto {
    private final String nome;
    private final double preco;
    private final int estoque;

    // Construtor público necessário para o Builder externo
    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public int getEstoque() { return estoque; }
}
```

### 2. Definição do Builder Externo (`Builder2.java`)

```java
public class Builder2 {
    private String nome;
    private double preco;
    private int estoque = 0; // Valor padrão

    public Builder2 nome(String nome) {
        this.nome = nome;
        return this;
    }

    public Builder2 preco(double preco) {
        this.preco = preco;
        return this;
    }

    public Builder2 estoque(int estoque) {
        this.estoque = estoque;
        return this;
    }

    public Produto build() {
        // Validação no builder externo
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome do produto é obrigatório.");
        }
        if (preco < 0) {
            throw new IllegalArgumentException("O preço não pode ser negativo.");
        }
        return new Produto(this.nome, this.preco, this.estoque);
    }
}
```

### 3. Como Utilizar

```java
public class ExemploBuilder2 {
    public static void main(String[] args) {
        Produto produto = new Builder2()
                .nome("Teclado Mecânico")
                .preco(350.00)
                .estoque(15)
                .build();
    }
}
```

---

## Builder3: Classe Builder Gerada por Lombok

O **Lombok** utiliza anotações para gerar o código *boilerplate* em tempo de compilação. Para definir valores padrão, utiliza-se `@Builder.Default`. Para validações, é possível customizar a classe `Builder3` interna (o Lombok mescla o código escrito por você com os métodos gerados automaticamente).

### 1. Definição da Classe (`Produto.java`)

```java
import lombok.Builder;
import lombok.Value;

@Value // Torna a classe imutável (private final, getters, equals, hashCode, toString)
@Builder(builderClassName = "Builder3")
public class Produto {
    String nome;
    double preco;

    @Builder.Default // Informa ao Lombok para manter o valor padrão se o método não for chamado
    int estoque = 0;

    // Customização parcial do Builder3 para adicionar validações no build()
    public static class Builder3 {
        public Produto build() {
            if (this.nome == null || this.nome.isBlank()) {
                throw new IllegalArgumentException("O nome do produto é obrigatório.");
            }
            if (this.preco < 0) {
                throw new IllegalArgumentException("O preço não pode ser negativo.");
            }
            // Chama o construtor gerado pelo @Value
            return new Produto(this.nome, this.preco, this.estoque$value);
        }
    }
}
```

### 2. Como Utilizar

```java
public class ExemploLombok {
    public static void main(String[] args) {
        // Estoque omitido: assumirá o valor padrão 0 definido com @Builder.Default
        Produto produto = Produto.builder()
                .nome("Teclado Mecânico")
                .preco(350.00)
                .build();
    }
}
```

---

## Builder4: Classe Builder Gerada por Immutables

A biblioteca **Immutables** gera uma implementação concreta (`ImmutableProduto`) a partir de uma interface. Por padrão, todos os atributos são obrigatórios (lançando `IllegalStateException` se omitidos), valores padrão são definidos com `@Value.Default` e validações são executadas automaticamente através de um método anotado com `@Value.Check`.

### 1. Definição da Interface (`Produto.java`)

```java
import org.immutables.value.Value;

@Value.Immutable
@Value.Style(typeBuilder = "Builder4") // Define o nome do builder gerado como Builder4
public interface Produto {
    String nome();  // Obrigatório por padrão no Immutables
    double preco(); // Obrigatório por padrão no Immutables

    @Value.Default  // Define o valor padrão quando não informado no builder
    default int estoque() {
        return 0;
    }

    @Value.Check    // Executado automaticamente ao chamar .build()
    default void validar() {
        if (nome().isBlank()) {
            throw new IllegalArgumentException("O nome do produto é obrigatório.");
        }
        if (preco() < 0) {
            throw new IllegalArgumentException("O preço não pode ser negativo.");
        }
    }
}
```

### 2. Como Utilizar

```java
public class ExemploImmutables {
    public static void main(String[] args) {
        // Se nome() ou preco() não forem informados, o Immutables lança IllegalStateException.
        // Se estoque() for omitido, assumirá 0.
        Produto produto = ImmutableProduto.builder()
                .nome("Teclado Mecânico")
                .preco(350.00)
                .build();
    }
}
```

---

## Comparação Geral

| Característica | Builder1 (Interna) | Builder2 (Externa) | Builder3 (Lombok) | Builder4 (Immutables) |
| :--- | :--- | :--- | :--- | :--- |
| **Encapsulamento** | Alto (construtor `private`). | Baixo (construtor `public`). | Alto (construtor `private`). | Alto (interface + classe gerada). |
| **Valores Padrão** | Atribuição direta no campo do builder. | Atribuição direta no campo do builder. | Anotação `@Builder.Default`. | Método `default` com `@Value.Default`. |
| **Campos Obrigatórios** | Verificação manual no `.build()`. | Verificação manual no `.build()`. | Verificação manual sobrescrevendo `.build()`. | Nativos por padrão (`IllegalStateException`). |
| **Validação de Regras** | Manual no método `.build()`. | Manual no método `.build()`. | Sobrescrevendo `.build()` no builder. | Método `default` com `@Value.Check`. |
| **Dependências** | Nenhuma (Java puro). | Nenhuma (Java puro). | Biblioteca Lombok + Plugin IDE. | Biblioteca Immutables (Annotation Processor). |
