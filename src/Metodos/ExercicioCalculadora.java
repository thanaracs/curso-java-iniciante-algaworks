package Metodos;

import java.util.Scanner;

/*
Crie um programa que peça dois números do usuário e também qual a operação ele deseja fazer - adição ou subtração.
Para cada operação, você deve construir um método que realize a mesma, ou seja, teremos um método para adição,
que vai receber dois números como parâmetros e retornar o resultado da soma entre eles, e outro método para subtração.
Fique a vontade para implementar multiplicação e divisão também.
 */
public class ExercicioCalculadora {
    public static void main(String[] args) {
        numeros();

    }
    private static int menuDeOpcao(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Menu de opçoes:" +
                "\n1 - Adicao" +
                "\n2 - Subtracao" +
                "\nInforme a opcao desejada:");
        int opcao = ler.nextInt();
        return opcao;
    }
    private static int adicao(int numeroUm, int numeroDois){
        int resultado = numeroUm + numeroDois;
        return resultado;
    }

    private static int subtracao(int numeroUm, int numeroDois){
        int resultado = numeroUm - numeroDois;
        return resultado;
    }

    private static void numeros(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe o primeiro numero: ");
        int numeroUm = scan.nextInt();
        System.out.print("Informe o segundo numero: ");
        int numeroDois = scan.nextInt();

        int opcao = menuDeOpcao();
        int resultado;
        if(opcao == 1){
            int result = adicao(numeroUm, numeroDois);
            System.out.println("A soma dos números é: " + result);
            System.exit(0);
        }
        if(opcao == 2){
            int result = subtracao(numeroUm, numeroDois);
            System.out.println("A subtração dos números é: " + result);
            System.exit(0);
        }
        if( opcao != 1 && opcao != 2){
            System.err.println("Opcão inválida!");
        }
    }




}
