package estructurasIterativas;

import java.util.Scanner;

public class CifrasNumero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero positivo: ");
        int numeroOriginal = sc.nextInt();

        // Trabajamos con el valor absoluto para admitir negativos
        //Ya veremos qué es esto de Math y Random
        int n = Math.abs(numeroOriginal);

        int sumaCifras = 0;
        int numCifras = 0;

        // Caso especial si el usuario introduce exactamente el 0
        if (n == 0) {
            numCifras = 1;
            sumaCifras = 0;
        } else {
            // ========================================================
            // BUCLE DE DESCOMPOSICIÓN DE CIFRAS
            // ========================================================
            while (n > 0) {
                int ultimaCifra = n % 10;   // 1. Extraer última cifra
                sumaCifras += ultimaCifra;  // 2. Acumularla
                numCifras++;                // 3. Contar la cifra
                
                n /= 10;                    // 4. Quitar la última cifra
            }
        }

        System.out.println("------------------------------------");
        System.out.println("El número " + numeroOriginal + " tiene " 
                           + numCifras + " cifras que suman " + sumaCifras);

        sc.close();
    }
}
