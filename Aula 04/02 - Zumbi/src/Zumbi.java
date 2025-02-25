public class Zumbi {

    // zumbi sabe quando tem fome
    public boolean fome;
    // Vida do zumbi 
    public double vida;

    //metodos o que um zumbi faz
    public void mostraVida (){
        System.out.println(this.vida);
    }
    public void transfereVida(Zumbi zumbiAlvo, double quantidade){
        this.vida -= quantidade;
        zumbiAlvo.vida += quantidade; 
    }
    public void morrer(){
        System.out.println("Zumbi Morreu");
    }
    public void rastejar(){
        System.out.println("Zumbi Rastejando");
    }
    public void atacar(){
        if (fome == true)
            System.out.println("Zumbi com fome ... Atacando");
        else
            System.out.println("Zumbi Sem fome ... Sem perigo");

    }
}
