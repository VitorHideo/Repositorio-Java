package sptech.school.exemplo_clean.infrastructure.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sptech.school.exemplo_clean.core.application.command.CriarLIvroCommand;
import sptech.school.exemplo_clean.core.application.usecase.CriarLivroUseCase;
import sptech.school.exemplo_clean.core.domain.Livro;

@RestController
@RequestMapping("/livros")
public class LivroController {

    private final CriarLivroUseCase criarLivroUseCase;

    public LivroController(CriarLivroUseCase criarLivroUseCase) {
        this.criarLivroUseCase = criarLivroUseCase;
    }

    @PostMapping
    public ResponseEntity<Livro> criarLivro(@RequestBody CriarLIvroCommand command){
        Livro livroCriado = criarLivroUseCase.execute(command);
        return ResponseEntity.ok(livroCriado);
    }
}
