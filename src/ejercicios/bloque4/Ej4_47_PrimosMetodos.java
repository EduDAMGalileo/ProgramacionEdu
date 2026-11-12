package ejercicios.bloque4;

import java.util.Scanner;

public class Ej4_47_PrimosMetodos {
	
	static boolean esPrimo(int num) {
		for(int i=2; i<num/2;i++) {
			if (num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	static int contarPrimos(int desde, int hasta) {
		int numPrimos=0;
		for(int i=desde;i<=hasta;i++) {
			if(esPrimo(i)) {
				numPrimos++;
			}
		}
		return numPrimos;
	}
	
	static int siguientePrimo(int num) {
		while(true) {
			if (esPrimo(++num)) {
				return num;
			}
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dame un número y te digo si es o no primo: ");
		int numero = sc.nextInt();
		
		if(esPrimo(numero)) {
			System.out.println("El número es primo");
		}else {
			System.out.println("El número no es primo");
		}
		
		System.out.println("Su siguiente primo es: " + siguientePrimo(numero));
		
		System.out.print("Dame dos número y te digo cuantos primos hay entre medias"
				+ " es o no primo: ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Hay " + contarPrimos(a,b) + " números primos " +
		" entre el " + a + " y el 71");

	}

}
