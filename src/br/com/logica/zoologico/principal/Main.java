package br.com.logica.zoologico.principal;

import br.com.logica.zoologico.heranca.Cachorro;

public class Main {

	public static void main(String[] args) {
		//Criando uma nova instacia do objeto.
		
		
		Cachorro Cachorro = new Cachorro ("Rex", "cachorro", 7, "banco");
		
		
		System.out.println("Nome do animal � " + Cachorro.getNome());
		
		if(Cachorro.isAdulto()) {
			System.out.println("o cachorro � adulto");
		}else {
			System.out.println("o cachorro n�o � aduto, ou esta morto");
		
	}
		
	
}
	
}
