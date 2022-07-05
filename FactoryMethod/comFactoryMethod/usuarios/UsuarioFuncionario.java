package comFactoryMethod.usuarios;

public class UsuarioFuncionario implements Usuario {

	@Override
	public void paginasDisponiveis() {
		System.out.println("Você têm acesso as seguintes páginas:\n"
				+ "1- Produtos\n"
				+ "2- Vendas\n"
				+ "3- Gerar nota da venda");
	}

	@Override
	public void gerenciarUsuario() {
		System.out.println("Você pode:\n"
				+ "1- Deslogar da sua conta\n"
				+ "2- Alterar seu login\n"
				+ "3- Alterar sua senha");

	}

	@Override
	public void gerenciarProdutos() {
		System.out.println("Você pode:\n"
				+ "1- Remover produto vencido do estoque\n"
				+ "2- Remover produto usado num item");
	}

}
