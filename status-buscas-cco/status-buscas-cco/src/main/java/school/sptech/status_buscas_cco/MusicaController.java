package school.sptech.status_buscas_cco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/musicas")
public class MusicaController {

    @Autowired
    private MusicaRepository repository;


    @PostMapping
    public ResponseEntity<Musica> cadastrar(@RequestBody Musica musicaParaRegistrar){

        Musica musicaRegistrada = repository.save(musicaParaRegistrar);
        return ResponseEntity.status(201).body(musicaRegistrada);
    }


    @GetMapping
    public ResponseEntity<List<Musica>> listar(){
        List<Musica> todasMusicas = repository.findAll();

        if (todasMusicas.isEmpty()){
            return ResponseEntity.status(204).build();
        }

        //return todasMusicas;
        return ResponseEntity.status(200).body(todasMusicas);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Musica> buscarPorId(@PathVariable Integer id){

        return ResponseEntity.of(repository.findById(id));

        /*
        Optional<Musica> possivelMusica = repository.findById(id);

        if (possivelMusica.isPresent()){
            Musica musica = possivelMusica.get();
            return ResponseEntity.status(200).body(musica);
        }

        return ResponseEntity.status(404).build();
        */

    }


    @PutMapping("/{id}")
    public ResponseEntity<Musica> atualizar(@PathVariable Integer id, @RequestBody Musica musicaParaAlterar){

        if (repository.existsById(id)){
            musicaParaAlterar.setId(id);
            Musica musicaAlterada = repository.save(musicaParaAlterar);
            return ResponseEntity.status(200).body(musicaAlterada);
        }

        return ResponseEntity.status(404).build();
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removerPorId(@PathVariable Integer id){

        if (repository.existsById(id)){
            repository.deleteById(id);
            return ResponseEntity.status(204).build();
        }

        return ResponseEntity.status(404).build();
    }

    // GET /musicas/titulo
    // Deve retornar uma lista de musicas que contemplem o parametro
    // titulo ou nome, ignorando Case.

    @GetMapping("/titulo")
    public ResponseEntity<List<Musica>> filtrarPorTituloAproximado(@RequestParam String nome){

        List<Musica> musicasFiltradas = repository.findByNomeContainingIgnoreCase(nome);

        if (musicasFiltradas.isEmpty()){
            return ResponseEntity.status(204).build();
        }

        return ResponseEntity.status(200).body(musicasFiltradas);
    }

    @GetMapping("/data/antes")
    public ResponseEntity<List<Musica>> filtrarPorData(@RequestParam LocalDate date){

        List<Musica> musicasFiltradasPorData = repository.findByDataLancamentoBefore(date);

        if (musicasFiltradasPorData.isEmpty()){
            return ResponseEntity.status(204).build();
        }

        return ResponseEntity.status(200).body(musicasFiltradasPorData);

    }

    @GetMapping("/nota/maior")
    public ResponseEntity<List<Musica>> filtrarPorNota(@RequestParam Double nota){

        List<Musica> musicasFiltradasPorNota = repository.findByNotaGreaterThanEqual(nota);

        if (musicasFiltradasPorNota.isEmpty()){
            return ResponseEntity.status(204).build();
        }

        return ResponseEntity.status(200).body(musicasFiltradasPorNota);
    }

    @GetMapping("/artista/contagem")
    public ResponseEntity<Integer> contarMusicaPorArtista(@RequestParam String nome){

        int quantidade = repository.countByArtista(nome);
        return ResponseEntity.status(200).body(quantidade);

    }

}
