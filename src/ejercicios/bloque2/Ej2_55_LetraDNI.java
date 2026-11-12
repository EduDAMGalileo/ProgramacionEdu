package ejercicios.bloque2;

import java.util.Scanner;

public class Ej2_55_LetraDNI {
	final static String LETRA="TRWAGMYFPDXBNJZSQVHLCKE";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu número de DNI y te digo la letra");
		int numDNI = sc.nextInt();

		//El resto de dividir entre 23 es un número entre 0 y 22
		int resto = numDNI % 23;
		System.out.println("La letra de tu DNI es: " + LETRA.charAt(resto));
	}
}
