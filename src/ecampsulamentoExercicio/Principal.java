package ecampsulamentoExercicio;

public class Principal {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.setCodigo(1);
        pedido.setDesconto(10);
        pedido.setSubtotal(100.00);

        System.out.println("Codigo do produto: " + pedido.getCodigo());
        System.out.println("Desconto: " + pedido.getDesconto());
        System.out.println("Subtotal: " + pedido.getSubtotal());
        System.out.println("Total: " + pedido.getTotal());
    }
}
