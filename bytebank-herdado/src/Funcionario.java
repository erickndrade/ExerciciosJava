
public abstract class Funcionario {
	
	/*
	 * No exemplo, "funcion�rio" � um conceito, algo abstrato;
	 * Por ser um conceito abstrato, utilizaremos o abstract para indicar isso;
	 * A palavra abstract est� sempre relacionada com heran�a; 
	 * A classe abstrata n�o � possivel de ser instanciada.
	 */
	
	private String nome;
	private String cpf;
	private double salario; //p�blico somente para as classes filhos

	public abstract double getBonificacao(); 
	// M�todo sem corpo, n�o h� implementa��o.
	// O m�todo ser� implementado somente nas classes filhas.
	
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
