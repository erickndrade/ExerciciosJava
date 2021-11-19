
public class TesteSaqueNegativo {
	
	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		conta1.deposita(200);
		conta1.saca(300);
		
		System.out.println(conta1.getSaldo());

	}
}
