package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack {

	public static void main(String[] args) {

		Deque<String> livros = new ArrayDeque<String>();

		livros.add("O Senhor dos Anéis");
		livros.push("1984");
		livros.push("Contos Inacabados");

		System.out.println(livros);

		System.out.println("peek-> " + livros.peek());
		System.out.println("element-> " + livros.element());
		System.out.println("getFirst-> " + livros.getFirst());
		System.out.println("getLast-> " + livros.getLast());

		System.out.println("poll-> " + livros.poll());
		System.out.println("pop-> " + livros.pop());
		
		System.out.println(livros);

	}

}
