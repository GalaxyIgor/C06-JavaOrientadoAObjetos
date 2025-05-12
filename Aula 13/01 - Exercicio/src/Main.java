public class Main {
    public static void main(String[] args) {
        // Cliente
        Cliente cliente1 = new Cliente("Bruce Wayne", 1);
        Cliente cliente2 = new Cliente("Dick Grayson", 123214);
        Cliente cliente3 = null;

        // Conta
        Conta conta = new Conta(1500, 500);

        // Adicionado (agregando) a conta ao cliente
        conta.addCliente(cliente1);
        conta.addCliente(cliente2);
        conta.addCliente(cliente3);

        // Mostrando as informações da conta
        conta.mostraInfo();

        // Verificando se não há erros
        System.out.println("Programa finalizado com sucesso!");
    }
}