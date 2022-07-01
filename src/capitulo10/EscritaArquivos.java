package capitulo10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class EscritaArquivos {
    public static void main(String[] args) throws IOException {
        ArrayList<String> linhas = new ArrayList<>();
        Scanner ler = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            System.out.print("Informe "+(i+1)+"ª nome: ");
            String nome = ler.nextLine();

            linhas.add(nome);
        }

        //criando o arquivo
        Path arquivo = Paths.get("C:/Users/Thainara/Desktop/DescontoParaCompras/arquivo.txt");
        //escrevendo no arquivo
        Files.write(arquivo, linhas);

        ler.close();
        System.out.println("fim...");

    }
}
