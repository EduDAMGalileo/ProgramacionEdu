package ejercicios.bloque2;

import java.util.Scanner;

public class Ej2_27_MayorDeDos {

	public static void main(String[] args) {
		
		int a, b;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Te voy a pedir dos números y después te digo cual es más grande");
		System.out.println("Dame el primer número");
		a = sc.nextInt();
		System.out.println("Dame el segundo número");
		b = sc.nextInt();
		
		if (a>b) {
			System.out.println("El mayor es " + a);
		} else {
			if(a<b) {
				System.out.println("El mayor es " + b);	
			}else {
				System.out.println("Son iguales");
			}
		}
		
		//Solución más elegante, if-else-if
		if(a>b) {
			System.out.println("El mayor es " + a);
		}else if(a<b) {
			System.out.println("El mayor es " + b);
		}else {
			System.out.println("Son iguales");
		}

	}

}
