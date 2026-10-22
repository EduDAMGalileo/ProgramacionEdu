package ejercicios.bloque3;

import java.util.Scanner;

public class Ej3_30_SumaNNumeros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Hasta que número tengo que sumar? ");
		int numero = sc.nextInt();

		//Variable acumuladora
		int suma=0;
		
		//Con while
		int i=1;
		while (i<=numero){
			//Primero sumo 1, luego 2, después 3, etc...
			suma=suma+i;
			i++;
		}
		System.out.printf("%n%nLa suma de los %d primeros números es %d, "
				+ "hecho con while", numero, suma);
		
		//Con do .. while
		int j=1;
		//Reiniciamos la variable acumuladora
		suma=0;
		do {
			suma=suma+j;
			j++;
		}while(j<=numero);
		
		System.out.printf("%n%nLa suma de los %d primeros números es %d, "
				+ "hecho con do..while", numero, suma);
		
		//Con for
		
		//Reiniciamos la variable acumuladora
		suma=0;
		for(int k=1; k<=numero;k++) {
			suma=suma+k;
		}
		
		System.out.printf("%n%nLa suma de los %d primeros números es %d, "
				+ "hecho con for", numero, suma);
	}

}
