package br.com.logica.zoologico.classes;
	

	// Construindo o objeto animal.
public abstract class Animal {
	
	// Atributos ou propriedades do objeto.
	// Neste momento as propriedades são publicas.
	
	private String corPelo;
	private String nome;
	private String especie;
	private int idade;
	protected boolean estaVivo;
	
	
	public Animal(String nome, String especie, int idade, String corPelo) {
		this.nome = nome;
		this.especie = especie;
		this.idade = idade;
		this.setCorPelo(corPelo);
		this.emitirSom();
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
	public abstract void emitirSom();
	
	public boolean isAdulto() {
		if (estaVivo) {
			return idade >= 5;
		}else {
			return false;
		}
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


		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}