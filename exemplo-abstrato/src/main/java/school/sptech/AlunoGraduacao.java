package school.sptech;

public class AlunoGraduacao extends Aluno {

    private Double notaTcc;
    private Double notaSprint;

    public AlunoGraduacao(String nome, String ra, Double notaEntrega, Double notaProva, Double notaTcc, Double notaSprint) {
        super(nome, ra, notaEntrega, notaProva);
        this.notaTcc = notaTcc;
        this.notaSprint = notaSprint;
    }

    @Override
    public Double calcularNota() {
        return (super.notaEntrega + super.notaProva + notaSprint + notaTcc) / 4;
    }

    public Double getNotaTcc() {
        return notaTcc;
    }

    public void setNotaTcc(Double notaTcc) {
        this.notaTcc = notaTcc;
    }

    public Double getNotaSprint() {
        return notaSprint;
    }

    public void setNotaSprint(Double notaSprint) {
        this.notaSprint = notaSprint;
    }
}
