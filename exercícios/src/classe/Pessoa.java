package classe;

public class Pessoa {

	String nome;
	double peso;

	double pesoFinal() {
				
		return peso;
	}
	
	void engordar(double pesoDaComida) {
		
		this.peso += pesoDaComida;
	}

	double previsaoEngordar(double pesoDaComida) {
		return this.peso + pesoDaComida;
	}
	
	public Pessoa() {

	}

	public Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
}
