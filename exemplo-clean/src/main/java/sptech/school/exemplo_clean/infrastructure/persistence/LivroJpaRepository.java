package sptech.school.exemplo_clean.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroJpaRepository extends JpaRepository<LivroEntity, Integer> {

    boolean existsByIsbn(String isbn);
}
