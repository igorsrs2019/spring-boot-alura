package br.com.alura.forum.controller.form;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

public class LoginForm {

	
	private String email;
	private String Senha;
	
	
	
	
	public void setEmail(String email) {
		this.email = email;
	}
	public void setSenha(String senha) {
		Senha = senha;
	}
	
	public String getEmail() {
		return email;
	}
	public String getSenha() {
		return Senha;
	}
	public UsernamePasswordAuthenticationToken converter() {
	
		return new UsernamePasswordAuthenticationToken(email, Senha);
	}
}
