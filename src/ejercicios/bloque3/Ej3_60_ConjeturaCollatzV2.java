package ejercicios.bloque3;

import java.util.Scanner;

public class Ej3_60_ConjeturaCollatzV2 {
	public static void main(String[] args) {
		
		int numConPasos=1;
		int	mayorNumPasos=0;
		
		for (int i=2; i<=1000;i++) {
			
			//Contador de pasos
			int numPasos=0;
			//En cada pasada del bucle, guardo el número, para no modificar la i
			int numero=i;
			while (numero!=1) {
				if(numero%2==0) {
					//es par
					numero=numero/2;
					
				}else {
					//es impar
					numero=numero*3+1;				
				}
				//Esta línea se ejecuta siempre, vaya por el if o por el else
				numPasos++;
			}
			//Comprobar si es el que más pasos da
			//Vamos si este número tiene el record de pasos
			if(numPasos>mayorNumPasos){
				System.out.println("Nuevo record!! el número " + i + " es el nuevo ganador"
						+ "con un total de " + numPasos + " pasos");
				//Actualizamos el record
				numConPasos=i;
				mayorNumPasos=numPasos;
			}
			//System.out.printf("%nEl %d ha llegado a %d en %d pasos %n", i, numero, numPasos);		
		}
		System.out.printf("El número %d es el que necesita más pasos, "
				+ "concretamente %d", numConPasos, mayorNumPasos);

	}

}
