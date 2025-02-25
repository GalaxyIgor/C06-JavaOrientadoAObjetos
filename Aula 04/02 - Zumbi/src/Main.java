

public class Main {
    public static void main(String[] args) {
        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        z1.vida = 100;
        z2.vida = 80;

        z1.mostraVida();
        z2.mostraVida();

        z1.transfereVida(z2, 20);
        
        z1.mostraVida();
        z2.mostraVida();

    }
}