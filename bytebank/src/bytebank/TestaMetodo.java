package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {

		Conta contaDoErick = new Conta();
		contaDoErick.saldo = 100;
		contaDoErick.deposita(50);

		System.out.println(contaDoErick.saldo);

		boolean conseguiuRetirar = contaDoErick.saca(20);
		System.out.println(contaDoErick.saldo);
		System.out.println(conseguiuRetirar);

		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(500);

		boolean sucessoTransferencia = contaDaMarcela.transfere(50, contaDoErick);
		if (sucessoTransferencia) {
			System.out.println("Tranferencia realizada com sucesso!");
		} else {
			System.out.println("Erro. Deposite e tente novamente");
		}

		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoErick.saldo);
	}
}
