package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		
		/*
		 * A infer�ncia de tipos � uma t�cnica usada por linguagens tipadas 
		 * estaticamente, em que os tipos de vari�veis podem ser inferidos 
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
		 * Embora tenhamos expandido o escopo da infer�ncia de tipos ao longo 
		 * dos anos, um princ�pio de design que seguimos � o uso de infer�ncia 
		 * de tipos apenas para detalhes de implementa��o, n�o para declara��o 
		 * de elementos na API. 
		 */
		
	}

}
