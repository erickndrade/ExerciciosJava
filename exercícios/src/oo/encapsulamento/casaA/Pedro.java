package oo.encapsulamento.casaA;

public class Pedro {
	
	Ana esposa = new Ana();
	
	void testeAcesso() {
		
//		System.out.println(esposa.segredo); * somente pra mesma classe *
		System.out.println(esposa.facoDentroDeCasa);
		System.out.println(esposa.formaDeFalar);
		System.out.println(esposa.todosSabem);
		
	}

}
