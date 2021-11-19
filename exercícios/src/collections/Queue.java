package collections;

import java.util.LinkedList;

public class Queue {
	
	public static void main(String[] args) {
		
		java.util.Queue<String> fila = new LinkedList<String>();
		
		/*
		 * Offer e Add -> adiciona elementos na fila
		 * A diferen�a � o comportamento quando a fila est� cheia!
		 */
		
		fila.add("Erick"); // retorna false
		fila.offer("Artur"); // lan�a uma excess�o
		fila.offer("Mateus");
		fila.offer("Yago");
		fila.offer("Lucas");
		fila.offer("Ana");
		
		/*
		 * Peek e Element -> Obter pr�ximo elemento da fila sem remover
		 * Diferen�a � o comportamento que ocorre quando a fila est� vazia!
		 */
		
		System.out.println(fila.peek()); // retorna Null
		System.out.println(fila.peek());
		System.out.println(fila.element()); // Lan�a uma exce��o
		System.out.println(fila.element());
		
		/*
		 * Poll e Remove -> Obter pr�ximo elemento da fila e remove
		 * Diferen�a � o comportamento que ocorre quando a fila est� vazia!
		 */
		
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.remove()); // Lan�a uma exce��o
		System.out.println(fila.poll());
		System.out.println(fila);

	}

}
