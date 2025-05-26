package br.inatel.cdg;

import br.inatel.cdg.exception.SaldoInsuficienteException;

// Classe principal para demonstração do sistema bancário
public class Main {

    public static void main(String[] args) {
        // Criação dos clientes
        Cliente cliente1 = new Cliente("Batman", 5432);
        Cliente cliente2 = new Cliente("Dick Grayson", 1234);

        // Criação da conta com saldo inicial e limite
        Conta conta = new Conta(100000, 500);

        // Associação dos clientes à conta
        conta.addCliente(cliente1);
        conta.addCliente(cliente2);

        // Demonstração 1: Informações iniciais
        System.out.println("=== Informações dos Clientes da Conta ===");
        conta.mostraInfo();
        System.out.println();

        // Demonstração 2: Tentativa de saque
        System.out.println("=== Tentativa de Saque (1000) ===");
        try {
            conta.sacar(1000);
            System.out.println("Saque realizado com sucesso!");
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // Demonstração 3: Informações após primeiro saque
        System.out.println("\n=== Estado da Conta Após Primeiro Saque ===");
        conta.mostraInfo();
        System.out.println();

        // Demonstração 4: Tentativa de saque novamente
        System.out.println("=== Tentativa de Saque (1000) ===");
        try {
            conta.sacar(1000);
            System.out.println("Saque realizado com sucesso!");
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // Demonstração 5: Estado final da conta
        System.out.println("\n=== Estado Final da Conta ===");
        conta.mostraInfo();
        System.out.println();

        System.out.println("=== Fim da Execução ===");
    }
}