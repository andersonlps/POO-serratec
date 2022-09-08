package aula09.exception;

public class TesteString {
    public static void main(String[] args) throws NullPointerException {
        String texto = null;

        try {
            //texto = texto.toUpperCase();
            System.out.println(texto);
            
        } catch (NullPointerException e) {
          System.out.println("Valor null na String");
        }
}
}
