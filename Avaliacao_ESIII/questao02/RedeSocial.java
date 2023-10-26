package questao02;

public class RedeSocial {
    private String mensagem;

    public RedeSocial() {
        this.mensagem = "";
    }

    public void postarMensagem(String mensagem) {
        if (mensagem == null || mensagem.trim().equals("")) {
            throw new IllegalArgumentException("A mensagem não pode ser vazia...");
        } else {
            this.mensagem = mensagem;
            System.out.println("Mensagem postada: " + mensagem);
        }
    }

    public String getMensagem() {
        return mensagem;
    }
}

