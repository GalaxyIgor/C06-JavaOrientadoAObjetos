import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        // insercao de dados
        // scanner para entrada de dados lembrar sempre de fechar o scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("================================================");
        // quantidade por hora
        System.out.print("Quantidade de lanches da primeira hora:");
        int qph_01 = entrada.nextInt();
        System.out.print("Quantidade de lanches da segunda hora:");
        int qph_02 = entrada.nextInt(); 
        System.out.print("Quantidade de lanches da terceira hora:");
        int qph_03 = entrada.nextInt();
        
        // quantidade total
        int quantidade_total = qph_01 + qph_02 + qph_03;

        // media
        float media = (float)quantidade_total/3;
        
        // saida
        System.out.println("================================================");
        // informações inseridas
        System.out.println("Total de lanches na primeira hora: " + qph_01);
        System.out.println("Total de lanches na segunda hora: " + qph_02);
        System.out.println("Total de lanches na terceira hora: " + qph_03);
        
        // espaço vazio
        System.out.print("\n");
        
        // resultados
        System.out.println("Total de lanches: " + quantidade_total);
        System.out.println("Media de lanches consumidos por hora: " + media);
        System.out.println("================================================");

        // fechando scanner
        entrada.close();
    }
}

/*
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int lanche01 = entrada.nextInt();
        int lanche02 = entrada.nextInt();
        int lanche03 = entrada.nextInt();

        int total = lanche01 + lanche02 + lanche03;
        int media = total/3;

        System.out.println("Total de lanches: " + total);
        System.out.println("Media de lanches consumidos por hora: " + media);
        entrada.close();
    }
}
*/