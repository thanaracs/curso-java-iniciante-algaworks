package vetores;

import java.util.Scanner;

public class Vetores1Dimensao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String[] cardapio = new String[]{"Calabresa", "Atum", "Queijo", "Presunto"};

        System.out.println("Escolha o sabor:");
        for (int i = 0; i < cardapio.length; i++){
            System.out.println(i + " - " + cardapio[i]);
        }

        System.out.println("Digite o numero referente ao sabor: ");
        Integer saborEscolhido = ler.nextInt();

         System.out.println("Voce escolheu o sabor: "+ cardapio[saborEscolhido]);
        ler.close();
    }
}
