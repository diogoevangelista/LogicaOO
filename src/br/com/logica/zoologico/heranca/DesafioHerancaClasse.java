package br.com.logica.zoologico.heranca;

import java.util.Scanner;

public class DesafioHerancaClasse {

		abstract class Titulo {
		
		protected String Titulo;
		
		public abstract void setTitulo(String s);
			
		 public String getTitulo() {
		        return Titulo;
		}
		}
		 class MeuLivro extends Titulo{
			 
			 private String Titulo;

			public void setTitulo(String s) {
				 this.Titulo = s;
				 
			 }
		 }
		
}
			
		
		
		
			 
		 
			 
			
		 
			 
			 
		 
	
	
	
	
	
	
	
	
	
	

