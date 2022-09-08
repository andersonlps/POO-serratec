package aula08.exercicios.exe03;

import java.util.List;

public class Time {
    private String nomeTime;
    private String tecnico;
    private String diretor;
    private List<Atleta> atleta;

    @Override
    public String toString() {
        return "Time = " + nomeTime + " Atletas = " + atleta;
    }

    public Time(String nomeTime, String tecnico, String diretor, List<Atleta> atleta) {
        this.nomeTime = nomeTime;
        this.tecnico = tecnico;
        this.diretor = diretor;
        this.atleta = atleta;
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public String getTecnico() {
        return tecnico;
    }

    public String getDiretor() {
        return diretor;
    }

    public List<Atleta> getAtleta() {
        return atleta;
    }

    

}
