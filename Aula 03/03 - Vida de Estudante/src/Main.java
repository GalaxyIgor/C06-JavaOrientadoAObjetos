import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //declara as variaveis
        int NP1, NP2, NP3;

        //nescessario para entrada
        Scanner entrada = new Scanner(System.in);

        //mostra na tela "Digite o valor da NP1: "
        System.out.println("Digite o valor da NP1: ");
        //entrada NP1
        NP1 = entrada.nextInt();

        //mostra na tela "Digite o valor da NP2: "
        System.out.println("Digite o valor do NP2: ");
        //entrada NP2
        NP2 = entrada.nextInt();

        //soma o valor do total
        int total = NP1 + NP2;
        //faz a media
        int NFA = total/2;

        //if
        if (NFA < 60) {
            //mostra na tela "Digite o valor da NP3: "
            System.out.println("Digite o valor do NP3: ");
            //entrada NP3
            NP3 = entrada.nextInt();

            //calcula a nota com np3
            int NFA2 = (NP3 + NFA) /2;
            //mostra os resultados
            System.out.println("Nota final: " + NFA2);
        }
        //else
        else{
            System.out.println("Nota final: " + NFA);
        }


        //fecha as entradas
        entrada.close();
    }
}
/*

// outra visão
public class Main{
    public static void main(String[] args) {
        // entrada
        Scanner nota = new Scanner(System.in);

        System.out.println("NP1: ");
        float np1 = nota.nextFloat();
        System.out.println("NP2: ");
        float np2 = nota.nextFloat();

        float npa = np1 + np2;

        if(npa >= 60)
            System.out.print("Aprovado com uma NPA de " + npa + " pontos");
        else if (npa < 60 && npa >=30) {
            System.out.println("Voce ira prescisar da NP3!!!");
            System.out.println("NP3: ");
            float np3 = nota.nextFloat();
            if(npa >= 60)
                System.out.println("Aprovado com uma NPA de " + npa + " pontos");
            else
                System.out.println("Reprovado com uma NPA de " + npa + " pontos");
        }
        else
            System.out.println("Reprovado com uma NPA de " + npa + " pontos");

        // fechando entrada
        nota.close();
    }
}
*/