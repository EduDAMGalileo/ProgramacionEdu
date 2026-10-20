package estructurasIterativas;

import java.util.Scanner;

public class ContadorYAcumulador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ============================================================
        // PARTE 1: CONTADOR Y ACUMULADOR DE SUMA
        // ============================================================
        System.out.println("=== 1. NOTAS DE CLASE ===");
        
        int aprobados = 0;      // CONTADOR: responde a "¿cuántos?" (paso constante +1)
        double sumaNotas = 0.0; // ACUMULADOR (+): responde a "¿cuánto suman?" (neutro = 0)

        int totalAlumnos = 5;

        for (int i = 1; i <= totalAlumnos; i++) {
            System.out.print("Introduce la nota del alumno " + i + ": ");
            double nota = sc.nextDouble();

            // ACUMULADOR: suma un valor que cambia en cada vuelta (nota)
            sumaNotas += nota;

            // CONTADOR: solo suma 1 cuando se cumple la condición
            if (nota >= 5.0) {
                aprobados++; // equivalente a: aprobados = aprobados + 1;
            }
        }

        double media = sumaNotas / totalAlumnos;

        System.out.println("------------------------------------");
        System.out.println("Aprobados (Contador):  " + aprobados + " alumnos.");
        System.out.printf("Suma total (Acumulador): %.2f\n", sumaNotas);
        System.out.printf("Nota media de la clase:  %.2f\n", media);


        // ============================================================
        // PARTE 2: ACUMULADOR DE PRODUCTO (FACTORIAL)
        // ============================================================
        System.out.println("\n=== 2. FACTORIAL (ACUMULADOR DE PRODUCTO) ===");
        System.out.print("Introduce un número entero (ej: 5): ");
        int n = sc.nextInt();

        // ACUMULADOR (*): su elemento neutro es 1 (si fuese 0, todo daría 0)
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i; // equivalente a: factorial = factorial * i;
        }

        System.out.println("El factorial de " + n + " (" + n + "!) es: " + factorial);

        sc.close();
    }
}