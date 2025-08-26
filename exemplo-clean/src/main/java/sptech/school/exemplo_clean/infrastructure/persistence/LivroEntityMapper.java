package sptech.school.exemplo_clean.infrastructure.persistence;

import sptech.school.exemplo_clean.core.domain.Livro;

import java.util.Objects;

public class LivroEntityMapper {

    public static LivroEntity ofDomain(Livro livro){

        if (Objects.isNull(livro)){
            return null;
        }

        LivroEntity entity = new LivroEntity();
        entity.setId(livro.getId());
        entity.setTitulo(livro.getTitulo());
        entity.setIsbn(livro.getIsbn());

        return entity;
    }

    public static Livro ofEntity(LivroEntity entity){

        if (Objects.isNull(entity)){
            return null;
        }

        Livro dominio = new Livro();
        dominio.setId(entity.getId());
        dominio.setTitulo(entity.getTitulo());
        dominio.setIsbn(entity.getIsbn());

        return dominio;
    }
}
