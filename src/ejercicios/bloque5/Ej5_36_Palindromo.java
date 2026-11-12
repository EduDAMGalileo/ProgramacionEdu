package ejercicios.bloque5;

public class Ej5_36_Palindromo {
	
	public static boolean esPalindromo(String cadena) {
		for (int i=0;i<cadena.length()/2;i++) {
			//Vamos comparando pares de caracteres
			System.out.println("Estoy comparando " + cadena.charAt(i) 
			+ " con " + cadena.charAt(cadena.length()-(1+i)));
			if (cadena.charAt(i)!=cadena.charAt(cadena.length()-(1+i))) {
				//Si entro aquí, no es palindromo
				return false;
			}
		}
		//Si llegamos aquí, significa que es un palíndromo
		return false;
	}
	
	public static void main(String[] args) {
		String palindromo="Anita lava la tina";
		//Lo paso a minúsculas y le quito los espacios
		String palindromoSaneado=palindromo.toLowerCase().replaceAll(" ", "");
		
		//Aquí es cuando sabemos si es o no es palíndromo
		if(esPalindromo(palindromoSaneado)) {
			System.out.println("Es palindromo");
		} else {
			System.out.println("No es palindromo");
		}
	}

}
