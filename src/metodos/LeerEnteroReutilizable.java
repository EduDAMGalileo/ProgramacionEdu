package metodos;

import java.util.Scanner;

public class LeerEnteroReutilizable {
	
	static int leerEntero(Scanner sc, String mensaje, int min, int max) {
	    int valor;
	    do {
	        System.out.print(mensaje);
	        while (!sc.hasNextInt()) {
	        	// descartamos lo que no es número
	            sc.next();                               
	            System.out.print("Debe ser un número entero. " + mensaje);
	        }
	        valor = sc.nextInt();
	        if (valor < min || valor > max) {
	            System.out.println("Debe estar entre " + min + " y " + max + ".");
	        }
	    } while (valor < min || valor > max);
	    return valor;
	}

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int edad = leerEntero(sc, "Edad: ", 0, 120);
	    int curso = leerEntero(sc, "Curso (1 o 2): ", 1, 2);
	    System.out.println("Edad " + edad + ", curso " + curso);
	    sc.close();
	}


}
