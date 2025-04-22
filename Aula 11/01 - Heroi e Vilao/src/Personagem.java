public abstract class Personagem {
    protected String nome;
    protected int vida;
    protected Arma[] armas;
    protected int totalArmas;

    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
        this.armas = new Arma[10];
        this.totalArmas = 0;
    }

    public void addArma(Arma arma){
        if (totalArmas < armas.length) {
            armas[totalArmas] = arma;
            totalArmas++;
        } else {
            System.out.println("Limite de armas atingido para " + nome);
        }
    }
    public void mostrarArma(){
        if (totalArmas == 0) {
            System.out.println(nome + " não possui armas.");
        } else {
            System.out.println("Armas de " + nome + ":");
            for (int i = 0; i < totalArmas; i++) {
                System.out.println(i + ": " + armas[i]);
            }
        }
    }
    public void atacar(int posicao, Personagem personagem){
        if (posicao < 0 || posicao >= totalArmas) {
            System.out.println("Posição inválida.");
            return;
        }
        Arma arma = armas[posicao];

        if (arma.getDurabilidade() <= 0) {
            System.out.println("A arma está sem durabilidade.");
            return;
        }

        if (personagem.vida <= 0) {
            System.out.println("O personagem " + personagem.nome + " já está derrotado.");
            return;
        }

        personagem.vida -= arma.getDano();
        arma.setDurabilidade(0);
        System.out.println(nome + " atacou " + personagem.nome + " com " + arma.getNome() +
                ", causando " + arma.getDano() + " de dano!");
    }
    public int getVida() {
        return vida;
    }

    public void limparArmas() {
        for (int i = 0; i < totalArmas; i++) {
            armas[i] = null;
        }
        totalArmas = 0;
    }

    public String getNome() {
        return nome;
    }
}
