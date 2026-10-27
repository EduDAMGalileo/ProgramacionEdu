package ejercicios.bloque3;

import java.util.Scanner;

public class Ej3_48_EsPrimo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dame un número y te digo si es o no primo: ");
		int numero = sc.nextInt();
		
		boolean esPrimo=true;
		//Nos saltamos el 1 y el propio número
		for(int i=2; i<numero;i++) {
			//Compruebo si ese número es divisor
			if (numero%i==0) {
				//Si entro aquí i es divisor de numero
				esPrimo=false;
			}
		}
		
		if(esPrimo) {
			System.out.println("Es primo");
		}else {
			System.out.println("No es primo");	
		}
		
	}

}
