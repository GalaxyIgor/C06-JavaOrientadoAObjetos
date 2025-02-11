import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // abrindo uma entrada
        Scanner entrada = new Scanner(System.in);

        // criando um numero aletorio
        Random rand = new Random();
        int Aleatorio = rand.nextInt(10) + 1; //Gera número entre 1 e 10
        
        // entrada para adivinhar um numero
        int numero;

        // while para repetir ate que acerte
        do{
            System.out.println("Adivinhe qual numero eu estou pensando: ");
            numero = entrada.nextInt();

            if(Aleatorio < numero){
                System.out.println("Eu pensei em um numero menor...");
            }
            else if(Aleatorio > numero){
                System.out.println("Eu pensei em um numero maior...");
            }
            else
                System.out.println("Acertou!!!");
        }
        while (numero != Aleatorio);

        // fechando entrada
        entrada.close();
    }
}