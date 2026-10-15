package estructurasControl;

public class IfElse {
    public static void main(String[] args) {
        
        int edad = 18;
        System.out.println("Edad del usuario: " + edad);
        System.out.println("----------------------------------");

        // ==========================================
        // EL "IF" SOLO (Una puerta con condición única)
        // Se ejecuta SI y solo si la condición es verdadera.
        // Si es falsa, el programa simplemente sigue adelante.
        // ==========================================
        if (edad >= 18) {
            System.out.println("-> Entras por el IF: Eres mayor de edad.");
        }
        
        System.out.println("(El programa continúa su camino tras el if solo...)");
        System.out.println();

        // ==========================================
        // EL "IF-ELSE" (Camino A o Camino B)
        // O se cumple una cosa, o se cumple la contraria. No hay más opciones.
        // ==========================================
        if (edad >= 18) {
            System.out.println("-> IF-ELSE: Puedes votar en las elecciones.");
        } else {
            System.out.println("-> IF-ELSE: Aún eres menor de edad, no puedes votar.");
        }
    }
}
