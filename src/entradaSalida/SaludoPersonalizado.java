package entradaSalida;

import java.util.Scanner;

public class SaludoPersonalizado {
	public static void main (String[] args) {
		Scanner lector = new Scanner(System.in);
		String nombre;
		
		System.out.print("Hola, cómo te llamas?");
		nombre=lector.nextLine();
		System.out.print("Encantado de cononcerte " + nombre);
		
		lector.close();
				
	}

}
