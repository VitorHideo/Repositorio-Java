package school.sptech;

public class Vendedor extends Funcionario {

  private Double vendas;
  private Double taxas;

  @Override
  public Double calcSalario() {
    return vendas * taxas;
  }

  public Double getVendas() {
    return vendas;
  }

  public void setVendas(Double vendas) {
    this.vendas = vendas;
  }

  public Double getTaxas() {
    return taxas;
  }

  public void setTaxas(Double taxas) {
    this.taxas = taxas;
  }

  @Override
  public String toString() {
    return "Vendedor{" +
            "vendas=" + vendas +
            ", taxas=" + taxas +
            '}';
  }
}
