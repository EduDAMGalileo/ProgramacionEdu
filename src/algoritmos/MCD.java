package algoritmos;

import java.util.Scanner;

public class MCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número (a): ");
        int a = sc.nextInt();

        System.out.print("Introduce el segundo número (b): ");
        int b = sc.nextInt();

        // Algoritmo de Euclides
        int aOriginal = a;
        int bOriginal = b;

        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }

        System.out.println("El MCD de " + aOriginal + " y " + bOriginal + " es: " + a);
        sc.close();
    }
}