package school.sptech.primeira_aula_cco;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

    private List<Filme> filmes;

    public FilmeController() {
        filmes = new ArrayList<>();
        filmes.add(new Filme("Titanic",1998));
        filmes.add(new Filme("Vingadores",2015));
        filmes.add(new Filme("HarryPotter",2005));
        filmes.add(new Filme("Divertidamente",2014));
    }

    @GetMapping("/aleatorio")
    public Filme getAleatorio() {
        Filme filmeAleatorio = new Filme("Shrek 2", 2004);

        return filmeAleatorio;
    }

    @GetMapping("/existe/{nome}")
    public String existe(@PathVariable String nome) {

        for (Filme filme : filmes) {
            if (filme.getTitulo().equals(nome))
                return "O filme %s existe na lista".formatted(nome);
            }
        return "O filme %s não existe na lista".formatted(nome);
    }

}
