package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		String valor = ""; //valor indeterminado.
		/*
		 *  Neste exemplo, Enquanto(while) o usuário não digitar sair, 
		 *  o console vai continuar pedindo para ele inserir uma mensagem.
		 */
		while (!valor.equalsIgnoreCase("sair")) {
			System.out.print("Digite sua mensagem: ");
			valor = entrada.nextLine();
			
		}
				
		entrada.close();
	}
}
