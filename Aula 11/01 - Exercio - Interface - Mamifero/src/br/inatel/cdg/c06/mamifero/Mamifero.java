package br.inatel.cdg.c06.mamifero;

public class Mamifero {
    protected String nome;
    protected double vida;

    public Mamifero(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }
    public void emitirSom(){
        System.out.println("Som do Mamifero");
    }
    public void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Vida: " + this.vida);
    }
}
