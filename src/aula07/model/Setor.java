package aula07.model;

public class Setor {
    private int numero;
    private String descricao;

    public Setor(int numero, String descricao) {
        this.numero = numero;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Setor [descricao=" + descricao + ", numero=" + numero + "]";
    }

    public int getNumero() {
        return numero;
    }

    public String getDescricao() {
        return descricao;
    }

    

}
