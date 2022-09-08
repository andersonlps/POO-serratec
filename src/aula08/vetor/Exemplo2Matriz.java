package aula08.vetor;

public class Exemplo2Matriz {
    public static void main(String[] args) {
        String pessoas[][] = {{"Marcos", "m@gmail.com"},
                              {"Marcia", "maria@gmail.com"},
                              {"Carlos", "carlos@gmail.com"},
                              {"Adriano", "adriano@gmail.com"}};

        for (int linha = 0; linha < pessoas.length; linha++) {
            System.out.println("*******************");
            for (int coluna = 0; coluna < pessoas[linha].length; coluna++) {
                System.out.println(pessoas[linha][coluna]);
            }
        }



    }
}
