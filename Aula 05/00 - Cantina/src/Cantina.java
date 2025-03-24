public class Cantina {
    public String nome;
    Salgado[] salgados = new Salgado[10];

    // adicionando novo salgado
    public void addSalgado(Salgado novoSalgado){
        for(int i = 0; i < salgados.length; i++){
            if(salgados[i] == null){
                salgados[i] = novoSalgado;
                break;
            }
        }
    }
    // mostra informacoes
    public void mostraInfo(){
        System.out.println("A Cantina: " + this.nome + " possui os seguintes salgados:");
        for(int i = 0; i < salgados.length; i++){
            if(salgados[i] != null){
                System.out.println(salgados[i].nome);
            }
        }
    }
}
