package aula02.test;

import java.util.Scanner;

public class TesteEntradaDados {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;

        System.out.println("Entre com um valor:");
        a = scan.nextInt();

        System.out.println("Entre com outro valor:");
        b = scan.nextInt();

        System.out.println("A soma dos dois valores é: " + (a + b));

        scan.close();
    }
}
