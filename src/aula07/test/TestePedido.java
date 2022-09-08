package aula07.test;

import java.time.LocalDate;

import aula07.enums.Bebida;
import aula07.enums.Sanduiche;
import aula07.model.Pedido;

public class TestePedido {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(LocalDate.now(), Bebida.REFRIGERANTE, Sanduiche.HAMBURGUER);

        pedido.imprimirCardapio();

        System.out.println("\nDados do pedido:");
        System.out.println(pedido);
    }
}
