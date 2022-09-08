package aula08.vetor;

import aula08.model.Empregado;

public class VetorEmpregado {
    public static void main(String[] args) {
        //Empregado empregado1 = new Empregado("Anderson", "21977778888");
        //Empregado empregado2 = new Empregado("Ana", "21966655541");
        Empregado[] empregados = new Empregado[3];
        empregados[0] = new Empregado("João", "213");
        empregados[1] = new Empregado("Maria", "852");
        empregados[2] = new Empregado("Lucas", "74587");

        for (Empregado empregado : empregados) {
            System.out.println(empregado);
        }

    }
}
