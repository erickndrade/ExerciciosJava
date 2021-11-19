package oo.composicao;

import java.util.ArrayList;

public class Aluno {

	final String nome;

	final ArrayList<Curso> cursos = new ArrayList<Curso>();

	public Aluno(String nome) {
		this.nome = nome;
		// TODO Auto-generated constructor stub
	}

	void addCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	Curso getCursoPorNome(String nome) {
		
		for (Curso curso : this.cursos) {
			if (curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
			
		}
		return null;
	}
	
	public String toString() {
		return nome;
	}

}
