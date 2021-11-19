package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite seu Primeiro Salário: ");
		String salario1 = entrada.nextLine().replace(',', '.');
		System.out.print("Digite seu Segundo Salário: ");
		String salario2 = entrada.nextLine().replace(',', '.');
		System.out.print("Digite seu Terceiro Salário: ");
		String salario3 = entrada.nextLine().replace(',', '.');
		
		float num1 = Float.parseFloat(salario1);
		float num2 = Float.parseFloat(salario2);
		float num3 = Float.parseFloat(salario3);
		
		/*
		 * Pode ser feito com o double. Float foi usado para controle de casas
		 * decimais no resultado da média.
		 */
		
		float soma = num1 + num2 + num3;
		System.out.printf("A médio dos 3 salários é: R$ %.2f", soma / 3);
		
		entrada.close();
		
		
	}
}
