package ejercicios.bloque4;

import java.util.Scanner;

public class Ej4_50_NumerosPerfectos {

	public static int sumaDivisoresPropios(int n) {
		int sumaDivisores=0;
		//Miramos solo hasta la mitad del número
		for (int i=1; i<=n/2; i++) {
			//Si encuentro un divisor lo sumo
			if(n%i==0) {
				sumaDivisores+=i;	
			}
		}
		return sumaDivisores;
	}

	public static boolean esPerfecto(int n) {
		if (sumaDivisoresPropios(n)==n) {
			return true;
		} 
		return false;	
	}

	public static void main(String[] args) {
		for (int i=2; i<10000;i++) {
			if(esPerfecto(i)) {
				System.out.println("El número: " + i + " es perfecto");
			}
		}	
	}
}
