package school.sptech.exemplo_service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EntendidadeNaoEncontradaException extends RuntimeException{

    public EntendidadeNaoEncontradaException(String message) {
        super(message);
    }


}
