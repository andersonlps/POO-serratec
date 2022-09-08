package aula07.exercicio;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class TesteClasses {
    public static void main(String[] args) {
        Tucano tucano = new Tucano("Tucano do Bico Preto", LocalDate.of(2022, 9, 5), "Preto/Amarelo", 3.);

        //Cavalo cavalo = new Cavalo("Marrom", LocalDate.of(2022, 10, 02), "MangaLarga", "Stanley");

        //Cachorro cachorro = new Cachorro("Pirata", LocalDate.of(2022, 12, 10), "Vira-Lata", true);

        tucano.emitirSom();

        System.out.println(tucano.getDataVacinacao());
        System.out.println();

        if (tucano.getDataVacinacao().getDayOfWeek() == DayOfWeek.SUNDAY) {
            System.out.println("Nda");
        }


    }
}
