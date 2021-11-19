package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Olá Mundo".charAt(2));
		
		String s = "Boa Noite";
		System.out.println(s.concat("!!"));
		System.out.println(s + "!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("NOITE"));
		System.out.println(s.length());
		System.out.println(s.equals("boa noite"));
		System.out.println(s.equalsIgnoreCase("boa noite"));
		
		var nome = "Erick";
		var sobrenome = "Augusto";
		var idade = 27;
		var salario = 12345.948; 
		
		System.out.printf("O Sr. %s %s tem %d anos e recebe R$ %.2f", 
				nome, sobrenome, idade, salario);
		String frase = String.format("\nO Sr. %s %s tem %d anos e recebe R$ %.2f", 
				nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Como vai você".contains("Como"));
		System.out.println("Como vai você".indexOf("vai"));
		System.out.println("Como vai você".substring(5, 10));
		
	}
}
