package algoritmos;

import java.util.Scanner;

public class MayorDeN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos números?: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Debe ser al menos 1 número.");
            sc.close();
            return;
        }

        System.out.print("Número 1: ");
        // El primero es el mayor provisional
        int mayor = sc.nextInt(); 

        for (int i = 2; i <= n; i++) {
            System.out.print("Número " + i + ": ");
            int x = sc.nextInt();
            if (x > mayor) {
            	// Actualizamos el mayor si encontramos uno superior
                mayor = x; 
            }
        }

        System.out.println("El mayor es: " + mayor);
        sc.close();
    }
}