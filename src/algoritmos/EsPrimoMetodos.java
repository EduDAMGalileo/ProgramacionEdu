package algoritmos;

import java.util.Scanner;

public class EsPrimoMetodos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero grande (ej. 1000000007): ");
        long n = sc.nextLong();
        sc.close();

        System.out.println("\n=== COMPROBANDO EL NÚMERO " + n + " CON 5 MÉTODOS ==-\n");

        // Versión 1
        long inicio = System.nanoTime();
        boolean r1 = esPrimoV1(n);
        long tiempo1 = System.nanoTime() - inicio;
        imprimir("1. Todos de 2 a N-1", r1, tiempo1);

        // Versión 2
        inicio = System.nanoTime();
        boolean r2 = esPrimoV2(n);
        long tiempo2 = System.nanoTime() - inicio;
        imprimir("2. Parar al encontrar divisor", r2, tiempo2);

        // Versión 3
        inicio = System.nanoTime();
        boolean r3 = esPrimoV3(n);
        long tiempo3 = System.nanoTime() - inicio;
        imprimir("3. Hasta la mitad (N / 2)", r3, tiempo3);

        // Versión 4
        inicio = System.nanoTime();
        boolean r4 = esPrimoV4(n);
        long tiempo4 = System.nanoTime() - inicio;
        imprimir("4. Saltar pares hasta N / 2", r4, tiempo4);

        // Versión 5
        inicio = System.nanoTime();
        boolean r5 = esPrimoV5(n);
        long tiempo5 = System.nanoTime() - inicio;
        imprimir("5. Saltar pares hasta la raíz (√N)", r5, tiempo5);
    }

    // --- LOS 5 MÉTODOS DE LAS VERSIONES ---

    public static boolean esPrimoV1(long n) {
        if (n <= 1) {
        	return false;
        }
        boolean esPrimo = true;
        for (long d = 2; d <= n - 1; d++) {
            if (n % d == 0) {
            	esPrimo = false;
            }
        }
        return esPrimo;
    }

    public static boolean esPrimoV2(long n) {
        if (n <= 1) {
        	return false;
        }
        boolean esPrimo = true;
        for (long d = 2; d < n && esPrimo; d++) {
            if (n % d == 0) {
            	esPrimo = false;
            }
        }
        return esPrimo;
    }

    public static boolean esPrimoV3(long n) {
        if (n <= 1) {
        	return false;
        }
        boolean esPrimo = true;
        for (long d = 2; d <= n / 2 && esPrimo; d++) {
            if (n % d == 0) {
            	esPrimo = false;
            }
        }
        return esPrimo;
    }

    public static boolean esPrimoV4(long n) {
        if (n <= 1) {
        	return false;
        }
        if (n == 2) {
        	return true;
        }
        if (n % 2 == 0) {
        	return false;
        }
        boolean esPrimo = true;
        for (long d = 3; d <= n / 2 && esPrimo; d += 2) {
            if (n % d == 0) {
            	esPrimo = false;
            }
        }
        return esPrimo;
    }

    public static boolean esPrimoV5(long n) {
        if (n <= 1) {
        	return false;
        }
        if (n == 2) {
        	return true;
        }
        if (n % 2 == 0) {
        	return false;
        }
        boolean esPrimo = true;
        for (long d = 3; (long) d * d <= n && esPrimo; d += 2) {
            if (n % d == 0) {
            	esPrimo = false;
            }
        }
        return esPrimo;
    }

    private static void imprimir(String nombre, boolean esPrimo, long ns) {
        System.out.printf("%-35s -> ¿Es primo? %-5b | %.4f ms%n", nombre, esPrimo, ns / 1_000_000.0);
    }
}