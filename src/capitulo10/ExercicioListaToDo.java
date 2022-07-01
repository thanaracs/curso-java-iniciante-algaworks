package capitulo10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioListaToDo {
    public static void main(String[] args) throws IOException {
        ArrayList<String> linhas = new ArrayList<>();
        Scanner ler = new Scanner(System.in);
        Path arquivo = Paths.get("C:/Users/Thainara/Desktop/DescontoParaCompras/listaToDo.txt");

        int i = 0;
        String tarefa;
        while (true) { // Deixei o true como condição do laço, pois, o que vai pará-lo é o fato do usuário digitar o "x" no console.
            System.out.print("Tarefa " + i + ": ");
            tarefa = ler.nextLine();

            linhas.add(tarefa);
            i++;
            if ("x".equals(tarefa)) {
                break; // Essa é a única maneira de parar esse laço.
            }

        }

        ler.close();
        Files.write(arquivo, linhas);


    }
}
