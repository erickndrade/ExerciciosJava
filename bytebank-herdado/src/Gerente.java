
public class Gerente extends Funcionario { //gerente herda da classe funcionário.
	
	private int senha;
	private String login;
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean autentica(String login, int senha) {
		if (this.senha == senha && this.login == login) {
			return true;
		}else {
			return false;
		}
	}
	
	/*
	 * Temos dois métodos "autentica" na mesma classe que variam na 
	 * quantidade ou tipos de parâmetros. Isso se chama "sobrecarga" de métodos.
	 * 
	 * A sobrecarga não leva em conta a visibilidade ou retorno do método, 
	 * apenas os parâmetros e não depende da herança.
	 */
	
	public double getBonificacao() {
//		System.out.println("Bonificação gerente");
		return super.getSalario();
	}
}
