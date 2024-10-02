package org.example;

import java.io.*;
import java.util.List;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


public class LivroMapper {

    public List<Livro> mapearLivros(InputStream inputStream) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        List<Livro> livrosDoJson = objectMapper.readValue(inputStream,
                new TypeReference<List<Livro>>() {
                });
        return livrosDoJson;
    }
}
