package school.sptech;

public class Servico implements Vendavel {

    private String descricao;
    private final Integer codigo;
    private Integer qtdHoras;
    private Double valorHora;

    public Servico(String descricao, Integer codigo, Integer qtdHoras, Double valorHora) {
        this.descricao = descricao;
        this.codigo = codigo;
        this.qtdHoras = qtdHoras;
        this.valorHora = valorHora;
    }

    @Override
    public Double getValorVenda() {
        return qtdHoras * valorHora;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Servico{");
        sb.append("descricao='").append(descricao).append('\'');
        sb.append(", codigo=").append(codigo);
        sb.append(", qtdHoras=").append(qtdHoras);
        sb.append(", valorHora=").append(valorHora);
        sb.append('}');
        return sb.toString();
    }

    public String getDescricao() {
        return descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public Integer getQtdHoras() {
        return qtdHoras;
    }

    public Double getValorHora() {
        return valorHora;
    }
}
