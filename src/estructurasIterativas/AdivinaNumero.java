package estructurasIterativas;

import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secreto = (int) (Math.random() * 100) + 1;   // entre 1 y 100
        int intento;
        int intentos = 0;

        System.out.println("He pensado un número entre 1 y 100.");
        do {
            System.out.print("Tu intento: ");
            intento = sc.nextInt();
            intentos++;
            if (intento < secreto) {
                System.out.println("Más alto.");
            } else if (intento > secreto) {
                System.out.println("Más bajo.");
            }
        } while (intento != secreto);

        System.out.printf("¡Correcto! Lo has adivinado en %d intentos.%n", intentos);
        sc.close();
    }
}
