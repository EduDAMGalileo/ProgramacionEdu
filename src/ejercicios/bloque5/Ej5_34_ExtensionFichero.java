package ejercicios.bloque5;

import java.util.Scanner;

public class Ej5_34_ExtensionFichero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dame el nombre y extensión de un fichero: ");
		String fichero= sc.nextLine();
		Math.pow(2, 3);

		
		//Para saber la extensión del fichero tengo que buscar el '.'
		int posUltimoPunto = fichero.lastIndexOf(".");
		
		//Ahora imprimo hasta el punto y después desde el punto
		System.out.println("Nombre del fichero: " + fichero.substring(0, posUltimoPunto));
		System.out.println("Extension: " + fichero.substring(posUltimoPunto));
	}
}
