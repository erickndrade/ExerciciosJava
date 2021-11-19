package oo.composicao;

import java.util.ArrayList;

public class MercadoCompra {

	ArrayList<MercadoItem> itens = new ArrayList<MercadoItem>();

	void addCliente(MercadoCliente cliente) {
		cliente.compra.add(this);
	}

	void addItem(String nome, double preco, int quantidade) {
		var novoProduto = new MercadoProduto(preco, nome);
		this.itens.add(new MercadoItem(novoProduto, quantidade));
	}

	public String toString() {
		return itens.toString();
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for (MercadoItem mercadoItem : itens) {
			total += mercadoItem.quantidade * mercadoItem.produto.preco;
		}
			return total;
	}
	
}
