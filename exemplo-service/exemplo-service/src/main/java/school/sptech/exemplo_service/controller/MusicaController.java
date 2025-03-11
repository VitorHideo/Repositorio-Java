package school.sptech.exemplo_service.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import school.sptech.exemplo_service.entity.Musica;
import school.sptech.exemplo_service.repository.MusicaRepository;
import school.sptech.exemplo_service.service.MusicaService;

import java.util.List;

@RestController
@RequestMapping("/musicas")
public class MusicaController {

    //@Autowired
    //private MusicaService service;

    private final MusicaService service;

    public MusicaController(MusicaService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Musica>> listar(){

        List<Musica> todasMusicas = service.listar();

        if (todasMusicas.isEmpty()){
            return ResponseEntity.status(204).build();
        }

        return ResponseEntity.status(200).body(todasMusicas);

    }

    @PostMapping
    public ResponseEntity<Musica> cadastrar(@Valid @RequestBody Musica musica){

        Musica musicaRegistrada = service.cadastrar(musica);
        return ResponseEntity.status(201).body(musicaRegistrada);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Musica> listarPorId(@PathVariable Integer id){

        Musica musica = service.buscarPorId(id);
        return ResponseEntity.status(200).body(musica);

    }


    /*
    @PutMapping("/{id}")
    public ResponseEntity<Musica> atualizar (@PathVariable Integer id, @RequestBody Musica musicaParaAtulizar){

        if (repository.existsById(id)){
            musicaParaAtulizar.setId(id);

            Musica musicaAlterada = repository.save(musicaParaAtulizar);
            return ResponseEntity.status(200).body(musicaAlterada);
        }

        return ResponseEntity.status(404).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Integer id){

        if (repository.existsById(id)){
            repository.deleteById(id);
            return ResponseEntity.status(204).build();
        }

        return ResponseEntity.status(404).build();
    }

*/







}
