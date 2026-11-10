package ejercicios.bloque4;

import java.util.Scanner;

public class Ej4_38_Comprobaciones{
	
	public static boolean esPar(int numero) {
		if (numero%2==0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean esPositivo(int numero) {
		//No consideramos al 0 como positivo
		if (numero>0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void esPositivo2(int numero) {
		//Aquí mostramos directamente en pantalla
		if (numero>0) {
			System.out.println("El número " + numero + " es positivo");
		}else {
			System.out.println("El número " + numero + " es negativo");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dame dos números: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("El número " + a + " es "
		+ ((esPar(a)) ? "par" : "impar") + " además es "  
		+ ((esPositivo(a)) ? "positivo" : "negativo"));
		
		//Lo mismo sin operador ternario
		//No hace falta el ==true, pero al principio lo veis mejor con él
		if(esPar(a)==true) {
			System.out.println("Es par");
		}else {
			System.out.println("Es impar");
		}
		
		
		if (a%b==0 || b%a==0) {
			System.out.println( a + " y " + b + " son múltiplos");
		}
		
		
	}

}
