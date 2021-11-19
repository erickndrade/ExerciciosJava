package arrays;

import java.util.Arrays;

public class ExercicioArray {

	public static void main(String[] args) {
		
		double[] notasAlunoA = new double [4];
		
		notasAlunoA[0] = 7.5;
		notasAlunoA[1] = 8.3;
		notasAlunoA[2] = 6.5;
		notasAlunoA[3] = 9.5;
		
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		
		double notaFinalA = 0;
		for (double notasA : notasAlunoA) {
			notaFinalA += notasA;
		}
		
		System.out.println("A nota final é: " + notaFinalA);
		System.out.println("A media final é: " + notaFinalA / notasAlunoA.length);
			
				
		final double notaArmazenada = 7.6;
		
		double[] notasAlunoB = {5.5, notaArmazenada, 9.9, 8.6};
		
		System.out.println(Arrays.toString(notasAlunoB));		
		
		double totalAlunoB = 0;
		for (double notasB : notasAlunoB) {
			totalAlunoB += notasB;
		}
		System.out.println("Nota final é: " + totalAlunoB);
		System.out.println("A média é: " + totalAlunoB / notasAlunoB.length);
	}
}
