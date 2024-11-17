package org.example;

public class Alimento extends Produto {

    private Integer qtdVitamina;


    public Alimento(Integer codigo, String descricao, Double preco) {
        super(codigo, descricao, preco);
    }

    @Override
    public Double getValorTributo() {
        return getPreco() * 0.15;
    }
}
