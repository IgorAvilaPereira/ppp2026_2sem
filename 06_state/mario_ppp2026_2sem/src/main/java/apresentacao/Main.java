package apresentacao;

import negocio.Mario;

public class Main {
    public static void main(String[] args) {
        Mario mario = new Mario();
        System.out.println(mario.getEstadoAtual().getClass().getSimpleName());
        mario.cogumelo();
        mario.estrela();


        // System.out.println(mario.getEstadoAtual().getClass().getSimpleName());

        // mario.flor();
        // System.out.println(mario.getEstadoAtual().getClass().getSimpleName());
        // mario.dano();

        // mario.dano();
        // mario.dano();
        // System.out.println(mario.getEstadoAtual().getClass().getSimpleName());

    }
}