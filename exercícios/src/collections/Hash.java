package collections;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {
		
		HashSet<UserLista> usuarios = new HashSet<UserLista>();
		
		usuarios.add(new UserLista("Yago"));
		usuarios.add(new UserLista("Erick"));
		usuarios.add(new UserLista("Artur"));
		
		boolean resultado = usuarios.contains(new UserLista("Artur"));
		System.out.println(resultado);
	}

}
