package aula08.varArgs;

public class ExemploVarArgs {
    public static void main(String[] args) {
        
        System.out.println(somaNumeros(10, 25, 62, 25));
        
    }

    public static int somaNumeros(int... numeros) {
        int soma =0;
        for (int valor : numeros) {
            soma += valor;
        }
        return soma;
    }
}
