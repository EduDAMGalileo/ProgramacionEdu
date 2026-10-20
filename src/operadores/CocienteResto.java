package operadores;

import java.util.Scanner;

public class CocienteResto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ---- Entrada ----
        System.out.print("Dividendo: ");
        int dividendo = sc.nextInt();
        System.out.print("Divisor (distinto de 0): ");
        int divisor = sc.nextInt();

        // ---- Proceso ----
        int cociente = dividendo / divisor;
        int resto = dividendo % divisor;
        boolean esPar = dividendo % 2 == 0;
        boolean esDivisible = resto == 0;

        // ---- Salida ----
        System.out.printf("%d / %d = %d (resto %d)%n", dividendo, divisor, cociente, resto);
        System.out.printf("Comprobación: %d * %d + %d = %d%n",
                divisor, cociente, resto, divisor * cociente + resto);
        System.out.printf("¿%d es par? %b%n", dividendo, esPar);
        System.out.printf("¿Es divisible entre %d? %b%n", divisor, esDivisible);

        sc.close();
    }
}

