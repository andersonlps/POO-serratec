package aula08.model;

public class Medico {
    private int crm;
    private String nome;
    private Double salario;
    private Double valorConsulta;
    private static int contador;

    public Medico(int crm, String nome, Double salario, Double valorConsulta) {
        this.crm = crm;
        this.nome = nome;
        this.salario = salario;
        this.valorConsulta = valorConsulta;
        contador++;
    }

    @Override
    public String toString() {
        return "Medico [crm=" + crm + ", nome=" + nome + ", salario=" + 
                        salario + ", valorConsulta=" + valorConsulta + "]";
    }

    public int getCrm() {
        return crm;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }

    public Double getValorConsulta() {
        return valorConsulta;
    }

    public static int getContador() {
        return contador;
    }
    
    public void pagamentoDinheiro() {
        salario += valorConsulta;
    }

    public void pagamentoPlanoDeSaude() {
        salario = salario + valorConsulta * 0.70;
    }

}
