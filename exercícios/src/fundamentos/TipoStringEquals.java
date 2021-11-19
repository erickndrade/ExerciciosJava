package fundamentos;

public class TipoStringEquals {
	
	public static void main(String[] args) {
		 System.out.println("2" == "2");

		 String s1 = new String("2");
		 System.out.println("2" == s1);
		
		 System.out.println("2".equals(s1));
		 
		 /*
		  * O uso do Equals permite a leitura dos conteúdos das Strings, 
		  * sendo assim, é possivel para o Java compará-las e retornar o
		  *  resultado, se elas são iguais (true), ou não (false).
		  */
	}

}
 