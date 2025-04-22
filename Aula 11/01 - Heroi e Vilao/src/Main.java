public class Main {
    public static void main(String[] args) {
        Heroi batman = new Heroi("Batman",100);
        Vilao coringa = new Vilao("Coringa",100);

        Arma batrangue = new Arma("Batrangue", 10, 100);
        Arma batgancho = new Arma("Batgancho", 5, 100);
        Arma faca = new Arma("Faca", 5, 120);
        Arma bomba = new Arma("Bomba", 25, 10);

        batman.addArma(batrangue);
        batman.addArma(batgancho);

        coringa.addArma(faca);
        coringa.addArma(bomba);

        batman.mostrarArma();
        coringa.mostrarArma();

        batman.usarEspecial(coringa);
        coringa.usarEspecial(batman);

        batman.mostrarArma();
        coringa.mostrarArma();

        System.out.println("Vida do Herói: " + batman.getVida());
        System.out.println("Vida do Vilão: " + coringa.getVida());
    }
}