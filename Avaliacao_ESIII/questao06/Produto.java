package questao06;

public class Produto extends Item implements Totalizar {
    private double taxa;

    public Produto(String id, String descricao, double valor, double taxa) {
        super(id, descricao, valor);
        this.taxa = taxa;
    }

    public double getTaxa() {
        return taxa;
    }

    @Override
    public double calcularTotal() {
        return getValor() * (1 + getTaxa());
    }
}
