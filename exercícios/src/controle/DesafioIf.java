package controle;

public class DesafioIf {

	public static void main(String[] args) {

	/*
	 * A resolu��o do desafio � retirar o ";" da condi��o if, pois ele atrapalha
	 * a leitura do bloco de instru��es de comando, fazendo a leitura do ";" ao
	 * inv�s do bloco print.
	 */
		
		double nota = 9.5;

		if (nota >= 9); {

			System.out.println("Quadro de honra!");
			System.out.println("Voc� � fera!");

		}
	}
}
