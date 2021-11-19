
public class TestaContaSemCliente {

	public static void main(String[] args) {
		
		Conta contaDaAmanda = new Conta();
		System.out.println(contaDaAmanda.titular);
			
		contaDaAmanda.titular = new Cliente();
		contaDaAmanda.titular.nome = "Amanda";
		System.out.println(contaDaAmanda.titular.nome);
		
		Cliente amanda = contaDaAmanda.titular;
		System.out.println(amanda.nome);
	}
}
