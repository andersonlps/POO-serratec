package aula07.model;

import aula07.enums.PeriodoCurso;

public class Curso {
    private String nome;
    private PeriodoCurso periodo;

    public Curso(String nome, PeriodoCurso periodo) {
        this.nome = nome;
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return "Curso [nome=" + nome + ", periodoCurso=" + periodo + "]";
    }

    public String getNome() {
        return nome;
    }

    public PeriodoCurso getPeriodo() {
        return periodo;
    }

    
}
