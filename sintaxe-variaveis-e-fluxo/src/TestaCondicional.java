
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 16;
		int quantidadePessoas = 3;
		
		// complexidade ciclomática ou complexidade condicional
		
		if (idade >= 18) {
			System.out.println("você tem mais de 18 anos");
			
		} else if (quantidadePessoas >=2) {
			System.out.println("Pode entrar, você não tem 18, mas está acompanhado.");
		}else {
			System.out.println("Infelizmente você não pode entrar!");
		}
	}
}
