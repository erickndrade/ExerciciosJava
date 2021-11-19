package controle;

public class DesafioFor {

	public static void main(String[] args) {
		
		/*
		 * VERSÃO DO DESAFIO
		 * Não pode usar valor numérico pra controlar o laço!
		 */
		
		String valor = "#";
		for (int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor += "#";
		}
	
	for (String hashtag = "#"; !hashtag.equals("######"); hashtag += "#") {
		
		System.out.println(hashtag);
	}
	
	}
}


	