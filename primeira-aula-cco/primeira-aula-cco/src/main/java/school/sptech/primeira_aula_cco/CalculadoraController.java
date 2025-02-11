package school.sptech.primeira_aula_cco;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculos")
public class CalculadoraController {

    private int contador;

    /*
        Integer = Wrapper
        int = primitivo

        Integer é um objeto
        int é uma representação de valor

        Wrapper permite null...
        primeitivo não permite

     */

    @GetMapping("/contar")
    public int contar() {
        return ++contador;
    }

    @GetMapping("/somar/{numero1}/{numero2}")
    public int somar (@PathVariable Integer numero1, @PathVariable Integer numero2){
        int resultado = numero1 + numero2;

        return resultado;
    }
}
