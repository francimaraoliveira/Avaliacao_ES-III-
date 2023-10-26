
import java.util.List;
public class Cliente {
    private String nome;
    private List<Pedido> pedidos;

    public Cliente(String nome, List<Pedido> pedidos){
        this.nome=nome;
        this.pedidos=pedidos;
    }

    public String getNome(){
        return nome;
    }
    public List<Pedido> getPedidos(){
        return pedidos;
    }

    public void rlatorioPedido(Pedido pedido, Compra compra){
        System.out.println("Nome: " + nome);
        System.out.println("Pedidos: " + pedidos);
        System.out.println("Valor Total: " + pedido.getValorTotal());
        System.out.println("Desconto: " + compra.calcularDesconto(pedido) );
    }
    
}