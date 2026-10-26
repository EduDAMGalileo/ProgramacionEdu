package ejercicios.bloque3;

import java.util.Scanner;

public class Ej3_39_Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dame un número y te muestro su factorial: ");
		int numero = sc.nextInt();
		int factorial=1;
		
		for (int i=2;i<=numero;i++) {
			System.out.println("Tengo " + factorial + " lo multiplico por " + i);
			factorial=factorial*i;
		}
		
		System.out.printf("El factorial de %d es %d %n%n", numero, factorial);
		
		//Al revés, desde el número hasta el 1
		//Vuelvo a poner en 1 la variable factorial
		
		factorial=1;
		for(int i=numero; i>1; i--) {
			System.out.println("Tengo " + factorial + " lo multiplico por " + i);
			factorial=factorial*i;
		}
		System.out.printf("El factorial de %d es %d", numero, factorial);
	}

}
