package aula09.exception;

public class TesteDivisao {
    public static void main(String[] args) {
        try {
            System.out.println(CalculoMedia.calcularMedia(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Erro! Divisão por zero! Verifique seu código");
            e.printStackTrace();
        }finally {
            System.out.println("Sempre é executado independente se cair ou não no catch");
        }
        System.out.println(CalculoMedia.calculoMedia(10, 0));
    }
}
