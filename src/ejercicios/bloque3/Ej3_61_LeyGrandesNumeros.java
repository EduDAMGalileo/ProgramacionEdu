package ejercicios.bloque3;

import java.util.Random;

public class Ej3_61_LeyGrandesNumeros {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int numLanzamientos=1000000;
		int numSietes=0;
		//Generamos números entre 0 y 5 y le sumamos 1
		for (int i=1; i<=numLanzamientos; i++) {
			int dado1 = aleatorio.nextInt(6)+1;
			int dado2 = aleatorio.nextInt(6)+1;
			int suma = dado1 + dado2;
			if (suma==7) {
				numSietes++;
				//System.out.printf("%nLanzo dos dados, sale %d y %d, y justos suman %d", dado1, dado2, suma);
			}
		}
		System.out.println("Han salido " + numSietes + " sietes");
		System.out.printf("Eso significa que ha salido un %.2f%% de las veces",(double)numSietes/numLanzamientos*100);
	}
}
