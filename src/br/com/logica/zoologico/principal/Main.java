package br.com.logica.zoologico.principal;

import br.com.logica.zoologico.classes.Animal;

public class Main {

	public static void main(String[] args) {
		//Criando uma nova instacia do objeto.
		Animal a1 = new Animal("branco", "gato", 1);
		
		
		Animal a2 = new Animal("Rex", "cachorro", 2);
	
		
		System.out.println("Nome do animal � " + a1.getNome());
		System.out.println("Nome do animal � " + a2.getNome());
		
		if(a2.isAdulto()) {
			System.out.println("o cachorro � adulto");
		}else {
			System.out.println("o cachorro n�o � aduto");
		}
		if(a1.isAdulto()) {
			System.out.println("o gato � adulto");
		}else {
			System.out.println("o gato n�o � aduto");
		}
	}
	
	
	
}
