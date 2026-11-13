# **Lista de Revisão – Design Patterns com Java**

**Objetivo:** revisar os padrões de projeto Decorator, Adapter, Proxy, Prototype, Singleton e Builder, compreendendo suas aplicações por meio de exemplos práticos e exercícios de programação em Java.

## **1. Revisão conceitual**

Os padrões de projeto (*Design Patterns*) são soluções reutilizáveis para problemas recorrentes no desenvolvimento de software.

### **Padrões estruturais**

| Padrão        | Objetivo                                                                  | Ideia principal                                                  |
| ------------- | ------------------------------------------------------------------------- | ---------------------------------------------------------------- |
| **Decorator** | Adicionar funcionalidades a objetos sem modificar suas classes originais. | Composição e encapsulamento de funcionalidades adicionais.       |
| **Adapter**   | Permitir a integração entre classes com interfaces incompatíveis.         | Criar uma classe intermediária que adapta uma interface à outra. |
| **Proxy**     | Controlar o acesso a um objeto.                                           | Intermediar o acesso ao objeto real.                             |

### **Padrões criacionais**

| Padrão        | Objetivo                                             | Ideia principal                                  |
| ------------- | ---------------------------------------------------- | ------------------------------------------------ |
| **Prototype** | Criar objetos a partir de outros objetos existentes. | Clonagem de objetos.                             |
| **Singleton** | Garantir que uma classe possua apenas uma instância. | Construtor privado e acesso global à instância.  |
| **Builder**   | Construir objetos complexos de maneira organizada.   | Construção passo a passo com métodos encadeados. |

## **2. Exercícios de programação**

### **Exercício 1 – Decorator: Sistema de notificações**

Desenvolva um sistema de notificações utilizando o padrão Decorator.

O sistema deverá possuir:

- Uma interface `Notificacao`, com o método `enviar(String mensagem)`.
- Uma classe `NotificacaoBasica`, que implementa a interface.
- Uma classe abstrata `NotificacaoDecorator`.
- Uma classe `NotificacaoEmail`, que adiciona o envio por e-mail.
- Uma classe `NotificacaoSMS`, que adiciona o envio por SMS.

**Requisitos:**

a) Implemente todas as classes necessárias.

b) Crie uma notificação básica.

c) Adicione o envio por e-mail à notificação básica.

d) Adicione também o envio por SMS, permitindo combinar as funcionalidades.

e) Demonstre, na classe `Main`, o funcionamento das diferentes combinações.

### **Exercício 2 – Adapter: Integração com sistemas de pagamento**

Uma aplicação utiliza a seguinte interface:

```
public interface Pagamento {
    void pagar(double valor);
}
```

Entretanto, uma biblioteca externa disponibiliza a seguinte classe:

```
public class PagamentoExterno {
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento externo: " + valor);
    }
}
```

**Requisitos:**

a) Implemente uma classe `PagamentoAdapter` que implemente a interface `Pagamento`.

b) Faça a classe adaptadora utilizar internamente um objeto `PagamentoExterno`.

c) Implemente o método `pagar()` de maneira que ele invoque `realizarPagamento()`.

d) Crie uma classe `Main` que realize um pagamento utilizando a interface `Pagamento`, sem precisar conhecer os detalhes da biblioteca externa.

### **Exercício 3 – Proxy: Controle de acesso a documentos**

Desenvolva um sistema de acesso a documentos utilizando o padrão Proxy.

O sistema deverá possuir:

- Uma interface `Documento`, com o método `exibir()`.
- Uma classe `DocumentoReal`, responsável por carregar e exibir o documento.
- Uma classe `DocumentoProxy`, responsável por controlar o acesso.

**Requisitos:**

a) O documento somente poderá ser exibido se o usuário estiver autenticado.

b) O carregamento do documento real deverá ocorrer somente quando necessário.

c) O Proxy deverá verificar a autenticação antes de permitir o acesso.

d) Implemente uma classe `Main` simulando o acesso de usuários autenticados e não autenticados.

