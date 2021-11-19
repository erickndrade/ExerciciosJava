package classe;

public class ValorNulo {
	
	public static void main(String[] args) {
		
		String s1 = "";
		System.out.println(s1.concat("!!!"));
		
		DataVar d1 = Math.random() > 0.5? new DataVar() : null;
		
		if (d1 != null) {
			d1.mes = 3;
			System.out.println(d1.obterData());
			
		}
		
		
		String s2 = Math.random() > 0.5? "Olá" : null;
		
		if (s2 != null) {
			System.out.println(s2.concat("???"));
		}
		
	}

}
