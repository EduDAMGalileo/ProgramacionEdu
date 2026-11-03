package metodos;

import java.util.Scanner;

public class MetodoMenu {
	public static void mostrarMenu() {
	    System.out.println("\n1. Área de un círculo");
	    System.out.println("2. Área de un rectángulo");
	    System.out.println("0. Salir");
	}

	public static double areaCirculo(double radio) {
	    return Math.PI * radio * radio;
	}

	public static double areaRectangulo(double base, double altura) {
	    return base * altura;
	}

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int opcion;
	    do {
	        mostrarMenu();
	        //Podemos llamar a métodos de otras clases, pero ya entraremos en estos detalles
	        //Lo uso aquí porque viene bien, pero no siempre es posible
	        opcion = LeerEnteroReutilizable.leerEntero(sc, "Opción: ", 0, 2);
	        switch (opcion) {
	            case 1 -> {
	                System.out.print("Radio: ");
	                System.out.printf("Área: %.2f%n", areaCirculo(sc.nextDouble()));
	            }
	            case 2 -> {
	                System.out.print("Base: ");
	                double b = sc.nextDouble();
	                System.out.print("Altura: ");
	                double h = sc.nextDouble();
	                System.out.printf("Área: %.2f%n", areaRectangulo(b, h));
	            }
	            case 0 -> System.out.println("Hasta luego.");
	        }
	    } while (opcion != 0);
	    sc.close();
	}


}
