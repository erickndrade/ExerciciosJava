package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a; //atribui��o por valor (tipo primitivo)
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		DataVar d1 = new DataVar(10, 9, 2021);
		DataVar d2 = d1; // atribui��o por refer�ncia (objeto)
		
		d1.dia = 22;
		d2.mes = 12;
		
		System.out.println(d1.obterData());
		System.out.println(d2.obterData());
		
		/*
		 * Quando voc� passa um objeto como parametro para um m�todo, voc� tbm
		 * passa a refer�ncia. Ao passar a refer�ncia, voc� consegue alterar 
		 * esse objeto a partir desse m�todo.
		 */
		
		voltarDataValorPadrao(d1);
		
		System.out.println(d1.obterData());
		System.out.println(d2.obterData());
	}
	
	static void voltarDataValorPadrao(DataVar d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
}
