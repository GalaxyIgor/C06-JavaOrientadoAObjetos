public class Main {
    public static void main(String[] args) {
        Cantina cantinaInatel = new Cantina();
        cantinaInatel.nome = "Cantina do Inatel";

        Salgado s1 = new Salgado();
        Salgado s2 = new Salgado();
        Salgado s3 = new Salgado();

        s1.nome = "Coxinha";
        s2.nome = "Pastel";
        s3.nome = "Pão de Queijo";

        cantinaInatel.addSalgado(s1);
        cantinaInatel.addSalgado(s2);
        cantinaInatel.addSalgado(s3);

        cantinaInatel.mostraInfo();
    }
}