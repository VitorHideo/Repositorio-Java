package school.sptech;

import java.util.ArrayList;
import java.util.List;

public abstract class Personagem {

  private String codinome;
  private String nome;
  private List<SuperPoder> superPoderes;

  public Personagem(String codinome, String nome) {
    this.codinome = codinome;
    this.nome = nome;
    this.superPoderes = new ArrayList<>();
  }

  public Personagem() {

  }

  public void adicionaPoder (String nome , Integer categoria) {
    SuperPoder superPoder = new SuperPoder(nome, categoria);
    superPoderes.add(superPoder);
  }

  public abstract Double getForcaTotal();

  public String getCodinome() {
    return codinome;
  }

  public String getNome() {
    return nome;
  }

  public List<SuperPoder> getSuperPoderes() {
    return superPoderes;
  }

  @Override
  public String toString() {
    return "Personagem{" +
            "codinome='" + codinome + '\'' +
            ", nome='" + nome + '\'' +
            ", superPoderes=" + superPoderes +
            '}';
  }
}
