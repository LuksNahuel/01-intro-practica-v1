package arreglos;

import java.util.Random;
import java.util.Scanner;

public class Matrices {
    Scanner in = new Scanner(System.in);
    Random r = new Random();

    public void llenarMatriz(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                System.out.printf("Ingrese un valor en la posición %d, %d%n", i, j);
                matrix[i][j] = in.nextInt();
            }
        }
    }

    public void llenarRandom(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = r.nextInt(100);
            }
        }
    }

    public void mostrarMatriz(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                System.out.printf("%9d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int[][] matrizRandom = new int[10][10];
        Matrices matrices = new Matrices();
        matrices.llenarMatriz(matriz);
        matrices.mostrarMatriz(matriz);
        matrices.llenarRandom(matrizRandom);
        matrices.mostrarMatriz(matrizRandom);
    }
}
