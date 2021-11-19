
public class TesteReferencias {
	
	public static void main(String[] args) {
		
		Funcionario g1 = new Gerente();
		g1.setSalario(5000.0);
		
		Funcionario ed1 = new EditorVideo();
		ed1.setSalario(2500);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ed1);
		
		System.out.println(controle.getSoma());
	}

}
