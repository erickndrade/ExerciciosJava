package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		//tipos num�ricos inteiros
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 3456879;
		long pontosAcumulados = 1_234_567_890; 
		
		//tipos num�ricos reais
		
		float salario = 10_500.95F;
		double vendasAcumuladas = 1_234_567_890.05;
		
		//tipo booleano
		
		boolean estaDeFerias = false; //ou true
		
		//tipo caractere
		
		char status = 'A'; // ativo
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365 + " Dias de Empresa");
		
		//N�meros de viagens
		System.out.println(numeroDeVoos / 2 + " Viagens");
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println("ID n�: " + id + ": ganha -> " + "R$" + salario);
		
		System.out.println("F�rias? " + estaDeFerias);
		
		System.out.println("Status: " + status);
		
		
		
	}
}
