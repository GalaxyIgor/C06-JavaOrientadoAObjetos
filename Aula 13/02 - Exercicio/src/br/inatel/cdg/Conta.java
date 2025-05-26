package br.inatel.cdg;

import br.inatel.cdg.exception.SaldoInsuficienteException;

/**
 * Classe que representa uma conta bancária
 */
public class Conta {
    // Atributos privados
    private float saldo;
    private float limite;
    private Cliente[] clientes; // Array de clientes associados à conta

    /**
     * Construtor da classe Conta
     * @param saldo Saldo inicial da conta
     * @param limite Limite da conta
     */
    public Conta(float saldo, float limite) {
        this.saldo = saldo;
        this.limite = limite;
        this.clientes = new Cliente[4]; // Capacidade para 4 clientes
    }

    /**
     * Realiza um saque na conta
     * @param quantia Valor a ser sacado
     * @throws SaldoInsuficienteException Se o saldo for insuficiente
     */
    public void sacar(float quantia) throws SaldoInsuficienteException {
        if(quantia <= saldo) {
            this.saldo -= quantia;
        } else {
            throw new SaldoInsuficienteException("Saldo Insuficiente");
        }
    }

    /**
     * Adiciona um cliente à conta
     * @param cliente Cliente a ser adicionado
     */
    public void addCliente(Cliente cliente) {
        for (int i = 0; i < clientes.length; i++) {
            if(clientes[i] == null) {
                clientes[i] = cliente;
                break; // Sai do loop após adicionar
            }
        }
    }

    /**
     * Exibe informações da conta e seus clientes
     */
    public void mostraInfo() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);

        // Itera sobre os clientes da conta
        for (Cliente cliente : clientes) {
            try {
                System.out.println("Nome do cliente: " + cliente.getNome());
                System.out.println("CPF do cliente: " + cliente.getCpf());
            } catch (NullPointerException e) {
                System.out.println("Não existe cliente nessa posição");
            }
        }
    }

    // Métodos getters adicionados para melhor encapsulamento
    public float getSaldo() {
        return saldo;
    }

    public float getLimite() {
        return limite;
    }

    public Cliente[] getClientes() {
        return clientes;
    }
}