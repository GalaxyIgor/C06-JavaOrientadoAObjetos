import inatel.cdg.Cliente;
import inatel.cdg.Conta;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando clientes
        Cliente[] clientes = new Cliente[2];
        for (int i = 0; i < clientes.length; i++) {
            Cliente cliente = new Cliente();
            System.out.println("Digite o nome do cliente " + (i + 1) + ":");
            cliente.setNome(scanner.nextLine());

            System.out.println("Digite o CPF do cliente " + (i + 1) + ":");
            cliente.setCpf(scanner.nextLong());
            scanner.nextLine(); // Consumir a nova linha pendente

            clientes[i] = cliente;
        }

        // Criando a conta
        Conta conta = new Conta();
        conta.setCliente(clientes);

        System.out.println("Digite o número da conta:");
        conta.setNumero(scanner.nextInt());

        System.out.println("Digite o limite da conta:");
        conta.setLimite(scanner.nextFloat());

        // Exibindo saldo inicial
        System.out.println("Saldo inicial: R$ " + conta.getSaldo());

        // Realizando depósito
        System.out.println("Digite o valor para depósito:");
        float valorDeposito = scanner.nextFloat();
        conta.deposita(valorDeposito);

        // Realizando saque
        System.out.println("Digite o valor para saque:");
        float valorSaque = scanner.nextFloat();
        conta.sacar(valorSaque);

        scanner.close();
    }
}