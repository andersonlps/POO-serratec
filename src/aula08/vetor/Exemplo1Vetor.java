package aula08.vetor;

public class Exemplo1Vetor {
    public static void main(String[] args) {
    String[] vetor = new String[3];
    vetor[0] = "Anderson";
    System.out.println(vetor[0]);

    String[] meses = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun"};

    for (String mes : meses) {
        System.out.println(mes);
    }

    }
}