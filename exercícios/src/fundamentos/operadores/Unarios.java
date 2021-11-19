package fundamentos.operadores;

public class Unarios {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; //a = a + 1
		a--; //a = a - 1
		
		++b; // b = b + 1
		--b; // b = b - 1
		
		System.out.println(a);
		System.out.println(b);
		
		/*
		 * Quando o operador un�rio vem antes do nome da vari�vel, ele tem 
		 * precend�ncia no resultado do c�digo. Exemplo abaixo:
		 */
		
		System.out.println(++a == b--);
		
		/*
		 * o resultado � true pois o incremento de a � comparado a b antes
		 * de receber o decremento por quest�o ta preced�ncia.
		 */
	}     

}
