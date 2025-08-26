package sptech.school.exemplo_clean.infrastructure.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sptech.school.exemplo_clean.core.application.usecase.CriarLivroUseCase;
import sptech.school.exemplo_clean.infrastructure.persistence.LivroJpaAdapter;

@Configuration
public class LivroBeenConfig {

    @Bean
    public CriarLivroUseCase criarLivroUseCase(LivroJpaAdapter adapter){
        return new CriarLivroUseCase(adapter);
    }

}
