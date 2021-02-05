package br.com.alura.gerenciador.modelo;

public class Usuario {

	private String login;
	private String senha;
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public boolean ehIgual(String login, String senha) { //Compara os valores dos par�metros existentes no request com os existentes na lista do m�tdo construtor est�tico da classe Banco
		if(!this.login.equals(login)) {
			System.out.println("Not equals login");
			return false;
		}
		
		if(!this.senha.equals(senha)) {
			System.out.println("Not equals senha");
			return false;
		}
		
		return true;
	}
}
