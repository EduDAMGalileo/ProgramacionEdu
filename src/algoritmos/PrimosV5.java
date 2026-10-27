package algoritmos;

import java.util.Scanner;

public class PrimosV5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero para comprobar si es primo: ");
        
        long n = sc.nextLong();

        sc.close();

        boolean esPrimo = true;

        if (n <= 1) {
            esPrimo = false;
        } else if (n == 2) {
            esPrimo = true;
        } else if (n % 2 == 0) {
            esPrimo = false;
        } else {
        	//Hasta la "raiz cuadrada", en este caso la potencia
            for (long d = 3; (long) d * d <= n && esPrimo; d += 2) {
                if (n % d == 0) {
                    esPrimo = false;
                }
            }
        }

        if (esPrimo) {
            System.out.println("El número " + n + " SÍ es primo.");
        } else {
            System.out.println("El número " + n + " NO es primo.");
        }
    }
}