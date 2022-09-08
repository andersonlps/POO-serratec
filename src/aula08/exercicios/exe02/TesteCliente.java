package aula08.exercicios.exe02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteCliente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Cliente> clientes = new ArrayList<>();
        int id;

        while (true) {
        
        System.out.println("Digite um número para o ID ou número negativo para sair.");
        id = scan.nextInt();

        if (id < 0) {
            break;
        }

        System.out.println("Digite um nome:");
        String nome = scan.nextLine();

        System.out.println("Digite uma idade:");
        int idade = scan.nextInt();

        System.out.println("Digite um telefone:");
        String telefone = scan.nextLine();

        clientes.add(new Cliente(id, nome, idade, telefone));

        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
            

        
    }
    scan.close();
    }
}
