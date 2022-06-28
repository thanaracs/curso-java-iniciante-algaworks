package Metodos;

import java.util.Scanner;

public class PrimeiroMetodo {

    public static void main(String[] args) {
        System.out.println("O curso escolhido foi / " + menuCursos() + " / e a forma de pagamento é: " + formaPagamento());
    }

    private static String menuCursos(){
        Scanner scanner = new Scanner(System.in);
        imprimirTraco();
        String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avançado"};
        System.out.println("Escolha dentre os cursos abaixo: ");
        iterarEExibirPosicoesDoVetorDeString(cursos);
        System.out.print("O curso que você deseja é o: ");

        Integer posicaoCursoEscolhido = scanner.nextInt();
        Boolean posicaoValida = verificaOpcaoEscolhidaPeloUsuario(posicaoCursoEscolhido, cursos);
        if (!posicaoValida) posicaoInvalida();

        String cursoEscolhido = cursos[posicaoCursoEscolhido];
        return cursoEscolhido;
    }

    private static String formaPagamento(){
        imprimirTraco();
        Scanner scanner = new Scanner(System.in);
        String[] formasPagamento = new String[] {"Cartão", "Boleto"};
        System.out.println("Escolha dentre as formas de pagamento abaixo: ");

        iterarEExibirPosicoesDoVetorDeString(formasPagamento);

        System.out.print("Sua forma de pagamento escolhida é: ");
        Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();
        Boolean posicaoValida = verificaOpcaoEscolhidaPeloUsuario(posicaoFormaPagamentoEscolhida, formasPagamento);
        if (!posicaoValida) posicaoInvalida();

        String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];
        return formaPagamentoEscolhida;
    }

    private  static Boolean verificaOpcaoEscolhidaPeloUsuario(Integer posicaoEscolhida, String[] vetor){
        Boolean posicaoValida = posicaoEscolhida >= 0 && posicaoEscolhida < vetor.length;
        return posicaoValida;
    }

    private  static void iterarEExibirPosicoesDoVetorDeString(String[] vetor){
        for(int i = 0; i < vetor.length; i++) {
            System.out.println("[" + i + "] " + vetor[i]);
        }
    }

    static void imprimirTraco() {
        System.out.println("----------------------------------------------");
    }

    private static void posicaoInvalida(){
        System.err.println("Posição inválida!");
        System.exit(1);
    }
}