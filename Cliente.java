package br.com.proway.livraria;

public class Cliente {
	
	private String nome;
	private String email;
	private String cpf;
	private String endereco;


	public Cliente() {
		
	}


	public Cliente( String nome, String email, String cpf, String endereco) {
		super();
		
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.endereco = endereco;
		
	}



	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
		
		public void imprimirDados() {
			System.out.println("Nome: "+ this.nome);
			System.out.println("Email: "+ this.email);
			System.out.println("CPF: "+ this.cpf);
			System.out.println("Endereço: "+ this.endereco);
			
		}


	
		
	
	
 


}