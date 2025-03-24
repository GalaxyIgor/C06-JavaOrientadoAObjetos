import br.inatel.cdg.inimigo.Asteroide;
import br.inatel.cdg.jogador.Nave;
public class Main {
    public static void main(String[] args) {

        Nave nave = new Nave("Millennium Falcon", "Explosivo", 100);
        Asteroide asteroideGrande = new Asteroide("B612", "Grande");
        Asteroide asteroidePequeno = new Asteroide("P201", "Pequeno");

        nave.atirar(asteroideGrande);
        nave.atirar(asteroidePequeno);

        Nave nave2 = new Nave("Enterprise", "Normal", 100);
        nave2.atirar(asteroideGrande);
        nave2.atirar(asteroidePequeno);
    }
}