package aula08.test;

import java.util.ArrayList;
import java.util.List;

import aula08.model.Empregado;

public class ExemploEmpregado {
    public static void main(String[] args) {
        List<Empregado> empregados = new ArrayList<>();

        empregados.add(new Empregado("Anderson", "14523"));
        empregados.add(new Empregado("Andy", "158523"));
        empregados.add(new Empregado("Derson", "123528"));

        for (Empregado empregado : empregados) {
            System.out.println(empregado);
        }

    }
}
