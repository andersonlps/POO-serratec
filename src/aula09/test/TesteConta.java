package aula09.test;

import aula09.model.Poupanca;

public class TesteConta {
    public static void main(String[] args) {
        Poupanca poupanca = new Poupanca("Anderson", 1000.);

        try {
            poupanca.saque(5000.);
            poupanca.deposito(0.);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }



    }
}
