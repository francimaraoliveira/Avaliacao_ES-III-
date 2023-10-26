package questao06;


public class Totalizacao {
    public double totalizar(Totalizar[] itens) {
        double total = 0;
        for (Totalizar item : itens) {
            total += item.calcularTotal();
        }
        return total;
    }
}


