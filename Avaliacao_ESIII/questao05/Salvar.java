package questao05;

import java.io.FileWriter;
import java.io.IOException;

public class Salvar {
    public void salvarTransacao(Transacao trans) {
        try (FileWriter writer = new FileWriter("log_transacoes.txt", true)) {
            writer.write("Data: " + trans.getData() + ", Valor: " + trans.getValor() +
                         ", Tipo: " + trans.getTipo() + "\n");
        } catch (IOException e) {
            System.out.println("Erro ao salvar a transação: " + e.getMessage());
        }
    }
}
