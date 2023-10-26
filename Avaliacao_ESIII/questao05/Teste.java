package questao05;
import java.util.Date;

public class Teste {
    public static void main(String[] args) {

        Transacao transacao = new Transacao(80.0, new Date(), "DEPOSITO");

        Calculo calculo = new Calculo();
        double taxas = calculo.calcularTaxas(transacao);

        System.out.println("Taxas calculadas: " + taxas);

        Salvar salvar = new Salvar();
        salvar.salvarTransacao(transacao);
    }
}
