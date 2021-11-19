
public class TesteContas {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(1234, 56789);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(4321, 98765);
		cp.deposita(200.0);
		
		cc.transfere(10.0, cp);
		
		System.out.println("Conta corrente: " + cc.getSaldo());
		System.out.println("Conta poupança: " + cp.getSaldo());
		
		cc.imprimeExtrato();
		cp.imprimeExtrato();
	}

}
