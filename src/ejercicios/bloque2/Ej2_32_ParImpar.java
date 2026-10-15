package ejercicios.bloque2;

import java.util.Scanner;

public class Ej2_32_ParImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número y te digo si es par o impar");
		int num=sc.nextInt();
		
		//Si el resto de la división entre dos es cero significa que es par
		if(num%2==0) {
			System.out.printf("El número %d es par", num);
		} else {
			System.out.printf("El número %d es impar", num);
		}
		
		sc.close();

	}

}
