package ecampsulamentoExercicio;

public class Pedido {
    Double subtotal;
    Integer codigo, desconto;

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getTotal() {
        Double valorDesconto =  (subtotal * desconto) /100;
        Double total = subtotal - valorDesconto;
        return total;
    }

    public void setTotal(String total) {
        String[] totalComDesconto = total.split(" ");
        total = totalComDesconto[0];

    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getDesconto() {
        return desconto;
    }

    public void setDesconto(Integer desconto) {
        this.desconto = desconto;
    }
}
