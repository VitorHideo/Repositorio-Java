package school.sptech.status_buscas_cco;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface MusicaRepository extends JpaRepository<Musica, Integer> {

    List<Musica> findByNomeContainingIgnoreCase(String nome);

    List<Musica> findByDataLancamentoBefore(LocalDate date);

    List<Musica> findByNotaGreaterThanEqual(Double nota);

    Integer countByArtista(String nome);

    Musica findTop1ByOrderByNotaDesc();
}
