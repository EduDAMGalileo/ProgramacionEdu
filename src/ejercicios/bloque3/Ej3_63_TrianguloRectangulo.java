package ejercicios.bloque3;

import java.util.Scanner;

public class Ej3_63_TrianguloRectangulo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dame un número te pinto un triángulo rectangulo: ");
		int numero = sc.nextInt();
		
		//Forma 1
		for(int i=1; i<=numero;i++) {
			//Tengo que pintar el mismo número de * que filas 
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n\n");
		
		//Forma 2, la de Miguel
		for(int i=1; i<=numero;i++) {
			System.out.println("*".repeat(i));
		}
	}
}
