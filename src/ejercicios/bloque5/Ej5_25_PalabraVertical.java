package ejercicios.bloque5;

import java.util.Scanner;

public class Ej5_25_PalabraVertical {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dame un número y la escribo en vertical: ");
		String palabra = sc.nextLine();
		
		//System.out.println(palabra + " tiene " + palabra.length() + " letras");
		
		//El primer caracter de un String está en la posición 0
		for (int i=0; i<palabra.length();i++) {
			System.out.println(palabra.charAt(i));
		}
		
		//Y ahora al revés
		for (int i=palabra.length()-1; i>=0;i--) {
			System.out.println(palabra.charAt(i));
		}
		
		sc.close();

	}
}
