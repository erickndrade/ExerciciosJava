package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste"); // String
		conjunto.add(1); // int -> Interger
		conjunto.add('x'); // char -> Character
		
		System.out.println("Tamanho �: " + conjunto.size());
		
		conjunto.add("teste");
		conjunto.add('x');
		
		System.out.println("Tamanho �: " + conjunto.size());
		
		System.out.println(conjunto.remove("texto"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));

		System.out.println("Tamanho �: " + conjunto.size());
		
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(false));
		System.out.println(conjunto.contains(true));
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums); // uni�o entre dois conjuntos
		conjunto.retainAll(nums); // interse��o entre dois conjuntos
		System.out.println(conjunto);
		
		conjunto.clear(); // Limpeza dos valor de conjunto
		System.out.println(conjunto);

	}

}
