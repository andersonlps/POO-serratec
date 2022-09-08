package aula08.set;

//import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
    public static void main(String[] args) {
        //Set<String> cores = new HashSet<>();
        Set<String> cores = new TreeSet<>();

        cores.add("Azul");
        cores.add("Azul");
        cores.add("Amarelo");
        cores.add("Laranja");
        cores.add("Preto");
        System.out.println(cores);
    }
}
