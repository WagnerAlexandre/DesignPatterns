package semFactorymethod;

import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("O que você deseja cadastrar?\n"
				+ "1 - Funcionário\n"
				+ "2 - Gerente\n"
				+ "Resposta: ");
		
		int escolha = input.nextInt();
		
		System.out.println("Essas são as páginas disponíveis para esse usuário:");
		
		if (escolha == 1) {
			Funcionario funcionario = new Funcionario();
			funcionario.paginasDisponiveis();
			funcionario.gerenciarProdutos();
			funcionario.gerenciarUsuario();
		} else {
			Gerente gerente = new Gerente();
			gerente.paginasDisponiveis();
			gerente.gerenciarProdutos();
			gerente.gerenciarUsuario();
		}
		
		input.close();
		
	}

}
