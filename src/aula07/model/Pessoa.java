package aula07.model;

import aula07.enums.EstadoCivil;

public class Pessoa {
    private String nome;
    private String telefone;
    private EstadoCivil estadoCivil;
    private Setor setor;

    public Pessoa(String nome, String telefone, EstadoCivil estadoCivil, Setor setor) {
        this.nome = nome;
        this.telefone = telefone;
        this.estadoCivil = estadoCivil;
        this.setor = setor;
    }


    @Override
    public String toString() {
        return "Pessoa [estadoCivil=" + estadoCivil + ", nome=" + nome + " ]" + " " + setor + ", telefone=" + telefone
                + "]";
    }



    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public Setor getSetor() {
        return setor;
    }


}
