package collections;

import java.util.Objects;

public class UserLista {
	
	String nome;
	
	UserLista(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return "Meu nome é: " + this.nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserLista other = (UserLista) obj;
		return Objects.equals(nome, other.nome);
	}

	
}
