public class Main {
    public static void main(String[] args) {
        BrownieNutella bn = new BrownieNutella("Brownie de Nutella", 12.50, "Chocolate");
        BrownieDoceDeLeite bd = new BrownieDoceDeLeite("Brownie de Doce de Leite", 10.00, "Baunilha");
        BrownieCafe bc = new BrownieCafe("Brownie de Café", 11.00, "Café");

        // Subescrito
        bn.mostraInfo();
        bn.addCarrinhoDeCompras();
        bn.calculaValorTotalCompra();
        bn.adicionaNutella();

        // Subescrito
        bd.mostraInfo();
        bd.addCarrinhoDeCompras();
        bd.calculaValorTotalCompra();
        bd.adicionaDoceDeLeite();

        // Não Subescrito
        bc.mostraInfo();
        bc.addCarrinhoDeCompras();
        bc.calculaValorTotalCompra();
        bc.adicionaCafe();
    }
}