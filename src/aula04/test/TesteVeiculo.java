package aula04.test;

import aula04.model.Caminhao;
import aula04.model.VeiculoPasseio;

public class TesteVeiculo {
    public static void main(String[] args) {
        Caminhao caminhao = new Caminhao("123", "ABC-321", "Preto", 40000., 5000);
        VeiculoPasseio veiculoPasseio = new VeiculoPasseio("852", "VCA-963", "Branco", 45000., 4);

        caminhao.calcularIpva();
        veiculoPasseio.calcularIpva();

        System.out.println(veiculoPasseio.getValor());
        System.out.println(veiculoPasseio.getValorIpva());
        System.out.println(caminhao.getValor());
        System.out.println(caminhao.getValorIpva());

    }
}
