package algoritmos;
import java.util.Scanner;

public class EjemploPseudocodigo {
    public static void main(String[] args) {          // INICIO
        Scanner sc = new Scanner(System.in);

        System.out.print("Primer número: ");           // ESCRIBIR
        int a = sc.nextInt();                          // LEER a
        System.out.print("Segundo número: ");
        int b = sc.nextInt();                          // LEER b

        int mayor;                                     // VARIABLES ... mayor
        if (a > b) {                                   // SI a > b ENTONCES
            mayor = a;                                 //     mayor <- a
        } else {                                       // SI NO
            mayor = b;                                 //     mayor <- b
        }                                              // FIN SI

        System.out.println("El mayor es " + mayor);    // ESCRIBIR
        sc.close();
    }                                                  // FIN
}
