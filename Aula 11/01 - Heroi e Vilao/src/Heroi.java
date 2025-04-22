public class Heroi extends Personagem implements Combater{
    public Heroi(String nome, int vida) {
        super(nome, vida);
    }

    @Override
    public void usarEspecial(Personagem personagem) {
        personagem.limparArmas();
        System.out.println(nome + " usou especial! " + personagem.getNome() + " foi desarmado!");
    }
}
