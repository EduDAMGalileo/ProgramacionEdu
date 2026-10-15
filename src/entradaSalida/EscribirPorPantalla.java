package entradaSalida;

public class EscribirPorPantalla {
    public static void main(String[] args) {

        // ==========================================
        // System.out.println() 
        // Imprime lo que le pases y da un "Enter" (salto de línea)
        // ==========================================
        System.out.println("=== EJEMPLO DE PRINTLN ===");
        System.out.println("Hola, mundo!");
        System.out.println(42);
        System.out.println(3.14);
     // Imprime solo una línea en blanco (un salto vacío)
        System.out.println(); 

        // ==========================================
        // System.out.print() 
        // Imprime pero DEJA EL CURSOR AHÍ (no salta de línea)
        // ==========================================
        System.out.println("=== EJEMPLO DE PRINT ===");
        System.out.print("Nombre: ");
        System.out.print("Eduardo");
        // Damos el salto al final para no mezclar con lo siguiente
        System.out.println(); 

        // Otro ejemplo rápido de print para que se vea claro:
        System.out.print("1");
        System.out.print(" + ");
        System.out.print("1");
        System.out.print(" = ");
        // El último con println para cerrar la línea
        System.out.println("2"); 
    }
}
