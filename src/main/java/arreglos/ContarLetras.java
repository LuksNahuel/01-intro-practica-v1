package arreglos;

import java.util.Arrays;

public class ContarLetras {
    char[] alphabet = "abcdefghijklmnñopqrstuvwxyz".toCharArray();
    int[] ocurrencias = new int[27];

    public void contarLetras(String texto) {
        String textoSinEspacios = texto.toLowerCase().replaceAll("\\s+","");
        for(int i = 0; i < textoSinEspacios.length(); i++) {
            for(int j = 0; j < alphabet.length; j++) {
                if(alphabet[j] == textoSinEspacios.charAt(i)) {
                    ocurrencias[j] += 1;
                }
            }
        }
        System.out.println(Arrays.toString(ocurrencias));
    }

    public static void main(String[] args) {
        ContarLetras contar = new ContarLetras();
        contar.contarLetras("B C D E ");
    }
}
