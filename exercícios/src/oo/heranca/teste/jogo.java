package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Jogador;
import oo.heranca.Monstro;

public class jogo {

	public static void main(String[] args) {

		Jogador monstro = new Monstro();
		monstro.setX(10);
		monstro.setY(10);

		Jogador heroi = new Heroi(10, 11);

		System.out.println("HP monstro: " + monstro.getHp());
		System.out.println("HP heroi: " + heroi.getHp());

		monstro.atacar(heroi);
		heroi.atacar(monstro);

		monstro.atacar(heroi);
		heroi.atacar(monstro);

		monstro.andar(Direcao.NORTE);

		monstro.atacar(heroi);
		heroi.atacar(monstro);

		System.out.println("HP monstro: " + monstro.getHp());
		System.out.println("HP heroi: " + heroi.getHp());

	}
}
