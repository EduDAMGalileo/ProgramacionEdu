package ejercicios.bloque1;

import java.util.Scanner;

public class Ej1_34_CocienteYResto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Se pueden declarar varias variables en la misma linea
		int num1, num2;
		
		System.out.print("Dame el primer número: ");
		num1 = sc.nextInt();
		System.out.print("Dame el segundo número: ");
		num2 = sc.nextInt();
		
		int cocienteEntero=num1/num2;
		double cocienteReal=(double)num1/num2;
		
		//El operador módulo en JAva es el símbolo %
		int resto=num1%num2;
		System.out.println("El cociente es: " + cocienteEntero + 
				" y el resto es " + resto);
		System.out.println("El cociente con decimales es: " + cocienteReal);
		sc.close();
		
		System.out.println(0.1 + 0.2);

	}

}
