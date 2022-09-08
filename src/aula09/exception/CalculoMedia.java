package aula09.exception;

public class CalculoMedia {
    public static int calculoMedia(int num1, int num2) {
        if (num2 ==0) {
            throw new ArithmeticException("Você digitou zero no segundo parâmetro");
        }
        return num1/num2;
    }

    public static int calcularMedia(int num1, int num2) throws ArithmeticException {
        return num1/num2;
    }
}
