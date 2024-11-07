package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

  private List<Funcionario> funcionarios;

  public Empresa() {
    this.funcionarios = new ArrayList<>();
  }

  public void adicionaFunc(Funcionario funcionario) {
    funcionarios.add(funcionario);
  }

  public void exibeTodos() {
    for (Funcionario funcionario : funcionarios) {
      System.out.println(funcionario.getNome());
    }
  }

  public void exibeTotalSalario() {
    for (Funcionario funcionario : funcionarios) {
      System.out.println(funcionario.calcSalario());
    }
  }

  public List<Funcionario> getFuncionarios() {
    return funcionarios;
  }
}
