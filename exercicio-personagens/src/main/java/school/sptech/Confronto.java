package school.sptech;

public class Confronto {

  public static void lutar(Heroi heroi, Vilao vilao) {

    if (heroi.getForcaTotal() > vilao.getForcaTotal()) {
      System.out.println("O vencedor foi o: " + heroi.getNome());
    } else if (vilao.getForcaTotal() > heroi.getForcaTotal()) {
      System.out.println("O vencedor foi o: " + vilao.getNome());
    } else {
      System.out.println("O " + heroi.getNome() + " e o " + vilao.getNome() + " empataram");
    }
  }
}
