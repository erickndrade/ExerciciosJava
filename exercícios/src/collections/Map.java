package collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class Map {

	public static void main(String[] args) {

		java.util.Map<Integer, String> usuarios = new HashMap<>();

		usuarios.put(1, "Erick");
		usuarios.put(22, "Artur");
		usuarios.put(33, "Yago");
		usuarios.put(44, "Mateus");

		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());

		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());

		System.out.println(usuarios.containsKey(4));
		System.out.println(usuarios.containsValue("Erick"));

		System.out.println(usuarios.get(4));

		for (Integer chave : usuarios.keySet()) {
			System.out.println(chave);
		}

		for (String valor : usuarios.values()) {
			System.out.println(valor);
		}

		for (Entry<Integer, String> registro : usuarios.entrySet()) {
			System.out.println(registro);
		}

		/*
		 * Para estudos:
		 * https://www.geeksforgeeks.org/java-util-hashmap-in-java-with-examples/
		 */
	}
}
