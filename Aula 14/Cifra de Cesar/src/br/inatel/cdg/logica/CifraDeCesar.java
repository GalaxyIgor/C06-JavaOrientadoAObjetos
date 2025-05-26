package br.inatel.cdg.logica;

public class CifraDeCesar {

    // Função para aplicar a Cifra de César
    public static String cifraCesar(String texto, int deslocamento) {
        StringBuilder resultado = new StringBuilder();

        for (char c : texto.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                c = (char) ((c - base + deslocamento) % 26 + base);
            }
            resultado.append(c);
        }

        return resultado.toString();
    }
}