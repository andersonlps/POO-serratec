package aula07.test;

import aula07.enums.MarcaTV;
import aula07.model.TV;

public class TesteTV {
    public static void main(String[] args) {
        TV tv = new TV("Smart TV", 32., MarcaTV.SAMSUNG);

        System.out.println(tv);
    }
}
