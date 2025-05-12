public class Cliente {
    // Variaveis
    private String nome;
    private long cpf;

    // Construtor
    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    // Getters E Setters
    public String getNome() {
        return nome;
    }
    public long getCpf() {
        return cpf;
    }
}
