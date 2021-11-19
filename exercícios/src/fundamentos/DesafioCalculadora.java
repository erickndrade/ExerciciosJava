package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		//O usuário entra o primeiro numero
		//Depois entra o segundo numero
		//depois qual o tipo da operação: + - * / %
		//Em seguida é apresentado o resultado.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o Primeiro Número: ");
		double num1 = entrada.nextDouble();
		System.out.print("Digite o Segundo Número: ");
		double num2 = entrada.nextDouble();
		System.out.print("Qual o tipo da operação: ");
		String operador = entrada.nextLine();
		
				
		if (operador.equals("+")) {
			
			double soma = num1 + num2;
			System.out.println("O resultado é: " + soma);
		
		}else if (operador.equals("-")) {
			
			double subtracao = num1 - num2;
			System.out.println("O resultado é: " + subtracao);
		
		}else if (operador.equals("*")) {
			
			double multiplicacao = num1 * num2;
			System.out.println("O resultado é: " + multiplicacao);
			
		}else if (operador.equals("/")) {
			
			double divisao = num1 / num2;
			System.out.println("O resultado é: " + divisao);
			
		}else {
			operador.equals("%");
			double resto = num1 % num2;
			System.out.println("O resultado é: " + resto);
		}
		
		/*
		 * double resultado = "+".equals(operador) ? num1 + num2 : 0;
		 * resultado = "-".equals(operador) ? num1 - num2 : resultado;
		 * resultado = "*".equals(operador) ? num1 * num2 : resultado;
		 * resultado = "/".equals(operador) ? num1 / num2 : resultado;
		 * resultado = "%".equals(operador) ? num1 % num2 : resultado;
		 * 
		 * System.out.printf("%.2f %s %.2f = %.2f", 
		 *  		num1, operador, num2, resultado);
		 */
				
		entrada.close();
				
	}

}
