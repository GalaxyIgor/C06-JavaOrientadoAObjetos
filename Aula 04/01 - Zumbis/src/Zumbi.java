public class Zumbi {

    // zumbi sabe quando tem fome
    boolean fome;


    //metodos o que um zumbi faz
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
