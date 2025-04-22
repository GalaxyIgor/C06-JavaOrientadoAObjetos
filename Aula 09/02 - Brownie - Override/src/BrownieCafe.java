public class BrownieCafe extends Brownie{
    public BrownieCafe(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }
    public void adicionaCafe(){
        System.out.println(nome + " recebeu Cafe extra!");
    }
    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("Brownie de cafe adicionado em Carrinho de compras");
    }
}
