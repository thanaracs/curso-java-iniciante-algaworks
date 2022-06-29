package poo;

public class PrimeiraClasse {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Smartphone";
        produto.precoUnitario = 500.00;
        produto.quantidade = 11;

        Boolean reposicao;
        if(produto.quantidade < 10){
            reposicao = true;
            if (reposicao == true){
                System.out.println("\nNecessário repor produto, quantidade abaixo da média!");
            }
        }
        produto.exibirQuantidadeEmEstoque();
    }
}
