package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		
		/*
		 * A inferência de tipos é uma técnica usada por linguagens tipadas 
		 * estaticamente, em que os tipos de variáveis podem ser inferidos 
		 * do contexto pelo compilador.
		 */
		
		double a = 4.5; 
		System.out.println(a);
		
		a = 12;
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "outro texto";
		System.out.println(c);
		
		double d;
		d = 123.45;
		System.out.println(d);
		
		/*
		 * Embora tenhamos expandido o escopo da inferência de tipos ao longo 
		 * dos anos, um princípio de design que seguimos é o uso de inferência 
		 * de tipos apenas para detalhes de implementação, não para declaração 
		 * de elementos na API. 
		 */
		
	}

}
