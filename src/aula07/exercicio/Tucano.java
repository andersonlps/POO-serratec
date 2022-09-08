package aula07.exercicio;

import java.time.LocalDate;

public class Tucano extends Ave {
    private Double peso;

    public Tucano(String nome, LocalDate dataVacinacao, String cor, Double peso) {
        super(nome, dataVacinacao, cor);
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Tucano [peso=" + peso + "som" + emitirSom() + "]";
    }

    public Double getPeso() {
        return peso;
    }

    @Override
    public String voar() {
        return "Vroaarrrrrr";
    }

    @Override
    public String emitirSom() { 
        return "Tuco Tuco";
    }

}
