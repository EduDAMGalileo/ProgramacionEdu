package estructurasIterativas;

import java.util.Scanner;

public class Contraseña {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final String CLAVE = "dam2026";
		final int MAX_INTENTOS = 3;
		int intentos = 0;
		boolean acceso = false;

		while (intentos < MAX_INTENTOS && !acceso) {
		    System.out.print("Contraseña: ");
		    String clave = sc.nextLine();
		    intentos++;
		    if (clave.equals(CLAVE)) {
		        acceso = true;
		    } else if (intentos < MAX_INTENTOS) {
		        System.out.println("Incorrecta. Te quedan " + (MAX_INTENTOS - intentos) + " intentos.");
		    }
		}
		System.out.println(acceso ? "Acceso concedido." : "Cuenta bloqueada.");

	}

}
