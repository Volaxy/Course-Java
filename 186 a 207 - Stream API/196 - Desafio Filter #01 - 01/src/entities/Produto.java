package entities;

public class Produto {
	public String categoria;
	public String nome;
	public Double preco;
	
	public Produto(String categoria, String nome, Double preco) {
		this.categoria = categoria;
		this.nome = nome;
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produto [categoria=" + categoria + ", nome=" + nome + ", preco=" + preco + "]";
	}
}