e) Demonstre que o documento real não é carregado quando o acesso é negado.

### **Exercício 4 – Prototype: Cadastro de produtos**

Desenvolva um sistema de cadastro de produtos utilizando o padrão Prototype.

Considere a seguinte classe:

```
public class Produto {
    private String nome;
    private double preco;
    private String categoria;
}
```

**Requisitos:**

a) Implemente uma interface `Prototype` contendo o método `clonar()`.

b) Faça a classe `Produto` implementar essa interface.

c) Crie um produto original e configure seus atributos.

d) Crie dois novos produtos a partir da clonagem do produto original.

e) Altere o nome e o preço de uma das cópias.

f) Demonstre que as alterações realizadas na cópia não modificam o produto original.

g) Implemente também um exemplo que demonstre a diferença entre cópia superficial (*shallow copy*) e cópia profunda (*deep copy*), utilizando um atributo que seja um objeto de outra classe.

### **Exercício 5 – Singleton: Gerenciador de configurações**

Desenvolva uma classe `ConfiguracaoSistema` utilizando o padrão Singleton.

A classe deverá armazenar informações como:

- Nome do sistema.
- Versão.
- Ambiente de execução.

**Requisitos:**

a) Implemente um construtor privado.

b) Crie um atributo estático responsável por armazenar a única instância da classe.

c) Implemente o método estático `getInstance()`.

d) Crie dois objetos utilizando `getInstance()`.

e) Compare as referências utilizando o operador `==`.

f) Altere uma configuração através da primeira referência e consulte seu valor através da segunda.

g) Implemente uma versão thread-safe, garantindo que múltiplas threads não criem instâncias diferentes.

### **Exercício 6 – Builder: Cadastro de usuários**

Desenvolva um sistema de cadastro de usuários utilizando o padrão Builder.

A classe `Usuario` deverá possuir os seguintes atributos:

| Atributo      | Obrigatoriedade           |
| ------------- | ------------------------- |
| Nome          | Obrigatório               |
| E-mail        | Obrigatório               |
| Telefone      | Opcional                  |
| Endereço      | Opcional                  |
| Idade         | Opcional                  |
| Administrador | Opcional (padrão `false`) |

**Requisitos:**

a) Implemente a classe `Usuario` com atributos privados.

b) Crie uma classe interna `UsuarioBuilder`.

c) Implemente métodos encadeados para configurar os atributos opcionais.

d) Implemente o método `build()`, responsável por construir o objeto `Usuario`.

e) Utilize o Builder para criar pelo menos três usuários com diferentes combinações de atributos.

f) Implemente validações para impedir a construção de usuários sem nome ou e-mail.

g) Demonstre a utilização do Builder na classe `Main`.

## **3. Desafio integrador (opcional)**

Desenvolva uma aplicação Java para gerenciamento de uma biblioteca, utilizando os seis padrões de projeto estudados.

| Padrão    | Funcionalidade                                                                     |
| --------- | ---------------------------------------------------------------------------------- |
| Decorator | Adicionar funcionalidades extras aos empréstimos, como seguro e extensão de prazo. |
| Adapter   | Integrar um serviço externo de consulta de livros.                                 |
| Proxy     | Controlar o acesso aos documentos digitais da biblioteca.                          |
| Prototype | Clonar livros para criar novos registros a partir de exemplares existentes.        |
| Singleton | Gerenciar as configurações gerais da biblioteca.                                   |
| Builder   | Construir objetos de livros com diferentes atributos opcionais.                    |

**Requisitos gerais:**

1. Implementar cada padrão em classes separadas.
2. Utilizar interfaces quando apropriado.
3. Criar uma classe `Main` para demonstrar cada implementação.
4. Organizar o código em pacotes.
5. Demonstrar o funcionamento dos padrões com diferentes cenários de execução.

**Orientação para a revisão:** priorize a implementação dos seis padrões sem utilizar bibliotecas prontas que já forneçam essas soluções. O objetivo é praticar a construção das classes, interfaces, composição de objetos, encapsulamento e instanciação em Java.
