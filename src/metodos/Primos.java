package metodos;

import java.util.Scanner;

public class Primos {

    /**
     * Indica si un número es primo.
     * @param n número que se comprueba
     * @return true si n es primo
     */
    public static boolean esPrimo(int n) {
        if (n <= 1) {
        	return false;
        }
        if (n == 2) {
        	return true;
        }
        if (n % 2 == 0) {
        	return false;
        }
        for (int d = 3; (long) d * d <= n; d += 2) {
            if (n % d == 0) {
            	//Encontramos un divisor
                return false; 
            }
        }
        // ningún divisor
        return true;                         
    }

    public static int contarPrimosHasta(int limite) {
        int cuenta = 0;
        for (int i = 2; i <= limite; i++) {
            if (esPrimo(i)) {
                cuenta++;
            }
        }
        return cuenta;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número: ");
        int n = sc.nextInt();
        System.out.println(n + (esPrimo(n) ? " es primo." : " no es primo."));
        System.out.println("Hay " + contarPrimosHasta(n) + " primos hasta " + n + ".");
        sc.close();
    }
}
