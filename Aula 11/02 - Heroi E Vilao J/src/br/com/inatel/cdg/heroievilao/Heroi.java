package br.com.inatel.cdg.heroievilao;

public class Heroi extends Personagem implements Combater{

    public Heroi(String nome, int vida) {
        super(nome, vida);
    }

    @Override
    public void usarEspecial(Personagem personagem) {
        System.out.println("Usando Especial de Heroi");
    }
}
