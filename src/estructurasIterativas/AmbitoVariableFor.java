package estructurasIterativas;

public class AmbitoVariableFor {

	public static void main(String[] args) {

		System.out.println("=== CASO 1: Variable 'i' declarada EN el for ===");
		// 'i' nace aquí en la cabecera
		for (int i = 0; i < 5; i++) {
			System.out.println("Dentro del bucle: i = " + i);
		}
		// 'i' muere aquí al cerrarse la llave }

		// Si descomentas la siguiente línea, Java NO compilará:
		// System.out.println(i);
		
		System.out.println("Fuera del bucle: 'i' ya no existe en memoria.");


		System.out.println("\n=== CASO 2: Variable 'j' declarada FUERA del for ===");
		// 'j' nace en el ámbito del método main
		int j;

		//No podemos int delante de la j, ya está declarada
		for (j = 0; j < 5; j++) {
			System.out.println("Dentro del bucle: j = " + j);
		}

		// 'j' sigue viva porque su bloque padre (main) aún no ha terminado.
		// OJO: vale 5 porque es el valor que hizo falsa la condición (5 < 5 -> false)
		System.out.println("Fuera del bucle: Terminó con j = " + j);
	}
}
