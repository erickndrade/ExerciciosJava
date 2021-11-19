package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		/*
		 * O operador ponto vai indicar que você quer chamar um atributo ou 
		 * método do que quer que esteja escrito atrás do ponto. 
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
		 * Os tipos primitivos não possuem a notação ponto, pois somente 
		 * armazenam o próprio valor e fazem operações mais simples, não tendo 
		 * acesso à atributos do Java através do ".".
		 */
		
	}

}
