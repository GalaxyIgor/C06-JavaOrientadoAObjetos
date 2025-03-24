package br.inatel.cdg.jogador;

import br.inatel.cdg.inimigo.Asteroide;

public class Nave {
    private String nome;
    private String tipoTiro;
    private double vida;

    public Nave(String nome, String tipoTiro, double vida) {
        this.nome = nome;
        this.tipoTiro = tipoTiro;
        this.vida = vida;
    }

    public void atirar(Asteroide ast){

        if (ast.getTipoAsteroide() == "Grande" && this.tipoTiro == "Explosivo"){
            System.out.println("A nave" + this.nome + " atirou com Munição " + this.tipoTiro + " no asteroide!");
            ast.destruir();
        }
        else if (ast.getTipoAsteroide() == "Grande" && this.tipoTiro == "Normal"){
            System.out.println("A nave" + this.nome + " atirou com Munição " + this.tipoTiro + " no asteroide!");
            System.out.println("O tiro falhou e a nave sofreu dados consideraveis");
            this.vida -= 50;
        }
        else if (ast.getTipoAsteroide() == "Pequeno" && this.tipoTiro == "Explosivo"){
            System.out.println("A nave" + this.nome + " atirou com Munição " + this.tipoTiro + " no asteroide!");
            ast.destruir();
        }
        else if (ast.getTipoAsteroide() == "Pequeno" && this.tipoTiro == "Normal"){
            System.out.println("A nave" + this.nome + " atirou com Munição " + this.tipoTiro + " no asteroide!");
            ast.destruir();
        }
        else
            System.out.println("Munição Desconhecida ou Asteroide não Encontrado!");
        System.out.println("Vida Atual da nave: " + this.vida);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoTiro() {
        return tipoTiro;
    }

    public void setTipoTiro(String tipoTiro) {
        this.tipoTiro = tipoTiro;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }
}
