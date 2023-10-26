package questao06;

public class Doacao extends Item implements Totalizar {
    private double bonus;

    public Doacao(String id, String descricao, double valor, double bonus) {
        super(id, descricao, valor);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double calcularTotal() {
        return getValor() + getBonus();
    }
}
