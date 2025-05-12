import java.util.HashSet;

public class Conta {
    // Variáveis
    private double saldo;
    private double limite;
    HashSet<Cliente> clientes = new HashSet<>();

    // Construtor
    Conta(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    // Métodos
    public void mostraInfo() {
        System.out.println("Saldo: R$" + saldo);
        System.out.println("Limite: R$" + limite);
        System.out.println("Clientes:");

        for (Cliente c : clientes) {
            try {
                System.out.println("Cliente: " + c.getNome() + ", CPF: " + c.getCpf());
            } catch (NullPointerException e) {
                System.out.println("Cliente nulo encontrado.");
            }
        }
    }
    void addCliente(Cliente cliente) {
        clientes.add(cliente); // Hashset
    }
}
