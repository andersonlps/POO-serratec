package aula02.test;

import aula02.model.Aluno;

public class TesteAluno {
    public static void main(String[] args) {
        System.out.println("------------");
        Aluno aluno1 = new Aluno();
        aluno1.matricula = 123;
        aluno1.nome = "Anderson";
        aluno1.email = "anderson@gmail.com";

        System.out.println(aluno1.matricula + " - " + aluno1.nome + " - " + aluno1.email);


        Aluno aluno2 = new Aluno();
        Aluno aluno3 = aluno1;

        System.out.println("Aluno1: " + aluno1);
        System.out.println("Aluno2: " + aluno2);

        if (aluno1 ==aluno3) {
            System.out.println("Objetos iguais !");
        }else {
            System.out.println("Objetos diferentes !");
        }
    }
}
