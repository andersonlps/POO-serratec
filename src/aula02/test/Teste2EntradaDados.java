package aula02.test;

import java.util.Scanner;

public class Teste2EntradaDados {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String nome;
    int idade;
    double altura;
    
    System.out.println("Digite seu nome:");
    nome = scan.nextLine();

    System.out.println("Digite sua idade:");
    idade = scan.nextInt();

    System.out.println("Digite sua altura:");
    altura = scan.nextDouble();

    System.out.printf("%s tem %d anos e %.2f de altura", nome, idade, altura);

        scan.close();
    }
}
