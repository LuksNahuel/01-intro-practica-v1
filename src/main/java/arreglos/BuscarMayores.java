package arreglos;

import java.util.Arrays;
import java.util.Scanner;

public class BuscarMayores {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese un número entero a comparar: ");
        int initial = Integer.parseInt(in.nextLine());
        System.out.println("Ingrese una serie de números separados por espacios:");
        String[] input = in.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for(int i = 0; i < input.length; i++) {
            int actual = Integer.parseInt(input[i]);
            if(actual > initial) {
                numbers[i] = actual;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
