package fundamentos;

import java.util.Date;

public class Import {
	
	public static void main(String[] args) {
		
		java.lang.String b = "Boa Tarde!";
		System.out.println(b);
		
		/*
		 * O que est� dentro de java.lang est� dispon�vel para uso,
		 * aquilo que est� fora, precisamos importar.
		 * Para acessar um Import, basta colocar o tipo do c�digo, 
		 * no caso abaixo "Date", usar o comando Crtl+Space e selecionar o 
		 * Import correto.    
		 */
		
		Date d = new Date ();
		System.out.println(d);
		
	//	JButton botao = new JButton(); 
		
		
	}

}
