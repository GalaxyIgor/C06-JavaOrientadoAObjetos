public class Banda {
    String nome;
    String genero;

    Membro[] membros = new Membro[10];
    Musica[] musicas = new Musica[10];
    Empresario empresario;

    public Banda(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public void mostraInfo(){
        System.out.println("Nome da Banda: " + this.nome);
        System.out.println("Genero da Banda: " + this.genero);
        System.out.println("Membros da Banda: ");
        for(int i = 0; i < membros.length; i++){
            if(membros[i] != null)/*apenas le o que não é nulo*/{
                System.out.println((i+1) + ") - " + membros[i].nome + "sua função na banda é " + membros[i].funcao);
            }
            else{
                System.out.println("Não foi possivel mostra uma membro.");
            }
        }
        System.out.println("Musicas da Banda: ");
        for(int i = 0; i < musicas.length; i++){
            if(musicas[i] != null)/*apenas le o que não é nulo*/{
                System.out.println((i+1) + ") - " + musicas[i].nome + "sua duração é de "  + musicas[i].duracao + "  minutos");
            } else {
                System.out.println("Não foi possivel encontrar uma musica!");
            }
        }
        System.out.println("Nome do Empresario: " + empresario.nome);
        System.out.println("Nome do Empresario: " + empresario.cnpj);
    }
    public void addMusicaNova(Musica musica){
        for(int i = 0; i < musicas.length; i++){
            if(musicas[i] == null)/*apenas le o que é nulo*/{
                musicas[i] = musica;
                break;
            }
        }

    }
    public void addMembroNovo(Membro membro){
        for(int i = 0; i < membros.length; i++){
            if(membros[i] == null){
                membros[i] = membro;
                break;
            }
        }
    }
}
