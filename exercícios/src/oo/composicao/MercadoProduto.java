package oo.composicao;

public class MercadoProduto {
	
	double preco;
	
	String nome;

	public MercadoProduto(double preco, String nome) {
		
		this.nome = nome;
		this.preco = preco;
	}
	
	public String toString() {
		return nome;
	}
}
