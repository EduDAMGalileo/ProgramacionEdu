package ejercicios.bloque2;

import java.util.Scanner;

public class Ej_2_44_Bisiesto {
	public static void main(String[] args) {
		int anio;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un año y te digo si es o no es bisiesto");
		anio=sc.nextInt();
		
		if (anio%4==0) {
			//Voy por el camino de ser bisiesto, pero no es suficiente 
			if (anio%400==0){
				//El 400 manda, si es divisible es bisiesto
				System.out.println("Es bisiesto!!");
			} else {
				//Aquí es divisible entre 4, pero no entre 400
				if (anio%100==0) {
					System.out.println("No es bisiesto");		
				} else {
					System.out.println("Es bisiesto!!");
				}
			}
		} else {
			//Si no es divisible entre 4 no hay más que hacer
			System.out.println("No es bisiesto");
		}
		
		//Opción corta
		if (anio%400==0 || ((anio%4==0)&&!(anio%100==0))) {
			System.out.println("Es bisiesto!!");
		} else {
			System.out.println("No es bisiesto");
		}
			
	}

}
