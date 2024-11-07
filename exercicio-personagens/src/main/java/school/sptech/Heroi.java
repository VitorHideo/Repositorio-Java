package school.sptech;

public class Heroi extends Personagem{

  public Heroi(String codinome, String nome) {
    super(codinome, nome);
  }

  public Heroi() {
  }

  @Override
  public Double getForcaTotal() {

    Double forcaTotal = 0.0;
    for (SuperPoder superPoder : getSuperPoderes()) {
      forcaTotal += superPoder.getCategoria();
    }
    Double adicionalHeroi = forcaTotal * 0.15;
    return forcaTotal + adicionalHeroi;
  }
}
