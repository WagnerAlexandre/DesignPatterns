package comFactoryMethod.fabricas;


import comFactoryMethod.usuarios.*;

public class CadastroGerente extends Criação {

	@Override
	public Usuario criarUsuario() {
		return new UsuarioGerente();
	}

}
