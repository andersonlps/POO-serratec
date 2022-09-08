package aula08.exercicios.exe03;

import java.util.ArrayList;
import java.util.List;

public class TesteTime {
    public static void main(String[] args) {
        List<Atleta> atletas = new ArrayList<>();
        atletas.add(new Atleta("Pedro", 26, "Pivo"));
        atletas.add(new Atleta("Heitor", 20, "Fixo"));
        atletas.add(new Atleta("João", 26, "Ala"));
        atletas.add(new Atleta("Miguel", 26, "Ala"));
        atletas.add(new Atleta("Bernardo", 26, "Goleiro"));

        Time time = new Time("Vasco", "Anderson", "Lopes", atletas);

        System.out.println(time);


    }
}
