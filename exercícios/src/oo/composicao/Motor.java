package oo.composicao;

public class Motor {

	final Carro carro;

	boolean ligado = false;
	double fatorInjecao = 1;

	public Motor(Carro carro) {
		this.carro = carro;
		// TODO Auto-generated constructor stub
	}

	int giros() {

		if (!ligado) {
			return 0;
		} else {
			return (int) Math.round(fatorInjecao * 3000);

		}

	}

}
