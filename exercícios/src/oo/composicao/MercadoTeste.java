package oo.composicao;

public class MercadoTeste {

	public static void main(String[] args) {

		MercadoCliente c1 = new MercadoCliente("Erick Augusto");

		MercadoCompra compra1 = new MercadoCompra();
		MercadoCompra compra2 = new MercadoCompra();

		compra1.addItem("carne", 23.9, 2);
		compra1.addItem("Arroz", 14.8, 3);
		compra2.addItem("Feij�o", 8.9, 4);
		compra2.addItem("P�o", 1.59, 10);
		
		compra1.addCliente(c1);
		compra2.addCliente(c1);

//		Ou pode se fazer ao contr�rio, add compra ao cliente:
//		c1.addCompra(compra1);
//		c1.addCompra(compra2);
		
		System.out.println("Nome do cliente: " + c1.nome);
		System.out.println("Itens da compra 1: " + c1.compra.get(0));
		System.out.println("Itens da compra 2: " + c1.compra.get(1));
		
		System.out.println("Pre�o total da compra: R$ " + c1.obterValorTotal());

		
	}

}
