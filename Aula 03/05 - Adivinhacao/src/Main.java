import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // abrindo uma entrada
        Scanner entrada = new Scanner(System.in);

        // criando um numero aletorio
        Random rand = new Random();
        int x = rand.nextInt(10) + 1; //Gera número entre 1 e 10

        System.out.println("Adivinhe qual numero eu estou pensando: ");
        // entrada para adivinhar um numero
        int numero = entrada.nextInt();

        // while para repetir ate que acerte
        while (numero != x){
            System.out.println("Adivinhe qual numero eu estou pensando: ");
            numero = entrada.nextInt();
        }
        System.out.println("Acertou!!!");
        // fechando entrada
        entrada.close();
    }
}