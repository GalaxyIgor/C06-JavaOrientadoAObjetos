public class Kart {
    public String nome;
    Motor motor;
    Piloto piloto;

    public Kart() {
        motor = new Motor();
    }

    public void pular(){
        System.out.println("Carro" + nome + "Pulando");
    }
    public void soltarTurbo(){
        System.out.println("Carro" + nome + "Soltando Turbo");
    }
    public void fazerDrift(){
        System.out.println("Carro" + nome + "Fazendo Drift");
    }

}
