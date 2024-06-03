package br.com.proway.livraria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Livraria livraria = new Livraria("Old Livros", "Rua Conceição, 123");
		
		

		
		
	Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
		System.out.println("Menu");
		System.out.println("1- Adicionar Livro");
		System.out.println("2- Listar livros");
		System.out.println("3- Realizar venda");
		System.out.println("4- Cadastrar cliente");
		System.out.println("5- Listar clientes");
		System.out.println("6- Sair");
		System.out.println("Escolha uma opção: ");
		int opcao = scanner.nextInt();
		
		scanner.nextLine();
		
		switch (opcao) {
		
		case 1:
			 System.out.print("Digite o título do livro: ");
             String titulo = scanner.nextLine();
             System.out.print("Digite o autor do livro: ");
             String autor = scanner.nextLine();
             System.out.print("Digite o ano de publicação: ");
             int anoPublicacao = scanner.nextInt();
             System.out.print("Digite o número de páginas: ");
             int numeroPaginas = scanner.nextInt();
             System.out.print("Digite a quantidade em estoque: ");
             int quantidadeEstoque = scanner.nextInt();
             scanner.nextLine(); 
             
             Livro livro = new Livro(titulo, autor, anoPublicacao, numeroPaginas, quantidadeEstoque);
             livraria.adicionarLivro(livro);
             break;
             
		case 2:
			livraria.imprimirCatalogo();
			break;
			
		case 3:
			System.out.println("Digite o título do livro da venda: ");
			String tituloVenda = scanner.nextLine();
			livraria.realizarVenda(tituloVenda);
			break;
			
		case 4:
			
			 System.out.print("Digite o nome do cliente: ");
             String nomeCliente = scanner.nextLine();
             System.out.print("Digite o CPF do cliente: ");
             String cpfCliente = scanner.nextLine();
             System.out.println("Digite o Email do cliente: ");
             String emailCliente = scanner.nextLine();
             System.out.print("Digite o endereço do cliente: ");
             String enderecoCliente = scanner.nextLine(); 
             
             Cliente cliente = new Cliente(nomeCliente, emailCliente, cpfCliente, enderecoCliente);
             livraria.adicionarCliente(cliente);
             break;
          
		case 5:
			livraria.listarClientes();
			break;
		
		case 6:
			scanner.close();
			System.out.println("Saindo...");
			return;
		
		
		default:
			System.out.println("Opção inválida, tente novamente!");
			break;
			
		}
		
			
			
		
			
			
			
			
			
			
			
			
			
			
			
			
		}
	
	}

}
