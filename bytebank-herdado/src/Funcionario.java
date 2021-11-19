
public abstract class Funcionario {
	
	/*
	 * No exemplo, "funcionário" é um conceito, algo abstrato;
	 * Por ser um conceito abstrato, utilizaremos o abstract para indicar isso;
	 * A palavra abstract está sempre relacionada com herança; 
	 * A classe abstrata não é possivel de ser instanciada.
	 */
	
	private String nome;
	private String cpf;
	private double salario; //público somente para as classes filhos

	public abstract double getBonificacao(); 
	// Método sem corpo, não há implementação.
	// O método será implementado somente nas classes filhas.
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	
}
