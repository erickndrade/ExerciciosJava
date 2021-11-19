package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		
		 Scanner entrada = new Scanner(System.in);
		 
		 System.out.print("Quantos Alunos: ");
		 int qtdeAlunos = entrada.nextInt();
		 
		 System.out.print("Quantas notas por aluno: ");
		 int qtdeNotas = entrada.nextInt();
		 
		 double [][] notasDaTurma = new double[qtdeAlunos][qtdeNotas];
		
		 double total = 0;
		 for (int aluno = 0; aluno < notasDaTurma.length; aluno++) {
			 for (int nota = 0; nota < notasDaTurma[aluno].length; nota++) {
				 System.out.printf("Digite a nota %d do aluno %d: ", 
						 			nota + 1, aluno + 1);
				 notasDaTurma[aluno][nota] = Double.parseDouble(entrada.next());
				 total += notasDaTurma[aluno][nota];
			}
		}

		double media = total / (qtdeAlunos * qtdeNotas);
		 System.out.printf("A média é: %.2f\n", media);
		 
		 for (double[] i : notasDaTurma) {
			System.out.println(Arrays.toString(i));
			/*
			 * Arrays.toString: retorna uma representação de string do conteúdo 
			 * da matriz double especificada. A representação da string consiste
			 * em uma lista dos elementos da matriz, entre colchetes.
			 */
		}
		 
		  entrada.close();
	}

}
