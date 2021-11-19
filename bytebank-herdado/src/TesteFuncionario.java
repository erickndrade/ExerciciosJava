
public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Gerente erick = new Gerente();
		erick.setNome("Erick Augusto");
		erick.setCpf("123.456.789-00");
		erick.setSalario(1500.0);
		
		System.out.println(erick.getSalario());
		System.out.println(erick.getBonificacao());
		
	}

}
