package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a; //atribuição por valor (tipo primitivo)
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		DataVar d1 = new DataVar(10, 9, 2021);
		DataVar d2 = d1; // atribuição por referência (objeto)
		
		d1.dia = 22;
		d2.mes = 12;
		
		System.out.println(d1.obterData());
		System.out.println(d2.obterData());
		
		/*
		 * Quando você passa um objeto como parametro para um método, você tbm
		 * passa a referência. Ao passar a referência, você consegue alterar 
		 * esse objeto a partir desse método.
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
