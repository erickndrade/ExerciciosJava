package oo.composicao;

import java.util.ArrayList;


public class MercadoCliente {
	
	String nome;
	
	
	ArrayList<MercadoCompra> compra = new ArrayList<MercadoCompra>();
	
	public MercadoCliente(String nome) {
		this.nome = nome;
	}
	
double obterValorTotal() {
	double total = 0;
	
	for (MercadoCompra mercadoCompra : compra) {
		total += mercadoCompra.obterValorTotal();
	}
	return total;
}
	
	void addCompra(MercadoCompra compra) {
		this.compra.add(compra);
	}

	public String toString() {
		return nome;
	}
}
