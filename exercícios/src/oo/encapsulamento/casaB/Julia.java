package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {

Ana sogra = new Ana();
	
	void testeAcesso() {
		
//		System.out.println(sogra.facoDentroDeCasa); * somente no mesmo pacote *
//		System.out.println(sogra.formaDeFalar);  * somente por heranca ou pct *
		System.out.println(sogra.todosSabem);
		
	}

}
