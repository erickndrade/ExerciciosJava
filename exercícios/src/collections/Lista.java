package collections;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	
	public static void main(String[] args) {
		
		List<UserLista> lista = new ArrayList<UserLista>();
		
		UserLista u1 = new UserLista("Ana");
		lista.add(u1);
		
		lista.add(new UserLista("Mateus"));
		lista.add(new UserLista("Yago"));
		lista.add(new UserLista("Erick"));
		lista.add(new UserLista("Artur"));
		
		System.out.println(lista.get(3)); // Acessar pelo índice
		
		lista.remove(1); // remover pelo índice
		lista.remove(new UserLista("Artur")); // remover pelo objeto
		
		System.out.println("Contém? " + lista.contains(new UserLista("Yago")));
		
		for (UserLista usuario : lista) {
			System.out.println(usuario);
			
		}
	}

}
