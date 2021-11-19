package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {

	private boolean ligarTurbo = false;
	private boolean ligarAr = false;
	
	public Ferrari(int veloxMaxima) {
		super(veloxMaxima);
		setVelDelta(15);

	}

	@Override
	public void frear() {

		if (getVelocidadeAtual() > 0) {
			setVelocidadeAtual(getVelocidadeAtual() - 10);
		}
	}

	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
		}

	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}

	@Override
	public void ligarAr() {
		ligarAr = true;
	}

	@Override
	public void desligarAr() {
		ligarAr = false;
	}
	
	@Override
	public int getVelDelta() {
		if (ligarTurbo && !ligarAr) {
			return 35;
		}else if (ligarTurbo && ligarAr) {
			return 30;
		}else if (!ligarTurbo && !ligarAr) {
			return 20;
		}else {
			return 15;
		}
	}

}
