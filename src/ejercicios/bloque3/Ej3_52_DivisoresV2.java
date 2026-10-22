package ejercicios.bloque3;

import java.util.Scanner;

public class Ej3_52_DivisoresV2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dame un número y te muestro sus divisores: ");
		int numero = sc.nextInt();
		
		//Si estamos aquí, yo sé que el bucle se va a ejecutar 'numero' veces
		for (int i=1;i<=numero;i++) {
			if (numero % i==0) {
				//Significa que i es divisor de n
				System.out.println("Divisor encontrado " + i);
			}
		}
		
		
	}
}
