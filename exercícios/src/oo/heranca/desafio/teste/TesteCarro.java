package oo.heranca.desafio.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class TesteCarro {

	public static void main(String[] args) {

		Carro civic = new Civic(150);
		civic.acelerar();
		civic.acelerar(); 
		civic.acelerar();
		civic.acelerar();
	
		System.out.println(civic);

		civic.frear();
		civic.frear();
		civic.frear();

		System.out.println(civic);

		Ferrari ferrari = new Ferrari(250);
		ferrari.ligarTurbo();
		ferrari.acelerar();
		
		System.out.println(ferrari);
		
		ferrari.acelerar();
		ferrari.frear();
		ferrari.frear();

		System.out.println(ferrari);
		
		ferrari.ligarAr();
		ferrari.acelerar();
		ferrari.acelerar();

		System.out.println(ferrari);
//		System.out.println(ferrari.velocidadeDoAr());
	}

}
