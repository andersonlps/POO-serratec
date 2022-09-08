package aula07.test;

import aula07.enums.PeriodoCurso;
import aula07.model.Curso;

public class TesteCurso {
    public static void main(String[] args) {
        Curso curso = new Curso("Biologia", PeriodoCurso.NOTURNO);

        System.out.println(curso.getNome());
        System.out.println(PeriodoCurso.NOTURNO.getDiasDaSemana());
    }
}
