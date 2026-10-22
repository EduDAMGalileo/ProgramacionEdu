package ejercicios.bloque3;

import java.util.Scanner;

public class Ej3_33_TablaMultiplicar {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Dame un número y te muestro su tabla de multiplicar: ");
		int numero = sc.nextInt();
		
		for(int i=1; i<=10;i++) {
			//Quiero que muestre algo como 3 x 2 = 6
			System.out.printf("%2d x %2d = %3d %n", numero, i, i*numero);
		}
	}

}
