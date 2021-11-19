package fundamentos;

import java.util.Date;

public class Import {
	
	public static void main(String[] args) {
		
		java.lang.String b = "Boa Tarde!";
		System.out.println(b);
		
		/*
		 * O que está dentro de java.lang está disponível para uso,
		 * aquilo que está fora, precisamos importar.
		 * Para acessar um Import, basta colocar o tipo do código, 
		 * no caso abaixo "Date", usar o comando Crtl+Space e selecionar o 
		 * Import correto.    
		 */
		
		Date d = new Date ();
		System.out.println(d);
		
	//	JButton botao = new JButton(); 
		
		
	}

}
