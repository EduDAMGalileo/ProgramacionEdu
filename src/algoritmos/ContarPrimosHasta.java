package algoritmos;


import java.util.Scanner;

public class ContarPrimosHasta{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número límite N para contar primos (ej. 50000): ");
        long limite = sc.nextLong();
        sc.close();

        System.out.println("\n=== CONTANDO PRIMOS HASTA EL NÚMERO " + limite + " ===\n");
        System.out.println("Aviso: Las versiones 1 y 2 pueden tardar un poco más si el número es grande...\n");

        // Probamos la Versión 1
        long inicio = System.nanoTime();
        int totalV1 = contarPrimosConMetodo(limite, 1);
        long t1 = System.nanoTime() - inicio;
        System.out.printf("Método 1 (Todos de 2 a N-1)		-> Primos encontrados: %d | Tiempo: %.2f ms%n", totalV1, t1 / 1_000_000.0);

        // Probamos la Versión 2
        inicio = System.nanoTime();
        int totalV2 = contarPrimosConMetodo(limite, 2);
        long t2 = System.nanoTime() - inicio;
        System.out.printf("Método 2 (Parar al encontrar div)	-> Primos encontrados: %d | Tiempo: %.2f ms%n", totalV2, t2 / 1_000_000.0);

        // Probamos la Versión 3 (Hasta N/2)
        inicio = System.nanoTime();
        int totalV3 = contarPrimosConMetodo(limite, 3);
        long t3 = System.nanoTime() - inicio;
        System.out.printf("Método 3 (Hasta N/2)			-> Primos encontrados: %d | Tiempo: %.2f ms%n", totalV3, t3 / 1_000_000.0);

        // Probamos la Versión 4 (Impares hasta N/2)
        inicio = System.nanoTime();
        int totalV4 = contarPrimosConMetodo(limite, 4);
        long t4 = System.nanoTime() - inicio;
        System.out.printf("Método 4 (Impares hasta N/2)		-> Primos encontrados: %d | Tiempo: %.2f ms%n", totalV4, t4 / 1_000_000.0);

        // Probamos la Versión 5 (Impares hasta raíz cuadrada)
        inicio = System.nanoTime();
        int totalV5 = contarPrimosConMetodo(limite, 5);
        long t5 = System.nanoTime() - inicio;
        System.out.printf("Método 5 (Raíz cuadrada)		-> Primos encontrados: %d | Tiempo: %.2f ms%n", totalV5, t5 / 1_000_000.0);
    }

    // Un método que recorre el rango de 1 a N llamando al algoritmo de primos correspondiente
    public static int contarPrimosConMetodo(long limite, int version) {
        int contador = 0;
        for (long i = 1; i <= limite; i++) {
            boolean esPr = false;
            switch (version) {
            	case 1 -> esPr = EsPrimoMetodos.esPrimoV1(i);
            	case 2 -> esPr = EsPrimoMetodos.esPrimoV2(i);
                case 3 -> esPr = EsPrimoMetodos.esPrimoV3(i);
                case 4 -> esPr = EsPrimoMetodos.esPrimoV4(i);
                case 5 -> esPr = EsPrimoMetodos.esPrimoV5(i);
            }
            if (esPr) {
                contador++;
            }
        }
        return contador;
    }
}