package aula07.test;

import aula07.model.Pessoa;
import aula07.enums.EstadoCivil;
import aula07.model.Setor;

public class TestePessoa {
    public static void main(String[] args) {
        Setor setor2 = new Setor(1, "RH");
        Pessoa pessoa = new Pessoa("Anderson", "21990005000", EstadoCivil.CASADO, setor2);

        System.out.println(pessoa.toString());

        for (EstadoCivil situacao : EstadoCivil.values()) {
            System.out.println(situacao);
        }
    }
}
