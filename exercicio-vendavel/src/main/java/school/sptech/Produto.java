package school.sptech;

public abstract class Produto implements Vendavel {

    private final Integer codigo;
    private Double precoCusto;

    public Produto(Integer codigo, Double precoCusto) {
        this.codigo = codigo;
        this.precoCusto = precoCusto;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public Double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(Double precoCusto) {
        this.precoCusto = precoCusto;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", precoCusto=" + precoCusto +
                '}';
    }
}
