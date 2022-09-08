package aula04.test;

import aula04.model.Assistente;
import aula04.model.Gerente;

public class TesteFuncionario {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("123", "Anderson", 12000., "Financeiro");
        gerente.aumetarSalario();
        System.out.println("Dados: " + gerente.getNome() + "\n" + gerente.getSalario());
        Assistente assistente = new Assistente("321", "Andre", 5000., "Assistente T.I");
        assistente.aumetarSalario();
        System.out.println("Dados: " + assistente.getNome() + "\n" + assistente.getSalario());
    }
}
