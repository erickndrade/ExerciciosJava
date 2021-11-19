package exercicio;

public class Academia {
	
	//criar uma classe para o cliente e outra classe para o exerc�cio executado.
	
	public static void main(String[] args) {
		
		AcademiaCliente p1 = new AcademiaCliente("Erick", 85);
		
		System.out.printf("Cliente: %s\nPeso: %.2f Kg\n", p1.nome, p1.peso);
		
		AcademiaExercicio e1 = new AcademiaExercicio("Supino Reto", 2.2);
		
		System.out.printf("Exerc�cio: %s\nGanho de Massa: %.2f Kg",
							e1.nomeExercicio, e1.ganhoMassa);
		
		AcademiaExercicio e2 = new AcademiaExercicio("Trapesio", 1.5);
		
		System.out.printf("\nExerc�cio: %s\nGanho de Massa: %.2f Kg\n",
				e2.nomeExercicio, e2.ganhoMassa);
		
		p1.ficarBombado(e1.novoPeso());
		p1.ficarBombado(e2.novoPeso());
		
		System.out.println("A massa obtida hoje foi: " + 
													p1.pesoFinal() + " Kg");
		
	}

}
