package ejercicios.bloque5;

import java.util.Scanner;

public class Ej5_32_MayusculasDelReves {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dame una palabra y la escribo en mayúculas y del revés: ");
		String palabra = sc.nextLine();
		
		//Antes de recorrer el String, lo pasamos a mayúsculas
		String palabraMayusculas = palabra.toUpperCase();
		
		//Tengo que recorrer el String al revés
		for(int i=palabraMayusculas.length()-1;i>=0;i--) {
			System.out.print(palabraMayusculas.charAt(i));
		}
		

	}

}
