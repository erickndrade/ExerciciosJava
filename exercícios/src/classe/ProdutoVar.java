package classe;

public class ProdutoVar {
	
	String nome;
	double preco;
	static double desconto = 0.25;
	
	ProdutoVar(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
		
	}
	
	public ProdutoVar() {
		// TODO Auto-generated constructor stub
	}
	
	 double precoComDesconto(){
		return preco * (1 - desconto);
	}
}
