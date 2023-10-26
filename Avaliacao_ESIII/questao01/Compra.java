public class Compra {
    
    public void processarPedido(Pedido pedido, Cliente cliente) {
        cliente.getPedidos().add(pedido);
        calcularDesconto(pedido);
    }

    public double calcularDesconto(Pedido pedido) {
        return pedido.getValorTotal() * 0.1;
    }
    
    
}
