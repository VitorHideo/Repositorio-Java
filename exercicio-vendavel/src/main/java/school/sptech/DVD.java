package school.sptech;

public class DVD extends Produto{

    private String nome;
    private String gravadora;

    public DVD(Integer codigo, Double precoCusto, String nome, String gravadora) {
        super(codigo, precoCusto);
        this.nome = nome;
        this.gravadora = gravadora;
    }

    @Override
    public Double getValorVenda() {
        return (super.getPrecoCusto() * 0.2) + super.getPrecoCusto();
    }

    @Override
    public String toString() {
        return "DVD{" +
                "nome='" + nome + '\'' +
                ", gravadora='" + gravadora + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public String getGravadora() {
        return gravadora;
    }
}
