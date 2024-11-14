package school.sptech;

import java.util.Scanner;

public class TesteCarrinho {
    public static void main(String[] args) {

        Carrinho carrinho = new Carrinho();
        Scanner scannerString = new Scanner(System.in);
        Scanner scannerNum = new Scanner(System.in);

        Boolean continuar = true;

        while (continuar) {
            System.out.println("""
                    Escolha uma opção:
                    1. Adicionar livro,
                    2. Adicionar DVD,
                    3. Adicionar serviço,
                    4. Exibir Itens do carrinho,
                    5. Exibir total da venda,
                    6. fim
                    """);
            Integer escolha = scannerNum.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Digite o codigo");
                    Integer livroCodigo = scannerNum.nextInt();
                    System.out.println("Digite o preco de custo:");
                    Double livroCusto = scannerNum.nextDouble();
                    System.out.println("Digite o nome do livro");
                    String livroNome = scannerString.nextLine();
                    System.out.println("Digite o autor do livro");
                    String livroAutor = scannerString.nextLine();
                    System.out.println("Digite o isbn");
                    String livroIsbn = scannerString.nextLine();
                    Livro livro = new Livro(livroCodigo,livroCusto,livroNome,livroAutor,livroIsbn);
                    carrinho.adicionaVendavel(livro);
                    break;

                case 2:
                    System.out.println("Digite o codigo");
                    Integer dvdCodigo = scannerNum.nextInt();
                    System.out.println("Digite o preco de custo:");
                    Double dvdCusto = scannerNum.nextDouble();
                    System.out.println("Digite o nome do dvd");
                    String dvdNome = scannerString.nextLine();
                    System.out.println("Digite o nome da gravadora");
                    String dvdGravadora = scannerString.nextLine();
                    DVD dvd = new DVD(dvdCodigo, dvdCusto, dvdNome, dvdGravadora);
                    carrinho.adicionaVendavel(dvd);
                    break;

                case 3:
                    System.out.println("Digite a descrição do serviço");
                    String servicoDescricao = scannerString.nextLine();
                    System.out.println("Digite o codigo");
                    Integer servicoCodigo = scannerNum.nextInt();
                    System.out.println("Digite a qtd horas");
                    Integer servicoHoras = scannerNum.nextInt();
                    System.out.println("Digite o valor hora");
                    Double servicoValor = scannerNum.nextDouble();
                    Servico servico = new Servico(servicoDescricao,servicoCodigo,servicoHoras,servicoValor);
                    carrinho.adicionaVendavel(servico);
                    break;

                case 4:
                    System.out.println("Exibindo todos itens do carrinho");
                    carrinho.exibeItensCarrinho();
                    break;

                case 5:
                    System.out.println("Exibindo total de vendas");
                    carrinho.calculaTotalVenda();
                    break;

                case 6:
                    continuar = false;
                    break;
            }
        }
    }
}