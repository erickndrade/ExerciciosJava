package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		//O usu�rio entra o primeiro numero
		//Depois entra o segundo numero
		//depois qual o tipo da opera��o: + - * / %
		//Em seguida � apresentado o resultado.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o Primeiro N�mero: ");
		double num1 = entrada.nextDouble();
		System.out.print("Digite o Segundo N�mero: ");
		double num2 = entrada.nextDouble();
		System.out.print("Qual o tipo da opera��o: ");
		String operador = entrada.nextLine();
		
				
		if (operador.equals("+")) {
			
			double soma = num1 + num2;
			System.out.println("O resultado �: " + soma);
		
		}else if (operador.equals("-")) {
			
			double subtracao = num1 - num2;
			System.out.println("O resultado �: " + subtracao);
		
		}else if (operador.equals("*")) {
			
			double multiplicacao = num1 * num2;
			System.out.println("O resultado �: " + multiplicacao);
			
		}else if (operador.equals("/")) {
			
			double divisao = num1 / num2;
			System.out.println("O resultado �: " + divisao);
			
		}else {
			operador.equals("%");
			double resto = num1 % num2;
			System.out.println("O resultado �: " + resto);
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
