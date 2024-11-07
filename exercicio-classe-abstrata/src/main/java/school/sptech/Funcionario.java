package school.sptech;

public abstract class Funcionario {

  private String cpf;
  private String nome;

  public abstract Double calcSalario();

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  @Override
  public String toString() {
    return "Fucionario{" +
            "cpf='" + cpf + '\'' +
            ", nome='" + nome + '\'' +
            '}';
  }
}
