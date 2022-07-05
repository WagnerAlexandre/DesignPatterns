package comFactoryMethod.fabricas;

import comFactoryMethod.usuarios.Usuario;

public abstract class Criação {
	
	/**
	 * Factory Method
	 */
	public abstract Usuario criarUsuario();
	
	public void atribuicoes() {
		Usuario novoUsuario = criarUsuario();
		novoUsuario.paginasDisponiveis();
		novoUsuario.gerenciarProdutos();
		novoUsuario.gerenciarUsuario();
	}
}
