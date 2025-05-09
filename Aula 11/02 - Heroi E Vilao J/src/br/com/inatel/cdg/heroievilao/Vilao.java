package br.com.inatel.cdg.heroievilao;

public class Vilao extends Personagem implements Combater{
    public Vilao(String nome, int vida) {
        super(nome, vida);
    }

    @Override
    public void usarEspecial(Personagem personagem) {
        System.out.println("Usando uma especial de vilao");
    }
}
