package br.com.inatel.cdg.heroievilao;

public class Main {
    public static void main(String[] args) {
        Personagem batman = new Heroi("Batman", 100);
        Personagem coringa = new Vilao("Coringa", 100);

        Arma baterangue = new Arma("Baterangue", 10, 100);
        Arma batgancho = new Arma("batgancho", 10, 100);

        Arma faca = new Arma("faca", 10, 100);
        Arma bomba = new Arma("bomba", 10, 100);

        batman.armas = baterangue;
        batman.armas = batgancho;
        coringa.armas = faca;
        coringa.armas = bomba;
    }
}