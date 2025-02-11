
public class Main {
    public static void main(String[] args) throws Exception {
        // quantidade por hora qph
        int qph_01 = 10, qph_02 = 4, qph_03 = 2;
        
        // quantidade total
        int quantidade_total = qph_01 + qph_02 + qph_03;

        // media com casting apenas para imprimir, virgula numeros caso não queira mostrar
        float media = (float)quantidade_total/3;
        
        // saida
        // informações inseridas
        System.out.println("Total de lanches na primeira hora: " + qph_01);
        System.out.println("Total de lanches na segunda hora: " + qph_02);
        System.out.println("Total de lanches na terceira hora: " + qph_03);
        
        // espaço vazio
        System.out.print("\n");
        
        // resultados
        System.out.println("Total de lanches: " + quantidade_total);
        System.out.println("Media de lanches consumidos por hora: " + media);
    }
}

/*
public class Main{
    public static void main (String[] args){
        int lanche01 = 10, lanche02 = 4,lanche03 = 2;
        int total = lanche01 + lanche02 + lanche03;
        int media = total/3;

        System.out.println("Total de lanches: " + total)
        System.out.println("Media: " + media);
    }
}

public class Main{
    public static void main (String[] args){
        int lanche01 = 10, lanche02 = 4,lanche03 = 2;
        int total = lanche01 + lanche02 + lanche03;
        int media = total/3;

        // prestar atenção nos parenteses () dos lanches, se n apenas vamos mostrar os numeros
        // algo como Total de lanches: 1042
        System.out.println("Total de lanches: " + (lanche01 + lanche02 + lanche03));
        System.out.println("Media: " + media);
    }
}
*/