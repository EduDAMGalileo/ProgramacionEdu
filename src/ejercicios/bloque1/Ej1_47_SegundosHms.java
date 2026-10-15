package ejercicios.bloque1;

import java.util.Scanner;

public class Ej1_47_SegundosHms {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dame un número de segundos y lo transformo: ");
		int tiempo=sc.nextInt();
		
		//Tenemos un número de segundos, vamos a pasarlos a minutos
		int minutos = tiempo / 60;
		int segundos = tiempo % 60;
		
		//Los minutos los pasamos a horas
		int horas = minutos / 60;
		minutos = minutos % 60;
		
		System.out.printf("%02d:%02d:%02d%n", horas, minutos, segundos); 
		sc.close();

	}

}
