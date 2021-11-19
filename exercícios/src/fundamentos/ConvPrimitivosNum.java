package fundamentos;

public class ConvPrimitivosNum {
	public static void main(String[] args) {
		
		/*
		 * o CAST � uma forma de dizer ao java de que voc� est� ciente de que
		 * aquela convers�o � expl�cita e que est� ciente que possa haver 
		 * perda de dados.
		 */
		
		double a = 1; //implicita
		System.out.println(a);
		
		float b = (float) 1.2333444555; // expl�cita (CAST)
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c; // expl�cita (CAST)
		System.out.println(d);
		
		double e = 1.222;
		int f = (int) e; // expl�cita (CAST)
		System.out.println(f);
	}

}
