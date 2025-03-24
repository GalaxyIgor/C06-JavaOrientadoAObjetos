import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Random rand = new Random();
     Scanner entrada = new Scanner(System.in);

     int posicaoDaBombaX = rand.nextInt(2);
     int posicaoDaBombaY = rand.nextInt(2);
     System.out.println("Posicao da Bomba: " + posicaoDaBombaX + " " + posicaoDaBombaY);

     boolean [][]campoMinado = new boolean[2][2];
     campoMinado[posicaoDaBombaX][posicaoDaBombaY] = true;

     while(campoMinado[posicaoDaBombaX][posicaoDaBombaY]){
         System.out.println("Digite uma posicao da Bomba X (0 ou 1): ");
         int jogadorX = entrada.nextInt();
         System.out.println("Digite uma posicao da Bomba Y (0 ou 1): ");
         int jogadorY = entrada.nextInt();
         if (campoMinado[jogadorX][jogadorY] == true){
             System.out.println("Explodiu");
         }
         else{
             System.out.println("Safe");
         }
     }
    }
}