package poo;

public class Produto {
    String nome;
    Integer quantidade;
    Double precoUnitario;

    void exibirQuantidadeEmEstoque(){
        System.out.println("Produto: " + nome);
        System.out.println("Quantidade em estoque: " + quantidade);
    }
}
