package algoritmos;

import java.util.Scanner;

public class MidiendoAlgoritmos {
	//Probar con 1.000.000.007
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número a comprobar en todas las versiones: ");
        long n = sc.nextLong();
        sc.close();

        long inicio, fin;

        System.out.println("\n=== COMPARATIVA DE TIEMPOS PARA N = " + n + " ===\n");

        // --- MEDIENDO VERSIÓN 1 ---
        inicio = System.nanoTime();
        boolean res1 = true;
        if (n <= 1) {
        	res1 = false;
        }
        else {
            for (long d = 2; d <= n - 1; d++) {
                if (n % d == 0) {
                	res1 = false;
                }
            }
        }
        fin = System.nanoTime();
        imprimirResultado("Versión 1 (Directa)", res1, fin - inicio);


        // --- MEDIENDO VERSIÓN 2 ---
        inicio = System.nanoTime();
        boolean res2 = true;
        if (n <= 1) {
        	res2 = false;
        }
        else {
            for (long d = 2; d < n && res2; d++) {
                if (n % d == 0) {
                	res2 = false;
                }
            }
        }
        fin = System.nanoTime();
        imprimirResultado("Versión 2 (Con bandera)", res2, fin - inicio);


        // --- MEDIENDO VERSIÓN 3 ---
        inicio = System.nanoTime();
        boolean res3 = true;
        if (n <= 1) {
        	res3 = false;
        }
        else {
            for (long d = 2; d <= n / 2 && res3; d++) {
                if (n % d == 0) {
                	res3 = false;
                }
            }
        }
        fin = System.nanoTime();
        imprimirResultado("Versión 3 (Hasta la mitad)", res3, fin - inicio);


        // --- MEDIENDO VERSIÓN 4 ---
        inicio = System.nanoTime();
        boolean res4 = true;
        if (n <= 1) {
        	res4 = false;
        }
        else if (n == 2) {
        	res4 = true;
        }
        else if (n % 2 == 0) {
        	res4 = false;
        }
        else {
            for (long d = 3; d <= n / 2 && res4; d += 2) {
                if (n % d == 0) {
                	res4 = false;
                }
            }
        }
        fin = System.nanoTime();
        imprimirResultado("Versión 4 (Saltar pares)", res4, fin - inicio);


        // --- MEDIENDO VERSIÓN 5 ---
        inicio = System.nanoTime();
        boolean res5 = true;
        if (n <= 1) {
        	res5 = false;
        }
        else if (n == 2) {
        	res5 = true;
        }
        else if (n % 2 == 0) {
        	res5 = false;
        }
        else {
            for (long d = 3; (long) d * d <= n && res5; d += 2) {
                if (n % d == 0) {
                	res5 = false;
                }
            }
        }
        fin = System.nanoTime();
        imprimirResultado("Versión 5 (Raíz cuadrada)", res5, fin - inicio);
    }

    private static void imprimirResultado(String nombre, boolean esPrimo, long nanosegundos) {
        double milisegundos = nanosegundos / 1_000_000.0;
        System.out.printf("%-30s -> Es primo: %-5b | Tiempo: %.4f ms (%d ns)%n", 
                nombre, esPrimo, milisegundos, nanosegundos);
    }
}