package school.sptech.exemplo_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import school.sptech.exemplo_service.entity.Musica;

import java.util.Optional;

public interface MusicaRepository extends JpaRepository<Musica, Integer> {

    Boolean existsByNomeIgnoreCase (String nome);
    //Optional<Musica> findBynome (String nome);
}
