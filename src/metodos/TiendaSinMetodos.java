package metodos;
public class TiendaSinMetodos {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE TIENDA (SIN MÉTODOS) ===");
        System.out.println("--------------------------");

        // --- Cliente 1 ---
        String cliente1 = "Edu";
        double precio1 = 150.0;
        // Aplicamos la lógica de cálculo (IVA y Descuento)
        double resultado1 = (precio1 * 1.21) * 0.90; 
        System.out.println("Cliente: " + cliente1);
        System.out.println("Total a pagar: " + resultado1);
        System.out.println("--------------------------");

        // --- Cliente 2 ---
        String cliente2 = "Paco";
        double precio2 = 300.0;
        // ¡Estamos copiando y pegando la misma fórmula!
        double resultado2 = (precio2 * 1.21) * 0.90; 
        System.out.println("Cliente: " + cliente2);
        System.out.println("Total a pagar: " + resultado2);
        System.out.println("--------------------------");

        // --- Cliente 3 ---
        String cliente3 = "Pepe";
        double precio3 = 50.0;
        // ¡Y otra vez la misma fórmula!
        double resultado3 = (precio3 * 1.21) * 0.90; 
        System.out.println("Cliente: " + cliente3);
        System.out.println("Total a pagar: " + resultado3);
        System.out.println("--------------------------");
        
        // ¿Qué pasa si mañana el impuesto cambia del 21% al 22%? 
        // Tendrías que cambiarlo manualmente en todos los lugares donde lo copiaste.
    }
}