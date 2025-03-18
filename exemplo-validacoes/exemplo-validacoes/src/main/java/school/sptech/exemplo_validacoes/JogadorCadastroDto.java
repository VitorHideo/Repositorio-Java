package school.sptech.exemplo_validacoes;

import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

public class JogadorCadastroDto {

    @NotBlank
    @Length(min = 3, max = 255)
    private String nome;

    @NotBlank
    @Email
    private String email;

    @CPF(message = "CPF inválido")
    @NotNull
    private String cpf;

    @Min(1)
    @Max(100)
    @NotNull
    private Integer camisa;

    private String posicao;

    @Past
    private LocalDate dataNascimento;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getCamisa() {
        return camisa;
    }

    public void setCamisa(Integer camisa) {
        this.camisa = camisa;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
