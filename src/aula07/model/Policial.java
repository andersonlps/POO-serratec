package aula07.model;

public class Policial {
    private String nome;
    private String matricula;

    public Policial(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Policial [matricula=" + matricula + ", nome=" + nome + "]";
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }
    
}
