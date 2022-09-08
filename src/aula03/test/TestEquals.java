package aula03.test;

import java.util.Scanner;

public class TestEquals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scan.nextLine();

        if (nome.equals("M")) {
            System.out.println("Esse é o cara");
        }else {
            System.out.println("Só mais um");
        }
        scan.close();
    }
}
