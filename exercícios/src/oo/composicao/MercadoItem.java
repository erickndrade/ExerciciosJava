package oo.composicao;

public class MercadoItem {

	final int quantidade;

	final MercadoProduto produto;

	
	public MercadoItem(MercadoProduto produto, int quantidade) {
		
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	public String toString() {
		return produto.nome;
	}
}
