package ejercicios.bloque5;

import java.util.Scanner;

public class Ej5_31_ContrasenaLarga {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe tu contraseña");
		String pass = sc.nextLine();
		
		if(pass.length()<8) {
			System.out.println("Tu contraseña es demasiado corta"
					+ " faltan " + (8-pass.length()) + " caracteres");
		}
		sc.close();
		
	}

}
