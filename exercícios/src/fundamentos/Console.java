package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		System.out.print("Boa");
		System.out.print(" Noite!! \n");
		
		System.out.println("Boa");
		System.out.println("Noite!!");
		
		System.out.printf("%d %d %d %d %d \n", 
				12, 45, 67, 92, 105);
		System.out.printf("ID Card: %.1f \n", 123.789);
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite seu Nome: ");
		String nome = entrada.nextLine();
		System.out.print("Digite seu Sobrenome: ");
		String sobrenome = entrada.nextLine();
		System.out.print("Digite a sua Idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos.",
				nome, sobrenome, idade);
		
		entrada.close(); 
		
		
		
	}

}
