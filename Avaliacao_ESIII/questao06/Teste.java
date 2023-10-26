package questao06;

public class Teste {
    public static void main(String[] args) {
        Produto produto = new Produto("01", "Produto 1", 50.0, 0.6);
        Servico servico = new Servico("01", "Serviço 1", 80.0, 5);
        Doacao doacao = new Doacao("01", "Doação 1", 150.0, 22.0);


        Totalizar[] itens = {produto, servico, doacao};


        Totalizacao totalizacao = new Totalizacao();
        double total = totalizacao.totalizar(itens);


        System.out.println("Total: " + total);
    }
}
