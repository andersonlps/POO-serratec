package aula02;

public class CalcularMedia {
    public static void main(String[] args) {
        double num1 = 10.0;
        Double num2 = 8.0;
        Double media = (num1 + num2) / 2;

        System.out.println(media);

        //Tranformar uma variável primitiva em outra variável
        int num3 = (int)num1;
        System.out.println(num3);
    }
}
