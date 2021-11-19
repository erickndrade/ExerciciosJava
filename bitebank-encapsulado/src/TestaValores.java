
public class TestaValores {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1234, 56789);
	
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(1234, 56783);
		
		System.out.println(conta2.getNumero());
		
		System.out.println(Conta.getTotal());

	}
}
