package br.inatel.cdg;

/**
 * Classe que representa um cliente do banco
 */
public class Cliente {
    // Atributos privados para encapsulamento
    private String nome;
    private long cpf;

    /**
     * Construtor da classe Cliente
     * @param nome Nome completo do cliente
     * @param cpf CPF do cliente (apenas números)
     */
    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    /**
     * Método getter para o nome do cliente
     * @return Nome do cliente
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método getter para o CPF do cliente
     * @return CPF do cliente
     */
    public long getCpf() {
        return cpf;
    }
}