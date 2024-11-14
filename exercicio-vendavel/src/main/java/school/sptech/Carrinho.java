package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<Vendavel> cart;

    public Carrinho() {
        this.cart = new ArrayList<>();
    }

    public void adicionaVendavel(Vendavel vendavel){
        cart.add(vendavel);
    }

    public Double calculaTotalVenda() {
        Double total = 0.0;

        for (Vendavel vendavel : cart) {
            total += vendavel.getValorVenda();
        }
        return total;
    }

    public void exibeItensCarrinho() {
        for (Vendavel vendavel : cart) {
            if (vendavel instanceof Livro) {
                System.out.println("Nome do livro:" + ((Livro) vendavel).getNome() + " Autor do livro: " + ((Livro) vendavel).getAutor());
            } else if (vendavel instanceof Servico) {
                System.out.println("Descrição do serviço: " + ((Servico) vendavel).getDescricao());
            } else if (vendavel instanceof DVD) {
                System.out.println("Nome do DVD: " + ((DVD) vendavel).getNome() + " Nome da Gravadora: " + ((DVD) vendavel).getGravadora());
            }
        }
    }
}
