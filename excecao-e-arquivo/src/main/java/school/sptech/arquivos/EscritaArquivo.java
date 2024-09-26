package school.sptech.arquivos;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class EscritaArquivo {

    public static void main(String[] args) {

        // OutputStram: representa a saida byte a byte
        // ByteArrayOutputStream: escrever um arquivo em mémoria
        // FileOutputStream: escrever um arquivo local
        // BufferedOutputStream: escrever um arquivo em mémoria utilizando buffer
        try {
            OutputStream outputStream = new FileOutputStream("arquivo.txt");

            BufferedWriter escritor = new BufferedWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8));

            outputStream.write(65);

            escritor.write("Diego é um professor legal!");
            escritor.newLine();
            escritor.write("Java é a melhor liguagem");


        } catch (FileNotFoundException e) {
            System.out.println("Erro ao escrever arquivo " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Falha ao escrever arquivo");
        }
    }
}
