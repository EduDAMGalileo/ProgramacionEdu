package ejercicios.bloque5;

import java.util.Random;

public class CaracolesConString {
	// AVISO, estamos repitiendo mucho código, es mejor con arrays
	public static String avanza(String caracol) {
		Random r = new Random();
		//Avanza entre 0 y 3 casillas
		caracol=caracol+".".repeat(r.nextInt(4));
		return caracol;
	}
	
	public static boolean ganador(String caracol) {
		if (caracol.length()>=50){
			return true;
		}
		return false;
	}
	
	public static void dibujar(String caracol) {
		System.out.println(".".repeat(caracol.length()) + "@");
	}
	
	public static void main(String[] args) {
		String caracolA = "";
		String caracolB = "";
		String caracolC = "";
		
		//Los caracoles van avanzando, hasta que uno de ellos llega a 50
		int ronda=1;
		while (!(ganador(caracolA) || ganador(caracolB) || ganador(caracolC))) {
			
			//Avanzamos
			caracolA=avanza(caracolA);
			caracolB=avanza(caracolB);
			caracolC=avanza(caracolC);
			//Mostramos resultados provisionales
			
			System.out.println("Ronda número " + ronda);
			System.out.println("-----------------");
			dibujar(caracolA);
			dibujar(caracolB);
			dibujar(caracolC);
			System.out.println("\n\n");

			//Inrementamos el marcador de ronda
			ronda++;
		}
		//Cuando terminamos vemos quien gana
		//Basta con hacer más de 50 puntos para ganar
		if(caracolA.length()>=50){
			System.out.println("El caracol A gana");
		}
		if(caracolB.length()>=50){
			System.out.println("El caracol B gana");
		}
		if(caracolC.length()>=50){
			System.out.println("El caracol C gana");
		}
	}
}

