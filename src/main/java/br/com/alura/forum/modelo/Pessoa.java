package br.com.alura.forum.modelo;

public class Pessoa {
	private String nome;
	private String nacionalidade;
	private int idade;
	private String sexo;
	
	public Pessoa(String nome, String nacionalidade, int idade, String sexo) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	

}
