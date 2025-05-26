package br.inatel.cdg;

import java.io.*;
import java.util.Scanner;

import static br.inatel.cdg.logica.CifraDeCesar.cifraCesar;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeArquivo = "mensagem_cifrada.txt";
        int deslocamento = 3;

        // Entrada do usuário
        System.out.print("Digite uma frase para criptografar: ");
        String frase = scanner.nextLine();

        // Criptografar
        String criptografada = cifraCesar(frase, deslocamento);

        // Salvar em arquivo
        try (FileWriter escritor = new FileWriter(nomeArquivo)) {
            escritor.write(criptografada);
            System.out.println("Frase criptografada salva em '" + nomeArquivo + "'");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }

        // Ler do arquivo e decriptar
        try (BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha = leitor.readLine();
            String decriptada = cifraCesar(linha, 26 - deslocamento);
            System.out.println("Mensagem decriptada: " + decriptada);
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        scanner.close();


    }
}