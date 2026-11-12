package cadenasCaracteres;

public class ProblemaInmutabilidad {
    public static void main(String[] args) {
        final int VUELTAS = 50000;

        System.out.println("Iniciando prueba con " + VUELTAS + " iteraciones...\n");

        // PRUEBA 1: Concatenar con += (Inmutable: crea una cadena nueva cada vez)
        long inicioString = System.currentTimeMillis();

        String texto = "";
        for (int i = 1; i <= VUELTAS; i++) {
            texto += ",";
        }

        long tiempoString = System.currentTimeMillis() - inicioString;
        System.out.println("Con String (+=):         " + tiempoString + " milisegundos.");

       
        // PRUEBA 2: Concatenar con StringBuilder (Mutable: añade al mismo buffer)
        long inicioSB = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= VUELTAS; i++) {
            sb.append(",");
        }
        // Si al final necesitas un String
        String resultadoFinal = sb.toString(); 

        long tiempoSB = System.currentTimeMillis() - inicioSB;
        System.out.println("Con StringBuilder (.append): " + tiempoSB + " milisegundos.");

        // Comparativa final
        System.out.println("\nStringBuilder ha sido unas " + (tiempoString / (tiempoSB == 0 ? 1 : tiempoSB)) + " veces más rápido.");
    }
}