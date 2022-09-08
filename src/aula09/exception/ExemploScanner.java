package aula09.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        try {
            lerDados();
            System.out.println("Você digitou");
            
        } catch (InputMismatchException e) {
            System.out.println("Digite um número");
        }
    }


    public static Integer lerDados() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = scan.nextInt();
        scan.close();
        return numero;
   
    }
}
