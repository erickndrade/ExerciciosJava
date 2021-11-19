package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		/*
		 * O operador ponto vai indicar que voc� quer chamar um atributo ou 
		 * m�todo do que quer que esteja escrito atr�s do ponto. 
		 */
		
		String s = "Bom Dia X";
		
		s = s.replace("X", "senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		System.out.println("guy".toUpperCase());
		
		String x = "Bro".toUpperCase();
		System.out.println(x);
		
		String y = "Bom Dia X"
				.replace("X", "man")
				.toUpperCase()
				.concat("!");
		System.out.println(y);
		
		/*
		 * Os tipos primitivos n�o possuem a nota��o ponto, pois somente 
		 * armazenam o pr�prio valor e fazem opera��es mais simples, n�o tendo 
		 * acesso � atributos do Java atrav�s do ".".
		 */
		
	}

}
