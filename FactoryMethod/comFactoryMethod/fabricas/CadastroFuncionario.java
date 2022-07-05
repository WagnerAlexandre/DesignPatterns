package comFactoryMethod.fabricas;

import comFactoryMethod.usuarios.*;

public class CadastroFuncionario extends Criação {

	@Override
	public Usuario criarUsuario() {
		return new UsuarioFuncionario();
	}

}
