package algoritmos;

import java.util.Scanner;

public class SucesionFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el valor máximo N para Fibonacci: ");
        int n = sc.nextInt();

        long anterior = 0;
        long actual = 1;

        System.out.println("Sucesión de Fibonacci hasta " + n + ":");
        
        while (anterior <= n) {
            System.out.print(anterior + " ");
            
            // Calculamos el siguiente y desplazamos los valores
            long siguiente = anterior + actual;
            anterior = actual;
            actual = siguiente;
        }
        System.out.println();
        sc.close();
    }
}