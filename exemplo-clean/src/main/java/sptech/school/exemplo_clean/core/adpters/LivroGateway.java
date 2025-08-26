package sptech.school.exemplo_clean.adpters;

import sptech.school.exemplo_clean.core.domain.Livro;

public interface LivroGateway {

    Livro save(Livro livro);
    boolean existeByIsbn(String isbn);
}
