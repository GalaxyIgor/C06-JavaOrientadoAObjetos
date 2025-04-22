public class BrownieDoceDeLeite extends Brownie{
    public BrownieDoceDeLeite(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }
    public void adicionaDoceDeLeite(){
        System.out.println(nome + " recebeu Doce De Leite extra!");
    }
    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("Brownie de Doce De Leite adicionado em Carrinho de compras");
    }
}
