package aula03.test;

import java.util.Scanner;

import aula03.model.Produto;

public class TesteProduto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o código:");
            int codigo = scan.nextInt();

            System.out.println("Digite a descricao do produto:");
            String descricao = scan.next();

            System.out.println("Digite seu peso:");
            Double valor = scan.nextDouble();

            Produto produto = new Produto(codigo, descricao, valor);

            System.out.println(produto.getCodigo() + " " + produto.getValor());

            System.out.println("Total de produtos cadastrados: " + Produto.getTotalProdutos());
        }

        scan.close();
    }
}
