public class Main {
    public static void main(String[] args) {
        Arma arma1 = new Arma();
        arma1.nome = "Espada";
        arma1.poder = 5;
        arma1.resistencia = 100;
        arma1.descricao = "Uma espada afiada";

        Arma arma2 = new Arma();
        arma2.nome = "Arco";
        arma2.poder = 5;
        arma2.resistencia = 50;
        arma2.descricao = "Um arco longo para ataques à distância";

        Personagem personagem1 = new Personagem();
        personagem1.nome = "Guerreiro";
        personagem1.arma = arma1;

        Personagem personagem2 = new Personagem();
        personagem2.nome = "Arqueiro";
        personagem2.arma = arma2;

        personagem1.usarArma();
        personagem2.tomarDano();
    }
}
