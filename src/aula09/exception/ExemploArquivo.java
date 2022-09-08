package aula09.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExemploArquivo {
    public static void main(String[] args) throws Exception {
        int a=10, b=0;
        try {
            FileReader fr = new FileReader("/script.txt");
            System.out.println("Arquivo encontrado !");
            System.out.println(a/b);
            System.out.println(fr);
            
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado !");
        }catch (ArithmeticException e) {
            System.out.println("Erro divisão por zero !");
        }
    }
}
