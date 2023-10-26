package questao03;

public class TestaCarro {
    public static void main(String[] args){
        Carro carro = new Carro(12, 20);
        Reabastecer reab = new Reabastecer();

        reab.reabastecerSeNecessario(carro, 20);
    }
}
