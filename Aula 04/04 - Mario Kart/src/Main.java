public class Main {
    public static void main(String[] args) {
        Piloto p1 = new Piloto();
        Piloto p2 = new Piloto();

        p1.nome="Mario";
        p2.nome="Bowser";

        Kart k1 = new Kart();
        Kart k2 = new Kart();

        k1.nome="Kart do Mario";
        k2.nome="Kart do Bowser";

        k1.motor.cilindradas = "150";
        k1.motor.velocidadeMaxima = 91.20f;

        k2.motor.cilindradas = "50";
        k2.motor.velocidadeMaxima = 76.20f;

        k1.piloto = p1;
        k2.piloto = p2;


        //Executando acoes do piloto
        p1.soltaSuperPoder();
        p2.soltaSuperPoder();

        //Executando acoes do Kart1
        k1.fazerDrift();
        k1.motor.mostraInfo();

        //Executando acoes do Kart2
        k2.soltarTurbo();
        k2.motor.mostraInfo();
    }
}