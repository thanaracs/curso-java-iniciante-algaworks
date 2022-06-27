package notaVestibular;

import java.util.Scanner;

/*
Crie um programa que vai receber as notas que uma pessoa tirou nas duas materias de sua prova.
Serão dois parâmetros para receber um para receber a nota de português e outro para receber as de matemática.
A prova, no total, vale 200 pontos - 100 para cada matéria. A nota mínima total para passar é igual ou maior que 150.
Entretanto, o candidato não pode tirar menos do que 60 pontos em qualquer uma das duas matérias, ou seja,
se tirar 59 em português e 100 em matemática (totalizando uma nota maior do que o total necessário que é 150)
ele não conseguirá a vaga.
No final mostre para o candidato se ele conseguiu ou não.
 */
public class NotaVestibular {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double notaPortugues, notaMatematica = 0;

        System.out.print("NOTA DE PORTUGUÊS: ");
        notaPortugues = scan.nextDouble();
        System.out.print("NOTA DE MATEMÁTICA: ");
        notaMatematica = scan.nextDouble();

        if ((notaPortugues > 100) || (notaMatematica > 100)){
            System.out.println("Informe uma nota menor que 100!");
        }
        if ((notaPortugues < 60) || (notaMatematica < 60)){
            System.out.println("O aluno obteve nota menor que 60, portanto, DESCLASSIFICADO!");
            System.exit(0);
        }
        if ((notaPortugues > 60 && notaPortugues < 101) || (notaMatematica > 60 && notaMatematica < 101)){
            if ((notaPortugues + notaMatematica) > 150){
                System.out.println("Parabens! ALUNO CLASSIFICADO!");
            } else {
                System.out.println("DESCLASSIFICADO! A soma das notas foi inferior a 150 pontos.");
            }
        }
    }
}
