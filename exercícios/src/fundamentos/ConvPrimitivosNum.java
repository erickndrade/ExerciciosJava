package fundamentos;

public class ConvPrimitivosNum {
	public static void main(String[] args) {
		
		/*
		 * o CAST é uma forma de dizer ao java de que você está ciente de que
		 * aquela conversão é explícita e que está ciente que possa haver 
		 * perda de dados.
		 */
		
		double a = 1; //implicita
		System.out.println(a);
		
		float b = (float) 1.2333444555; // explícita (CAST)
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c; // explícita (CAST)
		System.out.println(d);
		
		double e = 1.222;
		int f = (int) e; // explícita (CAST)
		System.out.println(f);
	}

}
