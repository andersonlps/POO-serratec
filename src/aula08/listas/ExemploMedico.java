package aula08.listas;

import java.util.ArrayList;
import java.util.List;

import aula08.model.Medico;

public class ExemploMedico {
    public static void main(String[] args) {
        List<Medico> medicos = new ArrayList<>();

        medicos.add(new Medico(1, "Anderson", 5000., 600.));
        medicos.add(new Medico(2, "Ana", 9000., 500.));
        medicos.add(new Medico(3, "Pedro", 7000., 500.));
        Double maior =0.;
        String nome = null;

        for (Medico medico : medicos) {
            if (medico.getValorConsulta() > maior) {
                maior = medico.getValorConsulta();
                nome = medico.getNome();
            }
            System.out.println(medico);
        }
        System.out.println("O valor da consulta mais caro é " + maior);
        System.out.println(nome);


    }
}
