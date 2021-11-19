package classe;



public class DataVar {

	int dia;
	int mes;
	int ano;
	
	public DataVar(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano; 
/*
 * se seu metodo passa parametro com o mesmo nome de um atributo da 
 * classe, ent�o para se referenciar a aquela instancia do metodo, 
 * se usa o this., sen�o fizer isso, java ira entender que quer alterar o 
 * atributo da classe.
 */
	}
	
	public DataVar() {
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		this(1, 1, 1970);
/*
 * Voc� pode usar o this() dentro de um construtor para se referir a 
 * 	 outro construtor.
 */
	}
	
	 String obterData() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
}
