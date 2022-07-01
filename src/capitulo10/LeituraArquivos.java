package capitulo10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeituraArquivos {

    public static void main(String[] args) throws IOException {
        Path arquivo = Paths.get("C:/Users/Thainara/Desktop/DescontoParaCompras/arquivo.txt");
        List<String> leiturasDasLinhas = Files.readAllLines(arquivo);

        for (int i = 0; i < leiturasDasLinhas.size(); i++){
            String linhas = leiturasDasLinhas.get(i);
            System.out.println("linha " + i + " :" +linhas);
        }

        System.out.println("tudo junto: " +leiturasDasLinhas);



    }

}
