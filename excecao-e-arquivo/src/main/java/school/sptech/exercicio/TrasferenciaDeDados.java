package school.sptech.exercicio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TrasferenciaDeDados {

    public static void main(String[] args) {
        InputStream inputStream ;
        try {
            inputStream = new FileInputStream("pessoas.json");
        } catch (FileNotFoundException e) {
            System.out.println("Falha ao encontra o arquivo!");
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        PessoaMapper mapper = new PessoaMapper();
        List<Pessoa> pessoasMapeadas;
        try {
            pessoasMapeadas = mapper.mapearJson(inputStream);
        } catch (IOException e) {
            System.out.println("Houve um erro ao mapear JSON para objeto Pessoa: " + e.getMessage());
            e.printStackTrace();

            throw new RuntimeException(e);
        }
        for (Pessoa pessoasMapeada : pessoasMapeadas) {
            System.out.println(pessoasMapeada);
        }

}
}