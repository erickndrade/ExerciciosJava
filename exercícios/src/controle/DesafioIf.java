package controle;

public class DesafioIf {

	public static void main(String[] args) {

	/*
	 * A resolução do desafio é retirar o ";" da condição if, pois ele atrapalha
	 * a leitura do bloco de instruções de comando, fazendo a leitura do ";" ao
	 * invés do bloco print.
	 */
		
		double nota = 9.5;

		if (nota >= 9); {

			System.out.println("Quadro de honra!");
			System.out.println("Você é fera!");

		}
	}
}
