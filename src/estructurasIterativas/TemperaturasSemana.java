package estructurasIterativas;

import java.util.Scanner;

public class TemperaturasSemana {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ============================================================
        // PRIMERA LECTURA: Define el estándar inicial
        // ============================================================
        System.out.print("Temperatura día 1: ");
        double t1 = sc.nextDouble();

        //Como es el único es máximo y mínimo a la vez, temporalemnte
        double maxima = t1; 
        double minima = t1; 

        // ============================================================
        // BUCLE DESDE EL DÍA 2 HASTA EL 7
        // ============================================================
        for (int i = 2; i <= 7; i++) {
            System.out.print("Temperatura día " + i + ": ");
            double t = sc.nextDouble();

            // ¿Hemos encontrado una temperatura mayor?
            if (t > maxima) {
                maxima = t;
            }

            // ¿Hemos encontrado una temperatura menor?
            if (t < minima) {
                minima = t;
            }
        }

        // ============================================================
        // RESULTADOS
        // ============================================================
        System.out.println("------------------------------------");
        System.out.printf("Temperatura máxima de la semana: %.1f ºC%n", maxima);
        System.out.printf("Temperatura mínima de la semana: %.1f ºC%n", minima);

        sc.close();
    }
}
