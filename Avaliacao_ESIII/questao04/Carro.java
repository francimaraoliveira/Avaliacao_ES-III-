package questao04;

public class Carro {
    double quantidadeCombustivel;
    double capacidadeMaxima = 50; 

    public Carro(double quantidadeCombustivel, double capacidadeMaxima) {
        this.quantidadeCombustivel = quantidadeCombustivel;
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public double getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    public double getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void reabastecer(int quantidade) {
        if (quantidadeCombustivel < capacidadeMaxima * 0.1) {
            if ((quantidadeCombustivel + quantidade) <= capacidadeMaxima) {
                throw new IllegalArgumentException("Carro precisa reabestecer.");
            } 
            if((quantidadeCombustivel) == capacidadeMaxima){
                throw new IllegalArgumentException("Carro precisa reabestecer.");
            }
            quantidadeCombustivel += quantidade;
        } 
        
    }
}
