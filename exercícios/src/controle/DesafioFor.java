package controle;

public class DesafioFor {

	public static void main(String[] args) {
		
		/*
		 * VERS�O DO DESAFIO
		 * N�o pode usar valor num�rico pra controlar o la�o!
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


	