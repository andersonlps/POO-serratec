package aula08.listas;

import java.util.Arrays;
import java.util.List;

public class ExemploListaArrays {
    public static void main(String[] args) {
        List<String> cores = Arrays.asList("Amarelo", "Verde", "Azul");

        if (cores.isEmpty()) {
            System.out.println("A lista está vazia !");
        }else {
            System.out.println(cores);
        }

        for (int i = 0; i < cores.size(); i++) {
            if (cores.get(1).equalsIgnoreCase("verde"));
        }
    }

}
