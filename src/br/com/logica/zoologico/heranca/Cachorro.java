package br.com.logica.zoologico.heranca;


import br.com.logica.zoologico.classes.Animal;

public class Cachorro extends Animal {
	
	public void cachorro(String nome) {
		
	}
	public void emitirSom1() {
		if(estaVivo) {
		}else {
			System.out.println("O animal morreu");
		}
	}
	

	public Cachorro(String nome, String especie, int idade, String corPelo) {
		super(nome, especie, idade, corPelo);
	}
	public Cachorro (String nome, int idade) {
		super(nome, "Cachorro", idade, nome);
	}

	
	public void emitirSom() {
		System.out.println("Latindo");
		
	}
	
	


	
	
}