package br.com.logica.zoologico.principal;

import br.com.logica.zoologico.heranca.Cachorro;

public class Main {

	public static void main(String[] args) {
		//Criando uma nova instacia do objeto.
		
		
		Cachorro Cachorro = new Cachorro ("Rex", "cachorro", 7, "banco");
		
		
		System.out.println("Nome do animal é " + Cachorro.getNome());
		
		if(Cachorro.isAdulto()) {
			System.out.println("o cachorro é adulto");
		}else {
			System.out.println("o cachorro não é aduto, ou esta morto");
		
	}
		
	
}
	
}
