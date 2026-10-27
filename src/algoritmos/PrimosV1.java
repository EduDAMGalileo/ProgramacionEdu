package algoritmos;

import java.util.Scanner;

public class PrimosV1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero para comprobar si es primo: ");
        
        long n = sc.nextLong();
        sc.close();
        boolean esPrimo = true;

        if (n <= 1) {
            esPrimo = false;
        } else {
            for (long d = 2; d <= n - 1; d++) {
                if (n % d == 0) {
                    esPrimo = false;
                }
            }
        }

        System.out.println("V1 (Todos hasta N-1) -> ¿Es primo? " + esPrimo);
    }
}