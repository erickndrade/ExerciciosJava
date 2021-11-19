package treino;

public class Programa {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.nome = "Erick Augusto";
		p1.cpf = "123.456.789-00";
		p1.idade = 27;
		
		p1.endereco = new Endereco();
		p1.endereco.logradouro = "Rua Orleans";
		p1.endereco.complemento = "Bosque";
		p1.endereco.numero = "100";
		p1.endereco.bairro = "Jd Europa";
		p1.endereco.cidade = "Uberlândia";
		p1.endereco.cep = "12.345-678";
		
				
		System.out.println(p1.endereco.complemento);
	}

}
