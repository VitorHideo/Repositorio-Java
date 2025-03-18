package school.sptech.exemplo_validacoes;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.event.WindowFocusListener;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {

    private final JogadorRepository repository;

    public JogadorController(JogadorRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public ResponseEntity<List<Jogador>> listarTodos(){
        List<Jogador> jogadores = repository.findAll();

        if (jogadores.isEmpty()){
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok().body(jogadores);
    }

    @PostMapping
    public ResponseEntity<Jogador> cadastrar(@RequestBody @Valid JogadorCadastroDto jogador){
        Jogador jogadorCadastrado = repository.save(converter(jogador));
        return ResponseEntity.status(201).body(jogadorCadastrado);
    }

    @GetMapping("/resumido")
    public ResponseEntity<List<JogadorResumidoDto>> listarResumido(){
        List<Jogador> jogadores = repository.findAll();
        if (jogadores.isEmpty()){
            return ResponseEntity.noContent().build();
        }

        List<JogadorResumidoDto> dtos = new ArrayList<>();
        for (Jogador jogador : jogadores) {
            dtos.add(converterParaDto(jogador));
        }

        return ResponseEntity.ok(dtos);
    }

    public JogadorResumidoDto converterParaDto(Jogador jogador){
        JogadorResumidoDto dto = new JogadorResumidoDto();
        dto.setId(jogador.getId());
        dto.setNome(jogador.getNome());
        dto.setEmail(jogador.getEmail());
        return dto;
    }

    public Jogador converter(JogadorCadastroDto dto){
        Jogador jogador = new Jogador();
        jogador.setNome(dto.getNome());
        jogador.setEmail(dto.getEmail());
        jogador.setCpf(dto.getCpf());
        jogador.setCamisa(dto.getCamisa());
        jogador.setPosicao(dto.getPosicao());
        jogador.setDataNascimento(dto.getDataNascimento());
        jogador.setStatus(StatusJogadorEnem.OK);

        return jogador;
    }
}
