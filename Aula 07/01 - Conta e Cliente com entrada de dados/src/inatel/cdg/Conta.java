// Pacotes
package inatel.cdg;

public class Conta {
    // Variaveis
    private int numero;
    private float saldo;
    private float limite;
    private Cliente[] cliente;

    // Construtor
    public Conta() {
        this.cliente = new Cliente[10];
    }

    // Getters And Setters
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public float getLimite() {
        return limite;
    }
    public void setLimite(float limite) {
        this.limite = limite;
    }
    public Cliente[] getCliente() {
        return cliente;
    }
    public void setCliente(Cliente[] cliente) {
        this.cliente = cliente;
    }

    // Metodos
    public void sacar(float quantia) {
        if (quantia > 0 && (saldo+limite) >= quantia) {
            this.saldo -= quantia;
            System.out.println("Saque de R$ " + quantia + " realizado com sucesso.");
            System.out.println("Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente ou quantia inválida. Tente outra quantia para saque.");
        }
    }
    public void deposita(float quantia) {
        if (quantia > 0) {
            this.saldo += quantia;
            System.out.println("Depósito de R$ " + quantia + " realizado com sucesso.");
            System.out.println("Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Quantia inválida para depósito.");
        }
    }
}
