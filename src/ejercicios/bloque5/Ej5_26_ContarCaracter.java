package ejercicios.bloque5;

import java.util.Scanner;

public class Ej5_26_ContarCaracter {

	public static int contar(String s, char c) {
		int veces=0;
		for (int i=0; i<s.length();i++) {
			if (s.charAt(i)==c) {
				veces++;
			}
		}
		return veces;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe una frase: ");
		String frase = sc.nextLine();
		System.out.println("Escribe un caracter y cuento cuantas veces aparece: ");
		//Cojo el primer caracter de la línea
		char caracter = sc.nextLine().charAt(0);
		/*
		int numApariciones=0;
		for (int i=0; i<frase.length();i++) {
			if (frase.charAt(i)==caracter) {
				numApariciones++;
			}
		}*/
		int numApariciones= contar(frase, caracter);
		System.out.printf("En total, el caracter %c aparece "
				+ "un total de %d veces", caracter, numApariciones);
	}

}
