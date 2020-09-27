package br.com.logica.zoologico.classes;
	

	// Construindo o objeto animal.
public class Animal {
	
	// Atributos ou propriedades do objeto.
	// Neste momento as propriedades são publicas.
	
	private String nome;
	private String especie;
	private int idade;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public String getEspecie() {
		return especie;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getIndade() {
		return idade;
	}
}