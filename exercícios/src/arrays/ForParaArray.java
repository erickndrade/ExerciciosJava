package arrays;

import java.util.Scanner;

public class ForParaArray {
	
	public static void main(String[] args) {
		
		 Scanner entrada = new Scanner(System.in);
		 
		 System.out.print("Digite a quantidade notas: ");
		 int qtdeNotas = entrada.nextInt();
		 
		 double [] notas = new double[qtdeNotas];
		 
		 for (int i = 0; i < notas.length; i++) {
			 System.out.print("Digite a nota "+(i+1) + ": ");
				notas[i] = Double.parseDouble(entrada.next());
		}
		 
		 double soma = 0;
		 for (double i : notas) {
			soma += i;
		}
		 
		 System.out.printf("O valor final é: %.2f \n", soma);
		 
		 double media = soma / notas.length;
		 System.out.printf("A média é: %.2f", media);
		 
		  entrada.close();
	}

}
