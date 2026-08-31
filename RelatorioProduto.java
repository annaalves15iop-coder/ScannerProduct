package exercicio;

import java.util.Scanner;

public class RelatorioEstoque {

    public static void main(String[] args) {

        // Cria o Scanner para receber dados pelo teclado
        Scanner entrada = new Scanner(System.in);

        // Pergunta quantos produtos serão analisados
        System.out.print("Quantos produtos deseja analisar? ");
        int quantidadeProdutos = entrada.nextInt();

        // Contadores
        // Começam com zero porque ainda não analisamos nenhum produto
        int estoqueSuficiente = 0;
        int estoqueBaixo = 0;
        int semEstoque = 0;

        // Acumulador
        // Será utilizado para somar o valor dos produtos
        double valorTotalEstoque = 0;

        // O FOR será responsável pela repetição
        // Começa em 1
        // Continua enquanto i for menor ou igual à quantidade
        // Aumenta 1 a cada repetição
        for (int i = 1; i <= quantidadeProdutos; i++) {

            System.out.println("\n======================");
            System.out.println("PRODUTO " + i);
            System.out.println("======================");

            // Limpa o ENTER deixado pelo nextInt
            entrada.nextLine();

            // Solicita o nome do produto
            System.out.print("Nome: ");
            String nome = entrada.nextLine();

            // Solicita o preço
            System.out.print("Preço: R$ ");
            double preco = entrada.nextDouble();

            // Solicita a quantidade
            System.out.print("Quantidade em estoque: ");
            int quantidade = entrada.nextInt();

            // Calcula o valor deste produto no estoque
            double valorProduto = preco * quantidade;

            // Soma o valor do produto ao valor total
            valorTotalEstoque = valorTotalEstoque + valorProduto;

            // Verifica a situação do estoque
            if (quantidade >= 20) {

                System.out.println("Situação: Estoque suficiente.");

                // Soma 1 ao contador
                estoqueSuficiente++;

            } else if (quantidade > 0) {

                System.out.println("Situação: Estoque baixo.");

                // Soma 1 ao contador
                estoqueBaixo++;

            } else {

                System.out.println("Situação: Sem estoque.");

                // Soma 1 ao contador
                semEstoque++;
            }

            // Mostra o valor daquele produto
            System.out.println("Valor em estoque: R$ " + valorProduto);
        }

        // Esta parte está FORA do for.
        // Portanto, será executada somente depois
        // que todos os produtos forem analisados.

        System.out.println("\n==========================");
        System.out.println("   RELATÓRIO DO ESTOQUE");
        System.out.println("==========================");

        System.out.println("Produtos analisados: " + quantidadeProdutos);

        System.out.println(
                "Estoque suficiente: " + estoqueSuficiente);

        System.out.println(
                "Estoque baixo: " + estoqueBaixo);

        System.out.println(
                "Sem estoque: " + semEstoque);

        System.out.println(
                "Valor total do estoque: R$ " + valorTotalEstoque);

        // Fecha o Scanner
        entrada.close();
    }
}
