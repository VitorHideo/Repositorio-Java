package org.example;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TransferenciaDeDados {

    public static void main(String[] args) {

        // Ler arquivo livros.json
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("livros.json");
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!");
            // Para a execução do programa
            throw new RuntimeException(e);
        }

        LivroMapper livroMapper = new LivroMapper();
        List<Livro> livros = new ArrayList<>();
        try {
            livros = livroMapper.mapearLivros(inputStream);
        } catch (IOException e) {
            System.out.println("Erro ao mapear livros");
        }

        for (Livro livro : livros) {
            System.out.println(livro);
        }

        gerarCsv(livros);

        try {
            inputStream.close();
        } catch (IOException e) {
            System.out.println("Erro ao fechar arquivo");
            throw new RuntimeException(e);
        }
    }

    private static void gerarCsv(List<Livro> livros) {
        CSVFormat formato = CSVFormat.Builder.create()
                .setHeader("id", "nome", "autor", "dataPublicacao", "editora", "preco", "preco_desconto", "nota")
                .setDelimiter(";")
                .build();


        try (
                FileOutputStream outputStream = new FileOutputStream("livros.csv");
                BufferedWriter escritor = new BufferedWriter(new OutputStreamWriter(outputStream));
                CSVPrinter printer = new CSVPrinter(escritor, formato)) {

            for (Livro livro : livros) {
                printer.printRecord(livro.getId(), livro.getNome(), livro.getAutor(), livro.getDataPublicacao(), livro.getEditora(), livro.getPreco(), livro.getPrecoDesconto(), livro.getNota());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
