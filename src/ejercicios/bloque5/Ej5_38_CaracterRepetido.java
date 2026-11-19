package ejercicios.bloque5;

public class Ej5_38_CaracterRepetido {
	public static void main(String[] args) {
		String palabra="programa";

		//Bucle que recorre las letras de la palabra
		for (int i=0; i<palabra.length();i++) {
			//El bucle de dentro compara la letra con todas las siguientes
			//Por eso sumamos el 1
			for(int j=i+1;j<palabra.length();j++) {
				if (palabra.charAt(i)==palabra.charAt(j)) {
					System.out.println("Hay una letra repetida, la " + palabra.charAt(j));
					System.out.println("Está en la posición " + (j+1));
					//Si ponemos return en el main el programa termina
					return;
				}			
			}
		}
		System.out.println("No hay letras repetidas");

	}

}
