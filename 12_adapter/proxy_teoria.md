O clássico exemplo do livro "Use a Cabeça! Padrões de Projetos (https://www.google.com/search?kgmid=%2Fm%2F04yq28_&q=Use+a+Cabe%C3%A7a%21+Padr%C3%B5es+de+Projetos)" (Head First Design Patterns) utiliza a analogia do Simulador de Patos e de um Peru para explicar o padrão Adapter de forma muito didática. [1] (https://heshanu97.medium.com/comprehensive-guide-on-the-adapter-pattern-inspired-by-the-head-first-design-patterns-book-9d8d52831230), [2] (https://github.com/ellingtonb/headfirst_design_patterns)
A história se baseia em um sistema (o simulador) que foi inteiramente construído esperando objetos do tipo Duck (Pato). De repente, surge a necessidade de introduzir um Turkey (Peru) no meio desse simulador. Como as interfaces de comportamento de ambos são incompatíveis, usa-se um adaptador. [1] (https://heshanu97.medium.com/comprehensive-guide-on-the-adapter-pattern-inspired-by-the-head-first-design-patterns-book-9d8d52831230)

🦆 1. O Cenário Inicial: O Pato

O simulador possui uma interface Duck e um pato real (como o Pato Selvagem - MallardDuck): [1] (https://zhenye-na.github.io/blog/2021/08/15/design-patterns-the-adapter-pattern.html), [2] (https://gist.github.com/arttuladhar/606ffd1fc94b756581a6880436fd950a)
java
public interface Duck {
    public void quack(); // Patos grasnam
    public void fly();   // Patos voam longe
}

public class MallardDuck implements Duck {
    public void quack() {
        System.out.println("Quack! Quack!");
    }
    public void fly() {
        System.out.println("Estou voando uma longa distância!");
    }
}
Use o código com cuidado.

🦃 2. O Intruso: O Peru (https://www.google.com/search?kgmid=%2Fm%2F0jly1&q=Peru)

Você precisa adicionar Perus (https://www.google.com/search?kgmid=%2Fm%2F0jly1&q=Perus) ao simulador. No entanto, a interface de um peru (https://www.google.com/search?kgmid=%2Fm%2F0jly1&q=peru) é ligeiramente diferente: eles não grasnam (eles fazem guglar / gobble) e eles não voam distâncias longas (apenas curtas): [1] (https://heshanu97.medium.com/comprehensive-guide-on-the-adapter-pattern-inspired-by-the-head-first-design-patterns-book-9d8d52831230)
java
public interface Turkey {
    public void gobble(); // Perus gulu-gulu / guglam
    public void flyShort(); // Perus voam distâncias curtas
}

public class WildTurkey implements Turkey {
    public void gobble() {
        System.out.println("Gobble gobble! (Gulu-gulu)");
    }
    public void flyShort() {
        System.out.println("Estou voando uma distância bem curtinha!");
    }
}
Use o código com cuidado.
O problema: O método do simulador de patos espera receber um objeto Duck e chamar .quack() e .fly(). Se você tentar passar um WildTurkey, o sistema não vai compilar porque as assinaturas dos métodos são totalmente incompatíveis. [1] (https://heshanu97.medium.com/comprehensive-guide-on-the-adapter-pattern-inspired-by-the-head-first-design-patterns-book-9d8d52831230)

🧱 3. A Solução: O Adaptador de Peru (TurkeyAdapter)

Para resolver isso sem mexer no simulador e nem alterar a classe do peru, o livro cria o TurkeyAdapter. Ele se disfarça de Pato (implementa Duck), mas guarda um Peru (https://www.google.com/search?kgmid=%2Fm%2F0jly1&q=Peru) de verdade lá dentro (composição): [1] (https://heshanu97.medium.com/comprehensive-guide-on-the-adapter-pattern-inspired-by-the-head-first-design-patterns-book-9d8d52831230)
java
public class TurkeyAdapter implements Duck {
    Turkey turkey;
 
    // Nós recebemos o Peru que queremos adaptar no construtor
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }
 
    // Quando o simulador pedir para grasnar, o adaptador traduz para o som do peru
    public void quack() {
        turkey.gobble();
    }
 
    // Como perus voam distâncias curtas, para simular o voo longo de um pato,
    // o adaptador faz o peru bater as asas 5 vezes seguidas!
    public void fly() {
        for(int i = 0; i < 5; i++) {
            turkey.flyShort();
        }
    }
}
Use o código com cuidado.

🎮 4. O Simulador Rodando

No método principal, o sistema interage com o peru (https://www.google.com/search?kgmid=%2Fm%2F0jly1&q=peru) adaptado exatamente da mesma forma que interage com qualquer pato:
java
public class SimuladorDePatos {
    public static void main(String[] args) {
        MallardDuck pato = new MallardDuck();
        WildTurkey peru = new WildTurkey();
        
        // Envelopamos o peru dentro do adaptador de patos
        Duck peruDisfarcadoDePato = new TurkeyAdapter(peru);
 
        System.out.println("O Peru diz...");
        peru.gobble();
        peru.flyShort();
 
        System.out.println("\nO Pato diz...");
        testarPato(pato);
 
        // O simulador aceita o peru perfeitamente porque ele está sob a interface Duck!
        System.out.println("\nO TurkeyAdapter diz...");
        testarPato(peruDisfarcadoDePato);
    }
 
    // Método do simulador que só entende a interface Duck
    static void testarPato(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
Use o código com cuidado.

💡 Curiosidade extra do livro: O Ganso (No padrão composto)

Mais à frente no livro (no capítulo sobre o padrão Compound/Composto), eles revisitam o simulador de patos e fazem um exemplo idêntico usando um Ganso (Goose). Eles criam um GooseAdapter para fazer o ganso emitir o som de honk() quando o simulador chama o método quack(). [1] (https://cdn.bookey.app/files/pdf/book/pt/use-a-cabe%C3%A7a-by-eric-freeman.pdf)
A essência é sempre a mesma: Mapear métodos antigos/incompatíveis dentro das assinaturas que o seu sistema atual exige. [1] (https://www.thiengo.com.br/padrao-de-projeto-adapter)
Você lembrava da parte em que o peru precisa voar 5 vezes para compensar o voo do pato? Gostaria de rever algum outro exemplo clássico do livro Use a Cabeça, como o do Café Starbuzz (para o Decorator) ou o das Estações de Controle (para o Observer)? [1] (https://archive.org/details/usecabecapadroes0000unse)
