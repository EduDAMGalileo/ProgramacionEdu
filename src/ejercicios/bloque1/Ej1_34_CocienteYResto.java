package ejercicios.bloque1;

import java.util.Scanner;

public class Ej1_34_CocienteYResto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Se pueden declarar varias variables en la misma linea
		int num1, num2;
		int suma, resta, multiplicacion;
		System.out.print("Dame el primer número: ");
		num1 = sc.nextInt();
		System.out.print("Dame el segundo número: ");
		num2 = sc.nextInt();
		
		suma = num1 + num2;
		resta = num1 - num2;
		multiplicacion = num1 * num2;
		
		System.out.println("La suma es: " + suma);
		System.out.println("La resta es: " + resta);
		System.out.println("El producto es: " + multiplicacion);
		
		//Version2
		System.out.println("La suma es: " + (num1 + num2));
		System.out.println("La resta es: " + (num1 - num2));
		System.out.println("El producto es: " + num1*num2);
		
		sc.close();
	}

}
