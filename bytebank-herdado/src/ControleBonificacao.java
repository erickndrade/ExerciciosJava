
public class ControleBonificacao {

	private double soma;
		
	public void registra(Funcionario f1) {
		double bonificacao = f1.getBonificacao();
		System.out.println("Sua bonifcação é: " + bonificacao);
		this.soma += bonificacao;
	}
	
	public double getSoma() {
		return soma;
	}

}
