package exercicio;

public class AcademiaCliente {

	String nome;
	double peso;
	
	double pesoFinal() {
		return peso;
	}
	
	void ficarBombado(double massaGanha) {
		this.peso += massaGanha;
	}
	
	
	public AcademiaCliente() {
		// TODO Auto-generated constructor stub
	}
	
	public AcademiaCliente(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
}
