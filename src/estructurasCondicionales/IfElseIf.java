package estructurasCondicionales;

public class IfElseIf{
    public static void main(String[] args) {
        
        // Cambia esta nota para probar (ej. 9.5, 7.5, 4.0)
        double nota = 7.5; 
        
        System.out.println("Nota obtenida: " + nota);
        System.out.println("==================================");

        // ==========================================================
        // OPCIÓN A: Escalera de IF - ELSE IF - ELSE 
        // (La forma más limpia, recomendada y habitual)
        // ==========================================================
        System.out.println("--- OPCIÓN A: if - else if - else ---");
        
        if (nota >= 9.0) {
            System.out.println("¡Sobresaliente!");
        } 
        else if (nota >= 7.0) {
            System.out.println("Notable.");
        } 
        else if (nota >= 5.0) {
            System.out.println("Aprobado.");
        } 
        else {
            System.out.println("Suspenso.");
        }

        System.out.println();

        // ==========================================================
        // OPCIÓN B: IFs ANIDADOS (Un if dentro de otro if)
        // Funciona igual, pero obliga a marchar hacia la derecha 
        // (crea "efecto escalera" o código en pico).
        // ==========================================================
        System.out.println("--- OPCIÓN B: if anidados (dentro de otros) ---");

        if (nota >= 5.0) {
            // Si entra aquí, ya sabemos que está aprobado. 
            // Ahora miramos si además es notable o sobresaliente:
            if (nota >= 9.0) {
                System.out.println("¡Sobresaliente!");
            } else {
                // Si es >= 5 pero menor que 9, miramos si llega al notable
                if (nota >= 7.0) {
                    System.out.println("Notable.");
                } else {
                    System.out.println("Aprobado.");
                }
            }
        } else {
            // Si el primer if gigante falla:
            System.out.println("Suspenso.");
        }
    }
}