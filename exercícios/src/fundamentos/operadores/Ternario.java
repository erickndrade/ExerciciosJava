package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		
		double media = 4.3;
		
		
		String resultadoFinal = media >= 7.0 ? "Aprovado" : 
			media >= 5.0 ? "Em Recupera��o" : "Reprovado";
		
		System.out.println("O aluno est�: " + resultadoFinal);
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "N�o.";
		
		System.out.printf("Tem Desconto? %s", resultado);
	}

}
