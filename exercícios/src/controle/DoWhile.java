package controle;

import java.util.Scanner;


public class DoWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String text = "";
		
		do {
			System.out.println("Diga as palavras mágicas: ");
			System.out.print("Quer sair? ");
			text = entrada.nextLine();
		} while (!text.equalsIgnoreCase("Por favor"));
		
	System.out.println("Obrigado!");
	entrada.close();
	}
	
	
}
