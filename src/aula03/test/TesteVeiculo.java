package aula03.test;

import aula03.model.Veiculo;

public class TesteVeiculo {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();
        veiculo.setPlaca("ABC-1234");
        veiculo.setTipoCombustivel("Flex");
        veiculo.setValor(40000.);

        System.out.println(veiculo.getPlaca());
        System.out.println("O valor do IPVA é: " + veiculo.calcularIPVA());


    }
}
