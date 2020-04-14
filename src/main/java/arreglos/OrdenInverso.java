package arreglos;

import java.util.Scanner;

public class OrdenInverso {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[10];
        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número: ");
            numeros[i] = input.nextInt();
        }
        input.close();
        for(int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}
