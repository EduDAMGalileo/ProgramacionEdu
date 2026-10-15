package ejercicios.bloque1;

import java.util.Scanner;

public class Ej1_52_CalculaMonedas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuántas monedas de 2€ tienes: ");
		int monedas2= sc.nextInt();
		System.out.println("Cuántas monedas de 1€ tienes: ");
		int monedas1= sc.nextInt();
		System.out.println("Cuántas monedas de 0,5€ tienes: ");
		int monedas05= sc.nextInt();
		System.out.println("Cuántas monedas de 0,2€ tienes: ");
		int monedas02= sc.nextInt();
		System.out.println("Cuántas monedas de 0,1€ tienes: ");
		int monedas01= sc.nextInt();
		
		//Para calcular el total, vamos a trabajar en céntimos
		int total = monedas2*200+monedas1*100+monedas05*50+monedas02*20+monedas01*10;
		//Pasamos el total a euros y céntimos
		int euros=total/100;
		int centimos=total%100;
		System.out.printf("Total: %d € y %d céntimos%n%n", euros, centimos);
		
		if (euros>=10) {
			System.out.println("Tienes 10€ o más");
		}else {
			System.out.println("Tienes menos de 10€");
		}
		
		
		sc.close();
	}
}
