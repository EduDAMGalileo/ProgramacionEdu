package estructurasIterativas;

import java.util.Scanner;

public class EjemploBreak {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ==========================================
        // BUCLE INFINITO CONTROLADO POR BREAK
        // ==========================================
        while (true) {
            System.out.print("Escribe algo ('salir' para terminar): ");
            String entrada = sc.nextLine();

            // Condición de ruptura interna
            // Usamos equalsIgnoreCase para que acepte "salir", "SALIR", etc.
            // Es un método de la clase String,ya veremos más en detalle qué son
            if (entrada.equalsIgnoreCase("salir")) {
            	// Rompe el bucle de inmediato y sale de él
                break; 
            }

            // Esta parte solo se ejecuta si NO se hizo el break
            System.out.println("Has escrito: " + entrada);
        }

        // ==========================================
        // SIGUE EL PROGRAMA
        // ==========================================
        System.out.println("------------------------------------");
        System.out.println("Has salido del bucle con éxito. ¡Adiós!");

        sc.close();
    }
}
