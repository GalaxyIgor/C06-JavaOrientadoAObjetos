public class Personagem {
    public String nome;
    public int pontos = 100;
    Arma arma;

    public void usarArma() {
        System.out.println("Usando arma");
        arma.usar();
        System.out.println("Pontos totais de " + this.nome + ": " + this.pontos);
        System.out.println("Resistencia totais de " + this.nome + ": " + arma.resistencia);
    }

    public void tomarDano() {
        System.out.println("Tomando dano de -5 pontos");
        this.pontos -= 5;
        System.out.println("Pontos totais de " + this.nome + ": " + this.pontos);
        System.out.println("Resistencia totais de " + this.nome + ": " + arma.resistencia);
    }
}
