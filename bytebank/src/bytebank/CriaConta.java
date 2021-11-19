package bytebank;

public class CriaConta {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200.00;
//		System.out.println(primeiraConta.saldo);

		primeiraConta.saldo += 100;
//		System.out.println(primeiraConta.saldo);

		Conta segundaConta = new Conta();
		segundaConta.saldo = 50.0;

		System.out.println("primeira conta tem " + primeiraConta.saldo);
		System.out.println("segunda conta tem " + segundaConta.saldo);

		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		System.out.println(primeiraConta.titular);

		segundaConta.agencia = 150;
		System.out.println("A ag�ncia da segunda conta � " + segundaConta.agencia);

		if (primeiraConta == segundaConta) {

			System.out.println("A mesma conta");
		} else {
			System.out.println("Contas diferentes");
		}
		
		//refer�ncia para objetos diferentes:
		//Duas ref�ncias para o mesmo objeto:
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
