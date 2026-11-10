package ejercicios.bloque4;

import java.util.Scanner;

public class Ej4_38_Comprobaciones_SinMetodos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dame dos números: ");
		int a= sc.nextInt();
		int b= sc.nextInt();
		
		if (a%2==0) {
			System.out.println("El número " + a + " es par");
		} else {
			System.out.println("El número " + a + " es impar");
		}
		
		
		if(a>=0) {
			System.out.println("El número " + a + " es positivo");
		} else {
			System.out.println("El número " + a + " es negativo");
		}
		
		if (a%b==0 || b%a==0) {
			System.out.println( a + " y " + b + " son múltiplos");
		}
		
		
	}

}
