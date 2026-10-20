package estructurasIterativas;

import java.util.Scanner;

public class EjemploBandera {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //El mejor ejemplo es el de los números primos
        System.out.print("Introduce un número entero y te digo si es o no es primo: ");
        int n = sc.nextInt();

        // ============================================================
        // LA BANDERA (FLAG)
        // Partimos de que es primo
        // Asumimos que el usuario no introduce ni 0 ni 1
        // ============================================================
        boolean esPrimo = true;

        // ============================================================
        // BUCLE CON CONDICIÓN COMPUESTA (d < n && esPrimo)
        // Mientras queden candidatos Y la bandera siga en 'true'
        // Otra opción en lugar de condición compuesta es un break
        // ============================================================
        for (int d = 2; d < n && esPrimo; d++) {
            
            // Si la división es exacta, NO es primo
            if (n % d == 0) {
                esPrimo = false; // "Bajamos la bandera": abortará el bucle
                System.out.println("-> Encontrado divisor: " + d + " (interrumpe la búsqueda)");
            }
        }

        // ============================================================
        // EVALUACIÓN FINAL MEDIANTE OPERADOR TERNARIO
        // Para que nos vayamos acostumbrando
        // ============================================================
        System.out.println("------------------------------------");
        System.out.println(n + (esPrimo ? " es primo." : " no es primo."));

        sc.close();
    }
}