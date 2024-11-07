package school.sptech;

public class Vilao extends Personagem{

  public Vilao(String codinome, String nome) {
    super(codinome, nome);
  }

  public Vilao() {
  }

  @Override
  public Double getForcaTotal() {
    Double forcaTotal = 0.0;
    for (SuperPoder superPoder : getSuperPoderes()) {
      forcaTotal += superPoder.getCategoria();
    }
    return forcaTotal;
  }
}
