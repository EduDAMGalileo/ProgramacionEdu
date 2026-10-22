package ejercicios.bloque3;

import java.util.Scanner;

public class Ej3_40_PotenciaSinPotencia {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Dame dos números (base y exponente) y te calculo la potencia: ");
		int base = sc.nextInt();
		int exponente=sc.nextInt();
		System.out.println("Vamos a calcular " + base + " elevado a " + exponente);

		//Para acumular multiplicaciones tengo que inicializar la variable a 1
		double resultado=1;
		int hasta;
		
		if (exponente < 0) {
			//Si es negativo, le cambio el signo
			hasta=-exponente;
		}  else {
			hasta =exponente;
		}
		
		for(int i = 1; i<=hasta;i++) {
			resultado=resultado*base;
		}
		
		if(exponente<0) {
			System.out.println("El resultado es: " + 1/resultado);	
		} else {
			System.out.println("El resultado es: " + resultado);	
		}
		
		//Los programadores de Java ha resuelto este ejercicio antes que nosotros
		//La clase Math está pensada para usarse como utilidad para calculos matemáticos
		System.out.println("El valor absoluto de " + exponente + " es " + Math.abs(exponente));
		
		//También ha resuelto el tema de las potencias
		System.out.println(base + " elevado a " + exponente + " es " + Math.pow(base, exponente));
		
	}
}
