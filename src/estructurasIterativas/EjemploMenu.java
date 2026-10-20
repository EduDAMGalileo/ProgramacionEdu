package estructurasIterativas;

import java.util.Scanner;

public class EjemploMenu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        // ============================================================
        // BUCLE DO-WHILE: El menú se muestra al menos UNA vez
        // ============================================================
        do {
            // Pintar el menú por pantalla
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Ver datos");
            System.out.println("2. Modificar datos");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            
            //Leer la opción
            opcion = sc.nextInt();

            // Evaluar la opción con switch (sintaxis moderna -> sin break)
            switch (opcion) {
                case 1 -> System.out.println("-> [Acción] Mostrando datos del sistema...");
                case 2 -> System.out.println("-> [Acción] Modificando los datos...");
                case 0 -> System.out.println("-> Saliendo del programa. ¡Hasta luego!");
                default -> System.out.println("-> [Error] Opción no válida. Por favor, elige 0, 1 o 2.");
            }

        // Si la opción es distinta de 0, vuelve a mostrar el menú
        } while (opcion != 0);

        // ============================================================
        // SIGUE EL PROGRAMA (Tras pulsar 0)
        // ============================================================
        System.out.println("------------------------------------");
        System.out.println("Programa terminado correctamente.");

        sc.close();
    }
}
