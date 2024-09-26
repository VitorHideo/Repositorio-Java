package school.sptech.exercicio;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class PessoaMapper {

    public List<Pessoa> mapearJson(InputStream arquivoJson) throws IOException {

        //ObjectMapper é a classe principal do jackson para mapear json
        ObjectMapper mapper = new ObjectMapper();

        // mapper.readValue() tem dois parâmetros
        // o primeiro parâmetro é o arquivo (InputStream)
        // O seguindo
        List<Pessoa> pessoasLidas = mapper.readValue(arquivoJson, new TypeReference<List<Pessoa>>() {
        });

        return pessoasLidas;
    }
}
