package estructurasControl;

public class EstructuraSwitch {
    public static void main(String[] args) {
        
        int diaSemana = 1; // 1: Lunes, 2: Martes, 3: Miércoles...
        System.out.println("Día de la semana (número): " + diaSemana);
        System.out.println("----------------------------------");

        // ==========================================
        // SWITCH CLÁSICO (Con 'break')
        // Si olvidas el 'break', el programa "caerá" a los siguientes casos.
        // ==========================================
        System.out.print("Versión Clásica: ");
        switch (diaSemana) {
            case 1:
                System.out.println("Lunes");
                // ¡Obligatorio para salir del switch!
                break; 
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            default: // Funciona como el 'else' final
                System.out.println("Día no válido (debe ser 1, 2 o 3)");
        }

        // ==========================================
        // SWITCH MODERNO (Con flecha '->')
        // Es más limpio: NO necesita 'break' y evita errores de caídas.
        // ==========================================
        System.out.print("Versión Moderna: ");
        switch (diaSemana) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miércoles");
            default -> System.out.println("Día no válido");
        }
    }
}
