package controle;

public class SwitchSemBreak {

	public static void main(String[] args) {

		String faixa = "verde";

		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("sei o Bassai-Dan");
		case "marrom":
			System.out.println("sei o tekki shodan");
		case "roxa":
			System.out.println("sei o heian godan");
		case "verde":
			System.out.println("sei o heian yodan");
		case "laranja":
			System.out.println("sei o heian sandan");
		case "vermelha":
			System.out.println("sei o heian nidan");
		case "amarela":
			System.out.println("sei o heian shodan");
			break;
		default:
			System.out.println("Não sei nada");

		}
		
		int idade = 4;
		switch (idade) {
		case 4:
			System.out.println("Sabe ler");
		case 3:
			System.out.println("Sabe falar");
		case 2: 
			System.out.println("Sabe andar");
		case 1:
			System.out.println("Sabe chorar");
			
			

		}
		
	}
	
}
