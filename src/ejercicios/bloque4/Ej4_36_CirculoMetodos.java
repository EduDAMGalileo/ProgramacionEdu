package ejercicios.bloque4;

import java.util.Scanner;

public class Ej4_36_CirculoMetodos {
	
	public static double calcularPerimetro(double radio) {
		double perimetro=2*Math.PI*radio;
		return perimetro;
	}
	
	public static double calcularArea(double radio) {
		//Podemos devolver una variable o una exprexión
		//y así me ahorro la variable
		return Math.PI*Math.pow(radio,2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dame el radio de una circunferencia y te doy "
				+ "su logitud y su área: ");
		double radio= sc.nextDouble();
		
		double perimetro = calcularPerimetro(radio);
		double area = calcularArea(radio);
		
		System.out.printf("Con un radio %.2f su perímetro es %.2f "
				+ "y su área %.2f", radio, perimetro, area);
		
		sc.close();
	}
}
