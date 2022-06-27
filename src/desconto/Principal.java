package desconto;
/*
1 - Crie um programa que receba o valor de um produto e exiba o valor final da compra.
2 - Esse valor final será o valor do produto mais o valor do frete - use o valor do frete como R$15,00.
3 - Uma compra de, por exemplo, R$80,00, teria um valor final de R$95,00.
4 - Agora, caso a compra seja maior ou igual a R$100,00, então não cobre o frete.
*/

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double valorProduto = 0.0;

        System.out.print("VALOR DO PRODUTO: ");
        valorProduto = ler.nextDouble();

        if(valorProduto < 100){
            valorProduto += 15.00;
            System.out.println("VALOR FINAL: " + valorProduto);
        }else {
            System.out.println("VALOR FINAL: " + valorProduto);
        }
    }
}
