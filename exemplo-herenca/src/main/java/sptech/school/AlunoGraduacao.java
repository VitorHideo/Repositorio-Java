package sptech.school;

public class AlunoGraduacao extends Aluno {

    private Double notaMonografia;

    public AlunoGraduacao(String ra, String nome, Double nota1, Double nota2, Double notaMonografia) {
        super(ra, nome, nota1, nota2);
        this.notaMonografia = notaMonografia;
    }

    @Override
    public Double caculaMedia() {
        return (super.getNota1() + super.getNota2() + notaMonografia) / 3;
    }

    public void teste() {
        super.getRa();
    }
}
