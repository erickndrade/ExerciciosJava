package classe;

public class ProdutoVarChamada {
	
	public static void main(String[] args) {
		

		ProdutoVar p1 = new ProdutoVar("Notebook", 3456.78); 
										
		var p2 = new ProdutoVar();
		p2.nome = "Caneta preta";
		p2.preco = 1.23;
		
		//ProdutoVar.desconto = 0.75;
		
		
		System.out.printf("%s: R$%.2f\n", p1.nome, p1.precoComDesconto());
		System.out.printf("%s: R$%.2f\n", p2.nome, p2.precoComDesconto());
				
		double precoFinal1 = p1.precoComDesconto();
		double precofinal2 = p2.precoComDesconto();
		double mediaCarrinho = (precoFinal1 + precofinal2) / 2;
		
		System.out.printf("Média do carrinho: R$%.2f", mediaCarrinho);
	}

}
