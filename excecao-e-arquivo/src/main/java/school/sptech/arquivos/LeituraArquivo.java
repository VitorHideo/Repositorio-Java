package school.sptech.arquivos;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class LeituraArquivo {

    public static void main(String[] args) {

        //InputStream: representa o fluxo de entradas de dados byte a byte
        //ByteArrayInputStream: leitura de dados local
        //BufferedInputStream: leitura de dados em mémoria usando buffer

        try {
            InputStream inputStream = new FileInputStream("arquivo.txt");

            BufferedReader leitor = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));

            String linha;

            while ((linha = leitor.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Erro ao procurar arquivo: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Erro ao ler byte: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
