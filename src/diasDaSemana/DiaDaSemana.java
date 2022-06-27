package diasDaSemana;

import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opcao;


        do{
            System.out.print("Informe um dia de 1 a 7: ");
            opcao = ler.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Domingo");
                    break;
                case 2:
                    System.out.println("Segunda");
                    break;
                case 3:
                    System.out.println("Terca");
                    break;
                case 4:
                    System.out.println("Quarta");
                    break;
                case 5:
                    System.out.println("Quinta");
                    break;
                case 6:
                    System.out.println("Sexta");
                    break;
                case 7:
                    System.out.println("Sabado");
                    break;
            }
        }while (opcao == 0);

    }
}
