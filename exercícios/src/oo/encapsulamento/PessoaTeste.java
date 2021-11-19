package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("Erick", "Augusto", -27);
		pessoa.setIdade(270); // teste de altera��o
		
		System.out.println(pessoa.getNomeCompleto()); // leitura por m�todo
		System.out.println(pessoa.getIdade()); // leitura por m�todo
		System.out.println(pessoa); // toString

	}

}
