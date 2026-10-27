package ejercicios.bloque3;

import java.util.Scanner;

public class Ej3_62_Cuadrado {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dame un número te pinto un cuadrado: ");
		int numero = sc.nextInt();
		
		//Bucle exterior para las filas
		for(int i=1;i<=numero;i++) {
			//bucle interior para las columnas
			//Que es donde pinto
			for(int j=1;j<=numero;j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}

}
