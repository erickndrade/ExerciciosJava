package classe;

public class ClasseDesafio {
	
//O desafio é exibir no método main o valor de "int a =3; sem mexer na linha"

	int a = 3; //não pode mexer nessa linha!!
	
	
	public static void main(String[] args) {
		
		ClasseDesafio a1 = new ClasseDesafio();
		
		System.out.println(a1.a);
	}
}

/*
 * Mesmo estando na mesma classe, só é possível acessar, um membro de instância
* a partir de um método estático, se você criar uma instância. 
*/