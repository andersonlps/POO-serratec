package aula07.model;

import java.time.LocalDate;

import aula07.enums.Bebida;
import aula07.enums.Sanduiche;

public class Pedido {
    private LocalDate dataPedido;
    private Bebida bebida;
    private Sanduiche sanduiche;

    public Pedido(LocalDate dataPedido, Bebida bebida, Sanduiche sanduiche) {
        this.dataPedido = dataPedido;
        this.bebida = bebida;
        this.sanduiche = sanduiche;
    }

    @Override
    public String toString() {
        return "Data do Pedido: "  + dataPedido + " Bebida = " + bebida + " Sanduiche" + sanduiche;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public Sanduiche getSanduiche() {
        return sanduiche;
    }
    
    public void imprimirCardapio() {
        for (Bebida bebida : Bebida.values()) {
            System.out.println("\n**********************");
            System.out.println(bebida);
        }

        for (Sanduiche sanduiche : Sanduiche.values()) {
            System.out.println("\n**********************");
            System.out.println(sanduiche);
        }
    }

    

}
