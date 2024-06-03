package br.com.proway.livraria;

import java.util.ArrayList;

public class Livraria {
	private String nome;
	private String endereço;
	private ArrayList<Livro> catalogo;
	private ArrayList<Cliente> ListaDeClientes;
	
	public Livraria() {
		  this.catalogo = new ArrayList<>();
	      this.ListaDeClientes = new ArrayList<>();
	}

	public Livraria(String nome, String endereço) {
		super();
		this.nome = nome;
		this.endereço = endereço;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	
	public ArrayList<Livro> getCatalogo() {
		return catalogo;
	}

	public void setCatalogo(ArrayList<Livro> catalogo) {
		this.catalogo = catalogo;
	}
	
	public ArrayList<Cliente> getListaDeClientes() {
		return ListaDeClientes;
	}

	public void setListaDeClientes(ArrayList<Cliente> listaDeClientes) {
		ListaDeClientes = listaDeClientes;
	}

	
	public void imprimirDados() {
		System.out.println("Nome livraria: "+ this.nome);
		System.out.println("Endereço: "+ this.endereço);
	}
	
	public void adicionarLivro(Livro livro) {
		this.catalogo.add(livro);
		System.out.println("Livro adicionado ao catálogo");
	}
	
	public void imprimirCatalogo() {
		System.out.println("Catálogo de livros: ");
		for(Livro livro : this.catalogo) {
			livro.imprimirDados();
			System.out.println(livro.getTitulo());
		}
	}
	
	public void adicionarCliente(Cliente cliente) {
		this.ListaDeClientes.add(cliente);
		 System.out.println("Cliente cadastrado com sucesso.");
		
	}
	
	public void listarClientes() {
		System.out.println("Lista de Clientes:");
		for(Cliente cliente : this.ListaDeClientes) {
			cliente.imprimirDados();
		}
	}

	 public void realizarVenda(String titulo) {
	        for (Livro livro : this.catalogo) {
	            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
	                livro.realizarVenda();
	                return;
	            }
	        }
	        System.out.println("Livro não encontrado.");
	    }
}
