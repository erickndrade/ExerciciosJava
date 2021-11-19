package collections;

import java.util.LinkedList;

public class Queue {
	
	public static void main(String[] args) {
		
		java.util.Queue<String> fila = new LinkedList<String>();
		
		/*
		 * Offer e Add -> adiciona elementos na fila
		 * A diferença é o comportamento quando a fila está cheia!
		 */
		
		fila.add("Erick"); // retorna false
		fila.offer("Artur"); // lança uma excessão
		fila.offer("Mateus");
		fila.offer("Yago");
		fila.offer("Lucas");
		fila.offer("Ana");
		
		/*
		 * Peek e Element -> Obter próximo elemento da fila sem remover
		 * Diferença é o comportamento que ocorre quando a fila está vazia!
		 */
		
		System.out.println(fila.peek()); // retorna Null
		System.out.println(fila.peek());
		System.out.println(fila.element()); // Lança uma exceção
		System.out.println(fila.element());
		
		/*
		 * Poll e Remove -> Obter próximo elemento da fila e remove
		 * Diferença é o comportamento que ocorre quando a fila está vazia!
		 */
		
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.remove()); // Lança uma exceção
		System.out.println(fila.poll());
		System.out.println(fila);

	}

}
