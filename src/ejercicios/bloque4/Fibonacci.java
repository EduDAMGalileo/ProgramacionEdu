package ejercicios.bloque4;

import java.util.Scanner;

public class Fibonacci {
	
	public static void imprimirSucesionFibonacci(int t) {
		long ultimo = 1;
		long penultimo = 0;
		
		System.out.print(penultimo + ", " + ultimo + ", ");
		//Calcular los términos que me pidan

		//Los dos primeros ya los tenemos, siempre son los mismos
		//empezamos en 3
		for(int i = 3; i<=t;i++) {
			long siguiente=ultimo+penultimo;
			System.out.print(siguiente + ", ");
			penultimo=ultimo;
			ultimo=siguiente;
		}
	}
	
	public static long terminoN(int n) {
		long ultimo = 1;
		long penultimo = 0;
		long siguiente = 0;
		
		for(int i = 3; i<=n;i++) {
			siguiente=ultimo+penultimo;
			penultimo=ultimo;
			ultimo=siguiente;
		}
		//Una vez que he terminado de calcularlo, lo devuelvo
		return siguiente;	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("¿Qué término de la sucesión de Fibonacci necesitas?");
		int termino= sc.nextInt();
		imprimirSucesionFibonacci(termino);
		System.out.println("\n" + terminoN(termino));
	
		
	}

}
