package aula04.model;

public class Funcionario {
    private String cpf;
    private String nome;
    private Double salario;

    @Override
    public String toString() {
        return "Funcionario [cpf=" + cpf + ", nome=" + nome + ", salario=" + String.format("%.3f", salario) + "]";
    }

    public Funcionario(String cpf, String nome, Double salario) {
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }   

    public Double aumetarSalario(){
        return salario = salario * 1.10;
    }
}
