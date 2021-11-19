package oo.heranca;

public class Jogador {

	private int hp = 100;
	private int x;
	private int y;
	
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Jogador(int x, int y) {
		this.setX(x);
		this.setY(y);
	}

	public boolean atacar(Jogador oponente) {

		int diffX = Math.abs(getX() - oponente.getX());
		int diffY = Math.abs(getY() - oponente.getY());

		if (diffX == 0 && diffY == 1) {
			oponente.setHp(oponente.getHp() - 10);
			return true;
		} else if (diffX == 1 && diffY == 0) {
			oponente.setHp(oponente.getHp() - 10);
			return true;
		} else {
			return false;
		}

	}

	public boolean andar(Direcao direcao) {
		switch (direcao) {
		case NORTE:
			y--;
			break;
		case LESTE:
			x++;
			break;
		case SUL:
			y++;
			break;
		case OESTE:
			x--;
			break;
		}

		return true;

	}
}
