package aula03.model;

public class Veiculo {
    private String placa;
    private String tipoCombustivel;
    private Double valor;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        if (valor < 0) {
            this.valor = 0.0;
        }else {
            this.valor = valor;
        }
    // Outra opção utilizando o térnario
    // this.valor = valor < 0 ? 0.0 : valor;
    }

    public Double calcularIPVA() {
        if (tipoCombustivel.equals("Flex")) {
            return valor * 0.03;
        }else {
            return valor * 0.04;
        }
    }


}
