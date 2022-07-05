package comFactoryMethod;

import java.util.Scanner;

import comFactoryMethod.fabricas.Criação;
import comFactoryMethod.fabricas.*;

public class Main {
	private static Criação cadastro;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("O que você deseja cadastrar?\n"
				+ "1 - Funcionário\n"
				+ "2 - Gerente\n"
				+ "Resposta: ");
		
		int escolha = input.nextInt();
		
		if (escolha == 1) {
			cadastro = new CadastroFuncionario();
		} else {
			cadastro = new CadastroGerente();
		}
		
		System.out.println("Aqui está o que esse usuário pode fazer:");
		cadastro.atribuicoes();
		input.close();
		
	}

}
