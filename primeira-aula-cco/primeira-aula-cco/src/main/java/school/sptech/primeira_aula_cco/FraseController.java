package school.sptech.primeira_aula_cco;

/*
    Req e Res
    API REST:
        Controladoras (Controllers)

    Portaria... Recebe solicitações...

    MVC: Model View Controller
    RestController
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Indicado para o spring que ele deve cuidar dos objs gerados por essa anotação
@RequestMapping("/frases") // Sempre no plural
public class FraseController {

    //Não é um metodo convencional...
    //Endpoint: um pedaço logico que é acessivel através da rede
    @GetMapping("/saudacao") //localhost:8080/saudacao
    public String saudacao() {
        return "Olá mundo...";
    }

    @GetMapping("/saudacao/{nome}")
    public String saudacao2(@PathVariable String nome) {
        return "Olá %s".formatted(nome);
    }

    @GetMapping("/saudacao/boa-noite")
    public String boaNoite() {
        return "Boa Noite";
    }

    //Controller podem ter metodos comuns
    public String teste() {
        return "Isso é um metodo comum";
    }

}
