public class Arma {
    public String nome;
    public int poder;
    public int resistencia;
    public String descricao;

    public void usar(){
        this.resistencia -= 2;
    }

    public void mostraInfoArma(){
        System.out.println("Nome: " + nome);
        System.out.println("Poder: " + poder);
        System.out.println("Resistencia: " + resistencia);
        System.out.println("Descricao: " + descricao);
    }
}
