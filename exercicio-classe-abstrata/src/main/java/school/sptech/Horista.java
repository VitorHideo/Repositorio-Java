package school.sptech;

public class Horista extends Funcionario {

  private Integer qtdHora;
  private Double valorHora;

  @Override
  public Double calcSalario() {
    return qtdHora * valorHora;
  }

  public Integer getQtdHora() {
    return qtdHora;
  }

  public void setQtdHora(Integer qtdHora) {
    this.qtdHora = qtdHora;
  }

  public Double getValorHora() {
    return valorHora;
  }

  public void setValorHora(Double valorHora) {
    this.valorHora = valorHora;
  }

  @Override
  public String toString() {
    return "Horista{" +
            "qtdHora=" + qtdHora +
            ", valorHora=" + valorHora +
            "} " + super.toString();
  }
}
