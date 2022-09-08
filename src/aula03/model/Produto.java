package aula03.model;

public class Produto {
    private int codigo;
    private String descricao;
    private Double valor;
    private static int totalProdutos;

    public Produto(int codigo, String descricao, Double valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        totalProdutos ++;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }

    public static int getTotalProdutos() {
        return totalProdutos;
    }

}
