package classe;

public class ClasseDesafio {
	
//O desafio � exibir no m�todo main o valor de "int a =3; sem mexer na linha"

	int a = 3; //n�o pode mexer nessa linha!!
	
	
	public static void main(String[] args) {
		
		ClasseDesafio a1 = new ClasseDesafio();
		
		System.out.println(a1.a);
	}
}

/*
 * Mesmo estando na mesma classe, s� � poss�vel acessar, um membro de inst�ncia
* a partir de um m�todo est�tico, se voc� criar uma inst�ncia. 
*/