public class Main {
    public static void main(String[] args) {
        // chamando a classe zumbi
        Zumbi z = new Zumbi();

        // associação
        // com fome
        z.fome = true;
        z.atacar();
        // sem fome
        z.fome = false;
        z.atacar();
        // outras ações
        z.rastejar();
        z.morrer();

    }
}