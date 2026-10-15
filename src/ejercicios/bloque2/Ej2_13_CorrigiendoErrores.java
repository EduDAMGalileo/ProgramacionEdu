package ejercicios.bloque2;

import java.util.Scanner;

public class Ej2_13_CorrigiendoErrores {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int x = sc.nextInt(); 

		if (x == 5) {
			System.out.println("Es cinco");
		}

		if (x >= 1 && x <= 100) {
			System.out.println("En rango");
		}

		if (x > 0) {
			System.out.println("Positivo");
		}

		else {
			System.out.println("No positivo");
		}
		
		boolean socio= true;
		
		double precio;
		if (socio) { 
			precio = 8.0; 
		} else { 
			precio = 10.0; 
		} 
		System.out.println(precio);
		
		int op=2;
		 switch (op) { 
		      case 1: 
		    	  System.out.println("Sumar"); 
		    	  break; 
		      case 2: 
		    	  System.out.println("Restar"); 
		    	  break; 
		  }
		 

	}
}

