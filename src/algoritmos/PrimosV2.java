package algoritmos;

import java.util.Scanner;

public class PrimosV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero para comprobar si es primo: ");
        
        long n = sc.nextLong();
        sc.close();
        boolean esPrimo = true;

        if (n <= 1) {
            esPrimo = false;
        } else {
        	//Controlamos con una bandera, si el número no es primo nos salimos
            for (long d = 2; d < n && esPrimo; d++) {
                if (n % d == 0) {
                    esPrimo = false;
                }
            }
        }

        System.out.println("V2 (Parar al encontrar divisor) -> ¿Es primo? " + esPrimo);
    }
}
