package br.inatel.cdg.c06;

import br.inatel.cdg.c06.mamifero.Boi;
import br.inatel.cdg.c06.mamifero.Cachorro;
import br.inatel.cdg.c06.mamifero.Lontra;
import br.inatel.cdg.c06.mamifero.Mamifero;

public class Main {
    public static void main(String[] args) {
            Boi b = new Boi("boi", 200);
            Cachorro c = new Cachorro("cachorro", 200);
            Lontra l = new Lontra("lontra", 200);

            b.mostraInfo();
            b.emitirSom();

            l.mostraInfo();
            l.emitirSom();
            l.nadar();


    }
}