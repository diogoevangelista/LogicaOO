package br.com.logica.zoologico.principal;

import br.com.logica.zoologico.classes.Animal;

public class Main {

	public static void main(String[] args) {
		//Criando uma nova instacia do objeto.
		Animal a1 = new Animal();
		
		a1.setNome ("Jojo Todinho");
		a1.setEspecie ("gato");
		a1.setIdade (1);
		
		Animal a2 = new Animal();
		
		a2.setNome("Spike");
		a2.setEspecie("cachorro");
		a2.setIdade(6);
		
		System.out.println("Nome do animal é " + a1.getNome());
	
	}
	
	
}
