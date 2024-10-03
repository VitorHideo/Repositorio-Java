package org.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Livro {

    @JsonProperty("id")
    private int id;
    @JsonProperty("name")
    private String nome;
    @JsonProperty("author")
    private String autor;
    private String dataPublicacao;
    @JsonProperty("publisher")
    private String editora;
    @JsonProperty("price")
    private double preco;
    private double precoDesconto;
    @JsonProperty("rating")
    private double nota;

    public Livro() {
    }

    public Livro(int id, String nome, String autor, String dataPublicacao, String editora, double preco, double precoDesconto, double nota) {
        this.id = id;
        this.nome = nome;
        this.autor = autor;
        this.dataPublicacao = dataPublicacao;
        this.editora = editora;
        this.preco = preco;
        this.precoDesconto = precoDesconto;
        this.nota = nota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPrecoDesconto() {
        return precoDesconto;
    }

    public void setPrecoDesconto(double precoDesconto) {
        this.precoDesconto = precoDesconto;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", dataPublicacao='" + dataPublicacao + '\'' +
                ", editora='" + editora + '\'' +
                ", preco=" + preco +
                ", precoDesconto=" + precoDesconto +
                ", nota=" + nota +
                '}';
    }
}
