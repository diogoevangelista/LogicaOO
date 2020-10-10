package br.com.logica.zoologico.heranca;

import java.util.Scanner;

class AnimalDesafio {
    private String nome;
    private String especie;

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
}

class GatoDesafio extends AnimalDesafio {

    @Override
    public String getEspecie() {
        return  getNome() + " � um Gato";
    }
}

public class DesafioSobrescritaMetodo {

    /*
    Implemente uma classe chamada GatoDesafio, que sobrescreva o m�todo getEspecie da superclasse e retorne nome + " � um Gato".
    Entrada de dados
    Felix

    Sa�da esperada
    Felix � um Gato

     */

    public static void main(String[] args) {
        AnimalDesafio a = new GatoDesafio();

        Scanner scann = new Scanner(System.in);
        a.setNome(scann.nextLine());

        System.out.println(a.getEspecie());
        scann.close();
    }
}




    