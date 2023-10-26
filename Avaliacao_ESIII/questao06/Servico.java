package questao06;

public class Servico extends Item implements Totalizar{
    private int horas;

    public Servico(String id, String descricao, double valor, int horas) {
        super(id, descricao, valor);
        this.horas = horas;
    }

    public int getHoras() {
        return horas;
    }

    @Override
    public double calcularTotal() {
        return getValor() * getHoras();
    }
}

