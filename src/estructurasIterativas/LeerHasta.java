package estructurasIterativas;

import java.util.Scanner;

public class LeerHasta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ==========================================
        // INICIALIZACIÓN (Lectura adelantada) 
        //  - Se podría hacer más óptimo con do while
        // ==========================================
        int suma = 0;
        System.out.print("Introduce un número (0 para terminar): ");
        int numero = sc.nextInt();

        // ==========================================
        // CONDICIÓN
        // ==========================================
        while (numero != 0) {
            
            // BLOQUE
            suma += numero;

            //ACTUALIZA (Siguiente lectura)
            System.out.print("Introduce un número (0 para terminar): ");
            numero = sc.nextInt();
        }

        // ==========================================
        // SIGUE EL PROGRAMA
        // ==========================================
        System.out.println("------------------------------------");
        System.out.println("Suma total: " + suma);

        // Buenas prácticas: cerrar el recurso
        sc.close();
    }
}