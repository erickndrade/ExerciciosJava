package classe;

public class Comida {

	String nomeDaComida;
	double pesoDaComida;

	
	public Comida() {

	}

	public Comida(String nomeDaComida, double pesoDaComida) {
		this.nomeDaComida = nomeDaComida;
		this.pesoDaComida = pesoDaComida;

	}

	public double obterPesoDaComida() {
	
		return pesoDaComida;
	}

}
