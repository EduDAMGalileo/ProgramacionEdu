package metodos;
public class TiendaConMetodos {

    //CREAMOS EL MÉTODO: Hace una tarea específica, pide datos y devuelve un resultado
    public static double calcularPrecioFinal(double precioBase) {
        // La fórmula escrita solo una vez
        return (precioBase * 1.21) * 0.90;
    }

    // Método auxiliar opcional para no repetir los println de los tickets
    public static void imprimirTicket(String cliente, double precioBase) {
    	// Desde un método podemos llamar a otro
        double total = calcularPrecioFinal(precioBase); 
        System.out.println("Cliente: " + cliente);
        System.out.println("Total a pagar: " + total);
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE TIENDA (CON MÉTODOS) ===");
        System.out.println("--------------------------");

        // --- Cliente 1 ---
        imprimirTicket("Edu", 150.0);

        // --- Cliente 2 ---
        imprimirTicket("Paco", 300.0);

        // --- Cliente 3 ---
        imprimirTicket("Pepe", 50.0);

        // ¿Qué pasa si mañana el impuesto cambia? 
        // Solo lo cambias en la línea 5 del método 'calcularPrecioFinal' y se actualiza para todos automáticamente.
    }
}