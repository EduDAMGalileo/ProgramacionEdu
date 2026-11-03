package algoritmos;

public class MCDIngenuo {
    public static void main(String[] args) {

        int a = 1000000;
        int b = 999999;

        // d <- mínimo(a, b)
        int d = Math.min(a, b);

        // MIENTRAS NO (a MOD d = 0 Y b MOD d = 0) HACER
        while (!(a % d == 0 && b % d == 0)) {
            // d <- d - 1
            d = d - 1;
        }

        // ESCRIBIR d
        System.out.println("El MCD (Versión Ingenua) de " + a + " y " + b + " es: " + d);
    }
}