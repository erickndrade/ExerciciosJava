
public class TestaCondicionalDois {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 16;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;
		
		System.out.println(acompanhado);


		if (idade >= 18 && acompanhado) {
			System.out.println("Bem-vindo!");

		} else {
			System.out.println("Infelizmente você não pode entrar!");
		}
	}
	
}
 