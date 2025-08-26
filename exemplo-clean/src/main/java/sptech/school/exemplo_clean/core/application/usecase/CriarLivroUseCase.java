package sptech.school.exemplo_clean.core.application.usecase;

import sptech.school.exemplo_clean.core.application.command.CriarLIvroCommand;
import sptech.school.exemplo_clean.core.application.exeption.DuplicacaoExeption;
import sptech.school.exemplo_clean.core.domain.Livro;
import sptech.school.exemplo_clean.adpters.LivroGateway;

public class CriarLivroUseCase {

    private final LivroGateway gateway;

    public CriarLivroUseCase(LivroGateway gateway) {
        this.gateway = gateway;
    }

    public Livro execute(CriarLIvroCommand command){

        if (gateway.existeByIsbn(command.isbn())){
            throw new DuplicacaoExeption("Esse ISBN já foi cadastrado");
        }

        Livro livro = new Livro();

        livro.setTitulo(command.titulo());
        livro.setIsbn(command.isbn());

        gateway.save(livro);

        return null;
    }
}
