import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // criação da entrada de alunos
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o numero de alunos(as): ");
        // entrada
        int numAlunos = entrada.nextInt();

        // switch para decidir qual sala é de determinado num de alunos
        switch (numAlunos){
            case 10:
                System.out.println("Sala I-16");
            break;

            case 20:
                System.out.println("Sala I-16");
            break;

            case 30:
                System.out.println("Sala I-40");
            break;
        }
        // fechando da entrada de alunos
        entrada.close();
    }
}

/*
// mesmo codigo porem simplificado
public class Main {
    public static void main(String[] args) {
        // criação da entrada de alunos
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o numero de alunos(as): ");
        // entrada
        int numAlunos = entrada.nextInt();

        // switch para decidir qual sala é de determinado num de alunos
        switch (numAlunos){
            case 10:
            case 20:
                System.out.println("Sala I-16");
            break;

            case 30:
                System.out.println("Sala I-40");
            break;
        }
        // fechando da entrada de alunos
        entrada.close();
    }
}*/