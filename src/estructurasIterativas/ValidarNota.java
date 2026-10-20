package estructurasIterativas;

import java.util.Scanner;

public class ValidarNota {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota;

        // ==========================================
        // BUCLE DO-WHILE (Se ejecuta al menos UNA vez)
        // ==========================================
        do {
            // Cuerpo del bucle: pedir y leer
            System.out.print("Introduce la nota (0-10): ");
            nota = sc.nextInt();

            // Mensaje informativo si el valor no es válido
            if (nota < 0 || nota > 10) {
                System.out.println("-> Error: La nota debe estar entre 0 y 10. Inténtalo de nuevo.");
            }

        // Condición al final: se repite MIENTRAS sea incorrecta
        } while (nota < 0 || nota > 10);

        // ==========================================
        // SIGUE EL PROGRAMA (Solo llega si es válida)
        // ==========================================
        System.out.println("------------------------------------");
        System.out.println("Nota registrada con éxito: " + nota);

        sc.close();
    }
}