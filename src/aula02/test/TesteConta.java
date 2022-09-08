package aula02.test;

import aula02.model.Conta;

public class TesteConta {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.numeroConta = 123;
        conta1.saldo = 1200.;
        conta1.titular = "Anderson";

        conta1.deposito(10000.);

        if (conta1.saque(3500.)) {
            System.out.println("Saque realizado!");
        }else {
            System.out.println("Saldo insuficiente!");
        }

        System.out.println("Saldo conta 1: " + conta1.saldo);
    }
}
