package fundamentos.operadores;

public class DesafioAritmetico {

	public static void main(String[] args) {
		
		int conta1 = 6 * (3 + 2);
		int conta2 = (int)Math.pow(conta1, 2) / (3 * 2);
				
		int conta3 = (1 - 5) * (2 - 7) / 2;
		int conta4 = (int)Math.pow(conta3, 2);
				
		int conta5 = conta2 - conta4;
		int conta6 = (int)Math.pow(conta5, 3);
		int conta7 = conta6 / (int)Math.pow(10, 3);
		System.out.println(conta7);
	}
}
 