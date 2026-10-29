package ejercicios.bloque3;

import java.util.Scanner;

public class Ej3_62_CuadradoV2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dame un número te pinto un cuadrado: ");
		int numero = sc.nextInt();
		
		
		//Bucle exterior para las filas
		for(int i=1;i<=numero;i++) {
			//Bloque interno para las columnas
			for(int j=1;j<=numero;j++) {
				//Si estamos en la primera o última fila o columna hay *
				//y lo mismo para las columnas, sino es un hueco
				if(i==1 || i==numero || j==1 || j==numero) {
					System.out.print("* ");	
				} else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}

	}	
}
