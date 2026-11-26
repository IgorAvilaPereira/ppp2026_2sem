package apresentacao;

import negocio.Usuario;

public class Main {
    public static void main(String[] args) {

        Usuario usuario = new Usuario.UsuarioBuilder("igor", "igor@gmail.com").build();
    }
}