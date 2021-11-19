package classe;

public class EqualsUsuario {

	String nome;
	String email;

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof EqualsUsuario) {
			EqualsUsuario outro = (EqualsUsuario) obj;

			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);

			return nomeIgual && emailIgual;

		} else {
			return false;
		}

	}

}
