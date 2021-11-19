
public class Gerente extends Funcionario { //gerente herda da classe funcion�rio.
	
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
	 * Temos dois m�todos "autentica" na mesma classe que variam na 
	 * quantidade ou tipos de par�metros. Isso se chama "sobrecarga" de m�todos.
	 * 
	 * A sobrecarga n�o leva em conta a visibilidade ou retorno do m�todo, 
	 * apenas os par�metros e n�o depende da heran�a.
	 */
	
	public double getBonificacao() {
//		System.out.println("Bonifica��o gerente");
		return super.getSalario();
	}
}
