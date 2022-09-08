package aula04.model;

public class Caminhao extends Veiculo{
    private Integer cargaMaxima;

    public Caminhao(String chassi, String placa, String cor, Double valor, Integer cargaMaxima) {
        super(chassi, placa, cor, valor);
        this.cargaMaxima = cargaMaxima;
    }

    public Integer getCargaMaxima() {
        return cargaMaxima;
    }

    @Override
    public String toString() {
        return "Caminhao [cargaMaxima=" + cargaMaxima +  "]";
    }

    @Override
    public void calcularIpva() {
        valorIpva = valor * 0.08;
    }
    
    
}
