package school.sptech;

public class App {
  public static void main(String[] args) {

    Heroi heroi1 = new Heroi("Homem aranha", "Peter Parker");
    heroi1.adicionaPoder("Andar em paredes", 2);
    Heroi heroi2 = new Heroi("batman", "Bruce Wayner");
    heroi2.adicionaPoder("Dinheiro",9);

    Vilao vilao1 = new Vilao("Tobi", "Obito");
    vilao1.adicionaPoder("kamui",8);
    Vilao vilao2 = new Vilao("coringa","Arthur fleck");
    vilao2.adicionaPoder("Gás do riso",9);


    Confronto.lutar(heroi1,vilao1);
    Confronto.lutar(heroi2,vilao2);
  }
}