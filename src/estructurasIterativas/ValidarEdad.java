package estructurasIterativas;

import java.util.Scanner;

public class ValidarEdad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Mensaje inicial
        System.out.print("Edad: ");

        // ============================================================
        // BUCLE WHILE: Se repite MIENTRAS lo que haya en el buffer
        // NO sea un número entero (sc.hasNextInt() devuelve false)
        // ============================================================
        while (!sc.hasNextInt()) {
            // Descartamos la entrada incorrecta para vaciar el buffer
            String basura = sc.next();
            System.out.print("\"" + basura + "\" no es un número. Edad: ");
        }

        // ============================================================
        // LECTURA SEGURA: Si salimos del bucle, garantizamos
        // que lo que viene es un entero válido
        // ============================================================
        int edad = sc.nextInt();

        // Sigue el programa
        System.out.println("------------------------------------");
        System.out.println("Edad registrada correctamente: " + edad + " años.");

        sc.close();
    }
}