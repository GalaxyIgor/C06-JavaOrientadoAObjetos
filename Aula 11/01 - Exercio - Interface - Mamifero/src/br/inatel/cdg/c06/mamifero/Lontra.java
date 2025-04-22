package br.inatel.cdg.c06.mamifero;

import br.inatel.cdg.c06.interfaces.Aquatico;

public class Lontra extends Mamifero implements Aquatico {
    public Lontra(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void nadar() {
        System.out.println("Nadando...");
    }
}
