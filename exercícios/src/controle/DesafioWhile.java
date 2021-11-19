package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {

		/*
		 * calcular a m�dia das notas de uma turma; digitar uma nota valida entre 0 e
		 * 10; armazenar a nota numa var = total; sempre que uma nota for digitada,
		 * armazenar no valor de total; outra variavel pra mostrar quantas notas foram
		 * digitadas; para sair o usu�rio deve digitar -1; Mostar uma mensagem caso a
		 * nota for inv�lida;
		 * 
		 */
		Scanner entrada = new Scanner(System.in);

		double nota = 0;
		double total = 0;
		int numeroDeNotas = 0;

		while (nota != -1) {
			System.out.print("Digite a nota: ");
			nota = Double.parseDouble(entrada.nextLine()) ;
			if (nota < -1 || nota > 10) {
				System.out.println("Nota Inv�lida, digite outra nota");
				continue;
			} else if (nota >= 0 && nota <= 10) {
				System.out.println("Sua nota �: " + nota);
				total = nota + total;
				System.out.println("O valor total de notas �: " + total);
				numeroDeNotas++;
				System.out.println("N� de notas: " + numeroDeNotas);
			} else {
				System.out.println("a m�dia final �: " + total / numeroDeNotas);
			}

		}

		entrada.close();
	}

}
