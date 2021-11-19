
public class TesteGerente {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		g1.setNome("Artur");
		g1.setCpf("987.654.321-00");
		g1.setSalario(5000.0);
						
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(58738);
		g1.setLogin("rck12345");
		
		boolean autenticou = g1.autentica("rck12345", 58738);
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
	}

}
