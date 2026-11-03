package algoritmos;

public class MCDEuclides {
    public static void main(String[] args) {
        // Ejemplo con los mismos números para comparar el rendimiento
        int a = 1000000;
        int b = 999999;

        // MIENTRAS b > 0 HACER
        while (b > 0) {
            // resto <- a MOD b
            int resto = a % b;
            
            // a <- b
            a = b;
            
            // b <- resto
            b = resto;
        }

        // ESCRIBIR a (en este punto, 'a' contiene el MCD)
        System.out.println("El MCD (Algoritmo de Euclides) es: " + a);
    }
}