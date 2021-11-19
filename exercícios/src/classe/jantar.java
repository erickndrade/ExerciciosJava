package classe;

public class jantar {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Erick", 85.3);

		System.out.printf("Cliente: %s\nPeso: %.2f Kg", p1.nome, p1.peso);

		Comida frango = new Comida("Frango", 1.5);

		System.out.printf("\nA comida é: %s \nPeso do prato: %.2f Kg \n"
							, frango.nomeDaComida, frango.pesoDaComida);

		Comida arroz = new Comida("Arroz", 0.225);

		System.out.printf("A comida é: %s \nPeso do prato: %.2f Kg \n"
						, arroz.nomeDaComida, arroz.pesoDaComida);

		
//		double peso = p1.previsaoEngordar(frango.obterPesoDaComida());
//		
//			System.out.println(peso);
//			System.out.println(p1.pesoFinal());
				
		p1.engordar(frango.obterPesoDaComida());
		p1.engordar(arroz.obterPesoDaComida());
		
		// engordar = 
		
		System.out.printf("O peso final é: %.2f Kg", p1.pesoFinal());

	}

}
