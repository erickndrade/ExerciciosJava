package classe;

public class DataVarChamada {
	
	public static void main(String[] args) {
		
		DataVar data1 = new DataVar(22, 12, 1993);
				
		System.out.println(data1.obterData());
		
		DataVar data2 = new DataVar();
		
		System.out.println(data2.obterData());
		
	}

}
