
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 16;
		int quantidadePessoas = 3;
		
		// complexidade ciclom�tica ou complexidade condicional
		
		if (idade >= 18) {
			System.out.println("voc� tem mais de 18 anos");
			
		} else if (quantidadePessoas >=2) {
			System.out.println("Pode entrar, voc� n�o tem 18, mas est� acompanhado.");
		}else {
			System.out.println("Infelizmente voc� n�o pode entrar!");
		}
	}
}
