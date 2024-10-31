package school.sptech;

public class AlunoDoutorado extends Aluno {

    private Double notaTese;

    public AlunoDoutorado(String nome, String ra, Double notaEntrega, Double notaProva, Double notaTese) {
        super(nome, ra, notaEntrega, notaProva);
        this.notaTese = notaTese;
    }

    @Override
    public Double calcularNota() {
        return (super.notaEntrega + super.notaProva + notaTese) / 3;
    }

    public Double getNotaTese() {
        return notaTese;
    }

    public void setNotaTese(Double notaTese) {
        this.notaTese = notaTese;
    }
}
