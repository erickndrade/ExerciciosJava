package classe;

//import java.util.Date;

public class Equals {

	
	public static void main(String[] args) {
		
		EqualsUsuario u1 = new EqualsUsuario();
		u1.nome = "Erick Augusto";
		u1.email = "erick.aam@hotmail.com";
		
		EqualsUsuario u2 = new EqualsUsuario();
		u2.nome = "Erick Augusto";
		u2.email = "erick.aam@hotmail.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
//		System.out.println(u2.equals(new Date()));
	}
}
