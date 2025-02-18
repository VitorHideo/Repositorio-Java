package school.sptech.aula3;

import org.springframework.data.jpa.repository.JpaRepository;

/*
    Repository:
        Padrão de camada de persistencia...


       JpaRepository
       CRUDRepository
       PagebleANdSortingRepository

 */

public interface LivroRepository extends JpaRepository<Livro, Integer> {
}
