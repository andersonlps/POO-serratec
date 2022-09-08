package aula08.exercicios.exe03;

public class Atleta {
    private String nome;
    private int idade;
    private String posicao;
    
    @Override
    public String toString() {
        return " [nome: " + nome + " idade:" + idade + " posicao:" + posicao + "]";
    }

    public Atleta(String nome, int idade, String posicao) {
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getPosicao() {
        return posicao;
    }


}
