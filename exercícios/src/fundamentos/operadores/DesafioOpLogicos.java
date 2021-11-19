package fundamentos.operadores;

public class DesafioOpLogicos {
	// Trabalho na terça (V ou F)
	//Trabalho na quinta (V ou F)
	
	/*
	 * Se os 2 trabalhos derem certo, compra TV de 50p
	 * Se apenas um dos trabalhos derem certo, compra tv de 32p
	 * Se qualquer um ou os dois derem certo, tomaremos sorvete
	 * Se os dois trabalhos derem errado, sem tv e sem sorvete
	 */
	
	public static void main(String[] args) {
		boolean trabalhoTerca = false;
		boolean trabalhoQuinta = false;
		
		if (trabalhoTerca && trabalhoQuinta) {
		
			System.out.println("Vamos comprar a Tv de 50p e tomar sorvete!");
			
		} else if (trabalhoQuinta || trabalhoTerca) {
			
			System.out.println("Vamos comprar a Tv de 32p e tomar sorvete!");
			
		} else {
			
			System.out.println("Ficamos sem TV e sem sorvete!");
		}
	}

}
