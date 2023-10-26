import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Pedro", new ArrayList<>());
        Pedido pedido = new Pedido(100, cliente);
        Compra compra = new Compra();

        compra.processarPedido(pedido, cliente);
        compra.calcularDesconto(pedido);
        cliente.rlatorioPedido(pedido, compra);
    }
}
