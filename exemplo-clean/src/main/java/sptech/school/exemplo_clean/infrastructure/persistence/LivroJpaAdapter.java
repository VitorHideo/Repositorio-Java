package sptech.school.exemplo_clean.infrastructure.persistence;

import org.springframework.stereotype.Service;
import sptech.school.exemplo_clean.core.domain.Livro;

@Service
public class LivroJpaAdapter implements sptech.school.exemplo_clean.adpters.LivroGateway {

    private final LivroJpaRepository repository;

    public LivroJpaAdapter(LivroJpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public Livro save(Livro livro) {
        LivroEntity livroEtentity = repository.save(LivroEntityMapper.ofDomain(livro));
        return LivroEntityMapper.ofEntity(livroEtentity);
    }

    @Override
    public boolean existeByIsbn(String isbn) {
        return repository.existsByIsbn(isbn);
    }
}
