package aula07.test;

import aula07.model.PolicialFederal;

public class TestePolicial {
    public static void main(String[] args) {
        PolicialFederal pf = new PolicialFederal("Anderson", "123", "Rio de Janeiro");

        System.out.println(pf.getLotacao());
    }
}
