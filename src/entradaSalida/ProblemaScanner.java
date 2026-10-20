package entradaSalida;

import java.util.Scanner;

public class ProblemaScanner {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("=== EJEMPLO 1: EL ERROR (Comportamiento inesperado) ===");
        
        System.out.print("Introduce tu edad: ");
        // Lees el número, PERO el [Enter] se queda en el buffer
        int edadMala = teclado.nextInt(); 

        System.out.print("Introduce tu nombre completo: ");
        // ¡BUM! Esta línea se la "come" el Enter pendiente.
        // No te dejará escribir y pasará directo a la siguiente instrucción:
        String nombreMalo = teclado.nextLine(); 

        System.out.printf("Resultado fallido -> Edad: %d, Nombre: '%s'%n%n", edadMala, nombreMalo);
        // Verás que el nombre sale completamente vacío: ''


        System.out.println("======================================================");
        System.out.println("=== EJEMPLO 2: LA SOLUCIÓN (Limpiar el buffer)     ===");
        System.out.println("======================================================");

        System.out.print("Introduce tu edad de nuevo: ");
        int edadBuena = teclado.nextInt(); // Lees el número

        // -------------------------------------------------------------------
        // ¡LA SOLUCIÓN!
        // Llamamos a nextLine() "al aire" (sin guardarlo en ninguna variable)
        // para que se coma y limpie ese [Enter] (\n) que sobró.
        // -------------------------------------------------------------------
        teclado.nextLine();

        System.out.print("Introduce tu nombre completo: ");
        // Ahora el buffer está limpio y la consola SÍ esperará a que escribas:
        String nombreBueno = teclado.nextLine(); 

        System.out.print("Introduce tu ciudad: ");
        String ciudad = teclado.nextLine(); // Si vienes de otro nextLine(), NO hace falta limpiar

        System.out.printf("%n¡Perfecto! -> Te llamas %s, tienes %d anos y vives en %s.%n", 
                          nombreBueno, edadBuena, ciudad);
        
        // Buena práctica: cerrar el Scanner al final, sino Eclipse muestra un Warning
        teclado.close(); 
        
        IO.print("Hola");
    }
}