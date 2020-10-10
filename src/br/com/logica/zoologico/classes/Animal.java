package br.com.logica.zoologico.classes;

import br.com.logica.zoologico.interfaces.IAnimal;

	// Construindo o objeto animal.
public abstract class Animal implements IAnimal {
	
	// Atributos ou propriedades do objeto.
	// Neste momento as propriedades são publicas.
	
	private String corPelo;
	private String nome;
	private String especie;
	protected int idade;
	protected boolean estaVivo;
	
	
	public Animal(String nome, String especie, int idade, String corPelo) {
		this.nome = nome;
		this.especie = especie;
		this.idade = idade;
		this.setCorPelo(corPelo);
		this.estaVivo = true;
	}
	
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
	
	public void SetCorPelo(String corPelo) {
		this.setCorPelo(corPelo);
	}

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	//quando adicionado o final no metodo
	//é impossivel faer sobrescita de metodos pelas
	//classes filhas
	

		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}