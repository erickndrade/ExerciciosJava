package fundamentos;

public class TipoStringEquals {
	
	public static void main(String[] args) {
		 System.out.println("2" == "2");

		 String s1 = new String("2");
		 System.out.println("2" == s1);
		
		 System.out.println("2".equals(s1));
		 
		 /*
		  * O uso do Equals permite a leitura dos conte�dos das Strings, 
		  * sendo assim, � possivel para o Java compar�-las e retornar o
		  *  resultado, se elas s�o iguais (true), ou n�o (false).
		  */
	}

}
 