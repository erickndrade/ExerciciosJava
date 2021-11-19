package oo.composicao;

public class AlunoTeste {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Erick");
		Aluno aluno2 = new Aluno("Yago");
		Aluno aluno3 = new Aluno("Artur");
		
		Curso curso1 = new Curso("Java");
		Curso curso2 = new Curso("Js");
		Curso curso3 = new Curso("Python");
		
		curso1.addAluno(aluno1);
		curso1.addAluno(aluno2);
		
		curso2.addAluno(aluno1);
		curso2.addAluno(aluno3);
		
//		curso3.addAluno(aluno2);
//		curso3.addAluno(aluno3);
		
		aluno1.addCurso(curso3);
		aluno2.addCurso(curso3);
		aluno3.addCurso(curso3);
		
		for(Aluno aluno : curso1.alunos) {
			System.out.println("Estou matriculado no curso " + 
								curso1.nome + ".");
			System.out.println("E meu nome �: " + aluno.nome);
			System.out.println();
		}
		
		System.out.println(aluno1.cursos.get(0).alunos);
		
		Curso cursoEncontrado = aluno1.getCursoPorNome("Javas");
		
		if (cursoEncontrado != null) {
			System.out.println(cursoEncontrado.alunos);
			System.out.println(cursoEncontrado.nome);
		}
	}
	
	
}
