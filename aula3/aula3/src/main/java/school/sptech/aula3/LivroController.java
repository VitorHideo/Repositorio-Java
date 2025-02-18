package school.sptech.aula3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired // DI
    private LivroRepository repository;

    @GetMapping //Request = mapping
    public List<Livro> listar(){
        return repository.findAll();
    }

    @PostMapping  //Endpoint que atende o verbo http post (/livros)
    public Livro cadastrar(@RequestBody Livro livroParaCadastrar){

        return repository.save(livroParaCadastrar);
    }

    @GetMapping("/{id}")
    public Livro buscarPorId(@PathVariable Integer id){

        Optional<Livro> possivelLivro = repository.findById(id);

        if (possivelLivro.isPresent()){
            return possivelLivro.get();
        }
        return null;
    }

    //DTO

    //PUT
    @PutMapping("/{id}")
    public Livro atualizar(@PathVariable Integer id, @RequestBody Livro livroParaAtualizar){

        if (repository.existsById(id)){
            livroParaAtualizar.setId(id);
            repository.save(livroParaAtualizar);
        }

        return null;
    }

    @DeleteMapping("/{id}")
    public String deletar(@PathVariable Integer id){

        if (repository.existsById(id)){
            repository.deleteById(id);
            return "Livro de id %d removido com sucesso".formatted(id);
        }

        return "Livro não encontrado";
    }

    @GetMapping("/contagem")
    public Long contar() {
        return repository.count();

    }


}
