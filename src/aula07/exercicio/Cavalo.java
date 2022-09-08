package aula07.exercicio;

import java.time.LocalDate;

public class Cavalo extends Mamifero implements AnimalCompeticao {
    private String marcaFerradura;

    public Cavalo(String nome, LocalDate dataVacinacao, String raca, String marcaFerradura) {
        super(nome, dataVacinacao, raca);
        this.marcaFerradura = marcaFerradura;
    }

    public String getMarcaFerradura() {
        return marcaFerradura;
    }

    @Override
    public void amamentar() {
       
    }

    @Override
    public String emitirSom() {
        return null;
    }

    @Override
    public void trocarFerradura() {
        
    }

    @Override
    public void viajar() {
        
    }

    
}
