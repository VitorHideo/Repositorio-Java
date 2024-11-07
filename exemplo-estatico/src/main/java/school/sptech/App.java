package school.sptech;

public class App {

  //public: modificador de acesso
  //static: metodo da classe
  //void: tipo de retorno
  //main: nome do metodo
  //String[]: vetor de strings
  //args: nome do argumento
  public static void main(String[] args) {

    Usuario usuario1 = new Usuario("Diego");
    Usuario usuario2 = new Usuario("Xamps");

    //1
    System.out.println(usuario1.getContagemUsuarios());
    //1
    System.out.println(usuario2.getContagemUsuarios());

    Integer resultado = Calculadora.soma(2,3);

  }
}