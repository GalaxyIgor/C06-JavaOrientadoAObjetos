public class Brownie {
    protected String nome;
    protected double preco;
    protected String sabor;

    public Brownie(String nome, double preco, String sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void addCarrinhoDeCompras(){
        System.out.println(nome + " adicionado ao carrinho.");
    }
    public void calculaValorTotalCompra(){
        System.out.println("O valor do " + nome + " é: R$" + preco);
    }
    public void mostraInfo(){
        System.out.println("Nome: " + nome + ", Preço: R$" + preco + ", Sabor: " + sabor);
    }
}
