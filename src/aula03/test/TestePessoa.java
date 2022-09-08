package aula03.test;

import java.util.Scanner;

import aula03.model.Pessoa;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setAltura(1.71);
        pessoa.setCodigo(6);
        pessoa.setNome("Anderson");
        pessoa.setPeso(82.);

        Pessoa pessoa2 = new Pessoa(10, "Ana", 60., 1.60);

        pessoa.resultadoIMC();
        pessoa2.resultadoIMC();

        System.out.println(pessoa.getNome() + " " + pessoa.resultadoIMC());
        System.out.println(pessoa2.getNome() + " " + pessoa2.resultadoIMC());


        for (int i = 0; i <= 1; i++) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Digite o código:");
            int codigo = scan.nextInt();
            System.out.println("Digite seu nome:");
            String nome = scan.next();
            System.out.println("Digite seu peso:");
            Double peso = scan.nextDouble();
            System.out.println("Digite sua altura:");
            Double altura = scan.nextDouble();

            Pessoa pessoa3 = new Pessoa(codigo, nome, peso, altura);
            System.out.println("O resultado é: " + pessoa3.resultadoIMC());
        
            scan.close();
        }

        

    }
}
