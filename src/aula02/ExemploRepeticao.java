package aula02;

public class ExemploRepeticao {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;

        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("-----------------------------------");

        do {
            System.out.println(j);
            j++;
        } while (j <= 10);

        System.out.println("-----------------------------------");

        for (i = 0; i <= 10; i++) {
            System.out.println(i);
            
        }

        for (i = 0; i <= 10; i++) {
            if (i >= 5 && i <=6) {
                continue;
            }
            System.out.println(i);
            
        }

        

    }


}
