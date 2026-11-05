package ejercicios.bloque1;

import java.util.Scanner;

public class Ej1_36_Circulo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dame el radio de una circunferencia y te doy "
				+ "su logitud y su área: ");
		double radio= sc.nextDouble();
		
		double longitud = 2*Math.PI*radio;
		double area = Math.PI*Math.pow(radio,2);
		
		System.out.printf("Con un radio %.2f su perímetro es %.2f "
				+ "y su área %.2f", radio, longitud, area);		
	}
}
