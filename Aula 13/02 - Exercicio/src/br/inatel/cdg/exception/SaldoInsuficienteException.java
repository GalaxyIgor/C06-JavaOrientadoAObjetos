package br.inatel.cdg.exception;

/**
 * Exceção personalizada para saldo insuficiente em operações bancárias
 */
public class SaldoInsuficienteException extends Exception {
    /**
     * Construtor da exceção
     * @param message Mensagem de erro detalhada
     */
    public SaldoInsuficienteException(String message) {
        super(message);
    }
}