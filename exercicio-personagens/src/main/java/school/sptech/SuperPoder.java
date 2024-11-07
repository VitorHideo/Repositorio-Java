package school.sptech;

public class SuperPoder {

  private String nome;
  private Integer categoria;

  public SuperPoder(String nome, Integer categoria) {
    this.nome = nome;
    this.categoria = categoria;
  }

  public SuperPoder() {

  }

  public String getNome() {
    return nome;
  }

  public Integer getCategoria() {
    return categoria;
  }

  @Override
  public String toString() {
    return "SuperPoder{" +
            "nome='" + nome + '\'' +
            ", categoria=" + categoria +
            '}';
  }
}
