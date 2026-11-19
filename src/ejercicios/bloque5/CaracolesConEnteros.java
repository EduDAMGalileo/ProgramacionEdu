package ejercicios.bloque5;

import java.util.Random;

public class CaracolesConEnteros {
	public static void main(String[] args) {
		int caracolA=0;
		int caracolB=0;
		int caracolC=0;
		
		int ronda=0;
		
		//Los caracoles tienen que avanzar
		while (!(ganador(caracolA) || (ganador(caracolB)) || (ganador(caracolC)))){
			caracolA+=avanzar(caracolA);
			caracolB+=avanzar(caracolB);
			caracolC+=avanzar(caracolC);
			
			//Dibujamos el recorrido
			System.out.println("Ronda " + ronda);
			System.out.println("-----------");
			
			dibujarRecorrido(caracolA);
			dibujarRecorrido(caracolB);
			dibujarRecorrido(caracolC);
			System.out.println("\n\n");
			ronda++;
		}
		

	}
	
	public static void dibujarRecorrido(int caracol) {
		System.out.println(".".repeat(caracol)+ "@");		
	}

	public static boolean ganador(int caracol) {
		if (caracol >=50) {
			return true;
		}
		return false;
	}

	public static int avanzar(int caracolA) {
		Random r = new Random();
		//Avanzan entre 0 y 3 posiciones
		return r.nextInt(4);
	}

}
