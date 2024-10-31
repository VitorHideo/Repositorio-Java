package school.sptech;

// Classe abstrata é uma ideia
// Não pode ser instanciada!!!
public abstract class Aluno {

    protected String nome;
    protected String ra;
    protected Double notaEntrega;
    protected Double notaProva;


    public Aluno(String nome, String ra, Double notaEntrega, Double notaProva) {
        this.nome = nome;
        this.ra = ra;
        this.notaEntrega = notaEntrega;
        this.notaProva = notaProva;
    }

    public Aluno() {
    }

    // Metodo abstrato não tem corpo
    // É apenas uma ideia
    public abstract Double calcularNota();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public Double getNotaEntrega() {
        return notaEntrega;
    }

    public void setNotaEntrega(Double notaEntrega) {
        this.notaEntrega = notaEntrega;
    }

    public Double getNotaProva() {
        return notaProva;
    }

    public void setNotaProva(Double notaProva) {
        this.notaProva = notaProva;
    }
}
