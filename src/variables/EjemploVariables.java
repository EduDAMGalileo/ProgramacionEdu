package variables;

import java.util.Scanner; // Necesario para poder leer del teclado

public class EjemploVariables {
    public static void main(String[] args) {
        //Escánerpara leer del teclado
        Scanner scanner = new Scanner(System.in);

        //Mostrar los rangos (límites) de los tipos numéricos
        System.out.println("--- RANGOS DE VARIABLES NUMÉRICAS ---");
        System.out.println("byte:   de " + Byte.MIN_VALUE + " a " + Byte.MAX_VALUE);
        System.out.println("int:    de " + Integer.MIN_VALUE + " a " + Integer.MAX_VALUE);
        System.out.println("double: de " + Double.MIN_VALUE + " a " + Double.MAX_VALUE);
        System.out.println("-------------------------------------\n");

        //Crear variables y leerlas desde el teclado
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine(); // Lee texto

        System.out.print("Introduce tu edad (número entero): ");
        int edad = scanner.nextInt(); // Lee un número entero

        System.out.print("Introduce tu altura en metros (número decimal, ej. 1,75): ");
        double altura = scanner.nextDouble(); // Lee un número decimal

        // 4. Mostrar por pantalla los datos introducidos
        System.out.println("\n--- DATOS GUARDADOS ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Altura: " + altura + " m");

        // Cerrar el lector
        scanner.close();
    }
}