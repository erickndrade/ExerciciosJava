
public class TestaGetSet {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1234, 56789);
		
		System.out.println(conta.getNumero());
		
		Cliente erick = new Cliente();
		erick.setNome("Erick Augusto");
		
		conta.setTitular(erick);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		
		// agora em 2 linhas
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Prgramador");
		
		System.out.println("ID: " + titularDaConta);
		System.out.println("ID: " + erick);
		System.out.println("ID: " + conta.getTitular());
		
	}
}
