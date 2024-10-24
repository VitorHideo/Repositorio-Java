package sptech.school.primitivo;

public class Pessoa {

    //String não tem equivalente primitivo.
    private String nome;


    //private Integer idade;
    //private Double altura;
    //private Boolean maiorIdade;

    private int idade;
    private double altura;
    private boolean maiorIdade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Boolean getMaiorIdade() {
        return maiorIdade;
    }

    public void setMaiorIdade(Boolean maiorIdade) {
        this.maiorIdade = maiorIdade;
    }

    @Override //Estamos adaptado o metodo passado por herança
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                ", maiorIdade=" + maiorIdade +
                '}';
    }
}
