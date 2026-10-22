package estructurasIterativas;

public class SumaPares {

    public static void main(String[] args) {
        
        // Acumulador donde guardaremos la suma
        int sumaPares = 0;

        // ============================================================
        // BUCLE FOR:
        // - Inicialización: int n = 1
        // - Condición:      n <= 10
        // - Actualización:  n++ (al final de cada vuelta)
        // ============================================================
        for (int n = 1; n <= 10; n++) {
            
            // Filtro condicional: ¿es par? (resto de dividir entre 2 es 0)
            if (n % 2 == 0) {
                sumaPares += n; // Acumulamos el número par sumaPares= sumaPares + n
                System.out.println("Sumado el número: " + n + "  -->  Suma acumulada = " + sumaPares);
            }
        }

        // ============================================================
        // SIGUE EL PROGRAMA (Resultado final)
        // ============================================================
        System.out.println("------------------------------------");
        System.out.println("Suma total de pares: " + sumaPares); // 30
        
        
    }
}