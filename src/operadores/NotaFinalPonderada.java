package operadores;

import java.util.Scanner;

public class NotaFinalPonderada {
    public static void main(String[] args) {
        final double PESO_TEORIA = 0.6;
        final double PESO_PRACTICA = 0.4;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nota de teoría (0-10): ");
        //Para evitar problemas con la coma, veremos más adelante qué es esto del replace
        double teoria = Double.parseDouble(sc.nextLine().replace(",", "."));
        System.out.print("Nota de práctica (0-10): ");
        double practica = Double.parseDouble(sc.nextLine().replace(",", "."));

        double notaFinal = teoria * PESO_TEORIA + practica * PESO_PRACTICA;
        boolean notasValidas = teoria >= 0 && teoria <= 10 && practica >= 0 && practica <= 10;
        String resultado = notaFinal >= 5.0 ? "APROBADO" : "SUSPENSO";

        System.out.printf("Nota final: %.2f (redondeada: %d)%n", notaFinal, Math.round(notaFinal));
        System.out.println("¿Notas válidas? " + notasValidas);
        System.out.println("Resultado: " + resultado);
        sc.close();
    }
}

