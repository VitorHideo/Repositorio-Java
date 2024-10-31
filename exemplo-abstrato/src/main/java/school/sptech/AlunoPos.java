package school.sptech;

public class AlunoPos extends Aluno {

    private Double notaArtigo;

    public AlunoPos(String nome, String ra, Double notaEntrega, Double notaProva, Double notaArtigo) {
        super(nome, ra, notaEntrega, notaProva);
        this.notaArtigo = notaArtigo;
    }

    @Override
    public Double calcularNota() {
        return (super.notaEntrega + super.notaProva + notaArtigo) / 3.0;
    }

    public Double getNotaArtigo() {
        return notaArtigo;
    }

    public void setNotaArtigo(Double notaArtigo) {
        this.notaArtigo = notaArtigo;
    }
}
