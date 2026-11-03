package algoritmos;

public class ComparacionMCD {
    public static void main(String[] args) {
        // Dos números grandes sin un divisor común obvio cercano
        long aOriginal = 987654321098L;
        long bOriginal = 123456789012L;

        System.out.println("Calculando el MCD de: " + aOriginal + " y " + bOriginal + "\n");


        // VERSIÓN INGENUA

        long a = aOriginal;
        long b = bOriginal;
        long d = Math.min(a, b);

        long inicioIngenuo = System.currentTimeMillis();

        while (!(a % d == 0 && b % d == 0)) {
            d = d - 1;
        }

        long finIngenuo = System.currentTimeMillis();
        
        System.out.println("--- Versión Ingenua ---");
        System.out.println("MCD: " + d);
        System.out.println("Tiempo transcurrido: " + (finIngenuo - inicioIngenuo) + " ms\n");


        //ALGORITMO DE EUCLIDES

        a = aOriginal;
        b = bOriginal;

        long inicioEuclides = System.currentTimeMillis();

        while (b > 0) {
            long resto = a % b;
            a = b;
            b = resto;
        }

        long finEuclides = System.currentTimeMillis();

        System.out.println("--- Algoritmo de Euclides ---");
        System.out.println("MCD: " + a);
        System.out.println("Tiempo transcurrido: " + (finEuclides - inicioEuclides) + " ms");
    }
}