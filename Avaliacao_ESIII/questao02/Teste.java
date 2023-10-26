package questao02;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        RedeSocial rede = new RedeSocial();
        rede.postarMensagem("ola");
        String mensagem = rede.getMensagem();
        System.out.println("Mensagem obtida: " + mensagem);
    }
}

