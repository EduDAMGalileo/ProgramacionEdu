package ejercicios.bloque2;

import java.util.Scanner;

public class Ej2_53_DiasDelMes {

	public static void main(String[] args) {
		int mes;
		int anio=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un mes (1-12) y te digo los días que tiene");
		mes=sc.nextInt();
		if (mes==2) {
			System.out.print("Febrero es un mes complicado, de qué año hablamos?");
			anio=sc.nextInt();
		}
		
		
		switch(mes) {
			case 1, 3, 5, 7, 8, 10, 12:
				System.out.println("Tiene 31 días");
				break;
			case 2:
				if (anio%400==0 || ((anio%4==0)&&(anio%100!=0))) {
					System.out.println("Es bisiesto!! tiene 29 días");
				} else {
					System.out.println("No es bisiesto, tiene 28 días");
				}
				break;
			case 4, 6, 9, 11: 
				System.out.println("Tiene 30 días");
				break;
			default:
				System.out.println("El mes no es válido");
		}

	}

}
