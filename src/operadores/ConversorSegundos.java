package operadores;

import java.util.Scanner;

public class ConversorSegundos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Segundos totales: ");
        int total = sc.nextInt();

        int horas = total / 3600;           // horas completas
        int resto = total % 3600;           // segundos que sobran tras quitar las horas
        int minutos = resto / 60;
        int segundos = resto % 60;

        System.out.printf("%d segundos = %02d:%02d:%02d%n", total, horas, minutos, segundos);
        sc.close();
    }
}
