package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		final int x = 32;
		final double y = 5.0 / 9.0;
		int farenheit = 50;
		
		System.out.println(farenheit);
		
		double celsius = (farenheit - x) * y;
		
		System.out.println("Temperatura em C: " + celsius);
		
	}
	
}


