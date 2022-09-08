package aula04.model;

public class Veiculo {
    protected String chassi;
    protected String placa;
    protected String cor;
    protected Double valor;
    protected Double valorIpva;

    public Veiculo(String chassi, String placa, String cor, Double valor) {
        this.chassi = chassi;
        this.placa = placa;
        this.cor = cor;
        this.valor = valor;
    }

    public String getChassi() {
        return chassi;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCor() {
        return cor;
    }

    public Double getValor() {
        return valor;
    }

    
    public Double getValorIpva() {
        return valorIpva;
    }

    @Override
    public String toString() {
        return "Veiculo [chassi=" + chassi + ", cor=" + cor + ", placa=" + placa + ", valor=" + valor + "]";
    }

    public void calcularIpva() {
        valorIpva = valor * 0.04;
    }



}
