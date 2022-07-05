package semFactorymethod;

public class Gerente {
	private String nome;

	public void paginasDisponiveis() {
		System.out.println("Você têm acesso as seguintes páginas:\n"
				+ "1- Usuários\n"
				+ "2- Fornecedores\n"
				+ "3- Produtos\n"
				+ "4- Cardápio\n"
				+ "5- Clientes\n"
				+ "6- Vendas\n"
				+ "7- Relatórios");
	}

	public void gerenciarUsuario() {
		System.out.println("Você pode:\n"
				+ "1- Deslogar da sua conta\n"
				+ "2- Alterar seu login\n"
				+ "3- Alterar sua senha\n"
				+ "4- Alterar login e/ou senha de um funcionário\n"
				+ "5- Remover funcionário\n"
				+ "6- Cadastrar novo usuário");

	}


	public void gerenciarProdutos() {
		System.out.println("Você pode:\n"
				+ "1- Remover qualquer produto\n"
				+ "2- Atualizar o estoque de um produto\n"
				+ "3- Adicionar novo produto\n"
				+ "4- Vincular um produto a um item");
	}
	
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
}
