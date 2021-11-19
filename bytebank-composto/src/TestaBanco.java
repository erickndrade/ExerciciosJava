
public class TestaBanco {
	
public static void main(String[] args) {
	
	Cliente erick = new Cliente();
	erick.nome = "Erick Augusto";
	erick.cpf = "123.456.789-00";
	erick.profissao = "psicologo";
	
	Conta contaDoErick = new Conta();
	contaDoErick.deposita(500);
	
	System.out.println(contaDoErick.getSaldo());
	
	contaDoErick.titular = erick;
	System.out.println(contaDoErick.titular.nome);
}
}
