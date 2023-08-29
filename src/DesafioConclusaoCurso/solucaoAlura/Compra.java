package DesafioConclusaoCurso.solucaoAlura;

public class Compra implements Comparable<Compra>{
    private String descricao;
    private double preco;

    public Compra(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Compra: " + descricao + ", preço R$" + preco;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.preco).compareTo(Double.valueOf(outraCompra.preco));
    }
}
