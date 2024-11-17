package org.example;

public class TesteTributo {

    public static void main(String[] args) {

        Alimento alimento = new Alimento(1,"fruta com casca vermelha",5.55);
        Perfume perfume = new Perfume(2, "Doce Masculino",200.0, "Frutas Vermelhas");
        Servico servico = new Servico("Streaming", 29.90);
        Tributo carrinho = new Tributo();

        carrinho.adicionaTributavel(alimento);
        carrinho.adicionaTributavel(perfume);
        carrinho.adicionaTributavel(servico);

        carrinho.exibeItensCarrinho();
        System.out.println("O imposto é: " + carrinho.calculaTotalTributo());
    }
}
