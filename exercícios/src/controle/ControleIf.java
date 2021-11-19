package controle;

import java.util.Scanner;

public class ControleIf {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a Média: ");
		double media = entrada.nextDouble();
		
		if (media <= 10 && media >= 7.0 ) {
			
			System.out.println("Aprovado!");	
		}
		
		if (media < 7 && media >= 4.5) 
			System.out.println("Recuperação!");
		
		
		boolean criterioReprovacao = media < 4.5 && media >= 0;
				
		if (criterioReprovacao) {
			System.out.println("Reprovado!");
		}
				
		entrada.close();
	}

}
