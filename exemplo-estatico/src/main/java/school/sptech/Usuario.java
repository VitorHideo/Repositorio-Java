package school.sptech;

public class Usuario {

  // Atributos de classe
  private static int contagemUsuarios;
  // Atributos de instacia
  private String nome;

  public Usuario(String nome) {
    this.nome = nome;
    this.contagemUsuarios++;
  }

  public int getContagemUsuarios() {
    return contagemUsuarios;
  }

  public void setContagemUsuarios(int contagemUsuarios) {
    this.contagemUsuarios = contagemUsuarios;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}
