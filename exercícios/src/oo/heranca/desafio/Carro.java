package oo.heranca.desafio;

public abstract class Carro {

	private int velocidadeAtual;
	private final int veloxMaxima;
	private int velDelta = 5;
	
	protected Carro(int veloxMaxima) {
		this.veloxMaxima = veloxMaxima;
	}

	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public void acelerar() {
		if (velocidadeAtual + getVelDelta() > veloxMaxima) {
			velocidadeAtual = veloxMaxima;
		} else {
			velocidadeAtual += getVelDelta();
		}
	}

	public void frear() {

		if (velocidadeAtual > 0) {
			velocidadeAtual -= 5;
		}
	}

	public String toString() {
		return "velocidade atual: " + velocidadeAtual + "Km/h";
	}

	public int getVeloxMaxima() {
		return veloxMaxima;
	}

	public int getVelDelta() {
		return velDelta;
	}

	public void setVelDelta(int velDeta) {
		this.velDelta = velDeta;
	}
}
