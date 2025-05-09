import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Criando uma lista
        List<Double> listaDouble = new ArrayList<Double>();

        // Numeros aletorios
        for (int i = 0; i < 5; i++) {
            // ate 100
            listaDouble.add(new Random().nextDouble()*100);
        }
        
        System.out.println("Antes da Ordenação");

        // Varrendo a lista
        for (Double double1 : listaDouble) {
            System.out.println(double1);
        }

        System.out.println("Depois da Ordenação");

        // Metodo sort collections que inverte a ordem
        Collections.sort(listaDouble, Collections.reverseOrder());

        // Varrendo a lista
        for (Double double1 : listaDouble) {
            System.out.println(double1);
        }
    }
}