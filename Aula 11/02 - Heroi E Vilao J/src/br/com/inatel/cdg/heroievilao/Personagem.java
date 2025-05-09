package br.com.inatel.cdg.heroievilao;

abstract class Personagem {
    protected String nome;
    protected int vida;
    protected Arma[] armas;
    protected int quantidadeArmas;

    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
        this.armas = new Arma[10]; // Capacidade para 10 armas
        this.quantidadeArmas = 0;
    }
    public void addArma(){

    }
    public void mostrarArma(){

    }
    public void atacar (int posicao, Personagem personagem){
        if (posicao < 0 || posicao >= quantidadeArmas) {
            System.out.println("Posição de arma inválida!");
            return;
        }

        Arma arma = armas[posicao];

        // Passo 1: Verificar durabilidade da arma
        if (arma.getDurabilidade() <= 0) {
            System.out.println("A arma " + arma.getNome() + " está quebrada!");
            return;
        }

        // Passo 2: Verificar vida do alvo
        if (personagem.getVida() <= 0) {
            System.out.println(personagem.getNome() + " já está derrotado!");
            return;
        }

        // Passo 3: Realizar ataque
        System.out.println(nome + " atacou " + personagem.getNome() +
                " com " + arma.getNome() + " causando " +
                arma.getDano() + " de dano!");
        personagem.receberDano(arma.getDano());
        arma.setDurabilidade(0); // Arma quebra após o uso
    }


}
