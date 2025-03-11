package school.sptech.exemplo_service.service;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import school.sptech.exemplo_service.entity.Musica;
import school.sptech.exemplo_service.exception.EntendidadeNaoEncontradaException;
import school.sptech.exemplo_service.exception.EntidadeConflitoException;
import school.sptech.exemplo_service.repository.MusicaRepository;

import java.util.List;
import java.util.Optional;

//Singleton
//COMPONETE - Tem lógica mas que gerencia é o Spring
@Service // indica para o spring que objetod dessa classe são da gerencia dele
public class MusicaService {

    //@Autowired
    //private MusicaRepository repository;

    private final MusicaRepository repository;

    public MusicaService(MusicaRepository repository) {
        this.repository = repository;
    }

    public List<Musica> listar(){
        return repository.findAll();
    }

    public Musica cadastrar(Musica musica){

        if (repository.existsByNomeIgnoreCase(musica.getNome())){
            throw new EntidadeConflitoException("Musica já cadastrada");
        }

        Musica musicaRegistrada = repository.save(musica);
        return musicaRegistrada;
    }

    public Musica buscarPorId(Integer id){
        Optional<Musica> optMusica = repository.findById(id);
        if (optMusica.isPresent()){
            return optMusica.get();
        }
        throw new EntendidadeNaoEncontradaException("Não encontrado");
    }
}
