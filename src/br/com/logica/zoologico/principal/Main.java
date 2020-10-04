package br.com.logica.zoologico.principal;

import br.com.logica.zoologico.heranca.Cachorro;

public class Main {

	public static void main(String[] args) {
		//Criando uma nova instacia do objeto.
		
		
		Cachorro a2 = new Cachorro ("Rex", "cachorro", 2, "banco");
		
		
		System.out.println("Nome do animal é " + a2.getNome());
		
		if(a2.isAdulto()) {
			System.out.println("o cachorro é adulto");
		}else {
			System.out.println("o cachorro não é aduto");
		
	}
	
}
	
}
