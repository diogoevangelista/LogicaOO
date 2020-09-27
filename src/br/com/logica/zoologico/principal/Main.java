package br.com.logica.zoologico.principal;

import br.com.logica.zoologico.classes.Animal;

public class Main {

	public static void main(String[] args) {
		//Criando uma nova instacia do objeto.
		Animal a1 = new Animal("branco", "gato", 1);
		
		
		Animal a2 = new Animal("Rex", "cachorro", 2);
		
		Animal a3 = new Animal("branco", "asd", 2);
		a3.setNome ("bicho");
	
		
		System.out.println("Nome do animal é " + a1.getNome());
		System.out.println("Nome do animal é " + a2.getNome());
		
		if(a2.isAdulto()) {
			System.out.println("o cachorro é adulto");
		}else {
			System.out.println("o cachorro não é aduto");
		}
		if(a1.isAdulto()) {
			System.out.println("o gato é adulto");
		}else {
			System.out.println("o gato não é aduto");
		}
	}
	
		
	
}
	

