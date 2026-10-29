package cadenasCaracteres;

import java.util.Scanner;

public class EjemploString {
	public static void main(String[] args) {
		//El entero es un tipo básico, no sabe hacer casi nada
		//Si pulso el punto, Eclipse no me sugiere nada
		int numero=5;
		//numero.
		
		//El escaner es un objeto, no un tipo básico
		//Los objetos se inicializan con el operador new
		Scanner sc = new Scanner(System.in);
		//El escaner sabe hacer cosas
		//Por ejemplo nextInt, asigna el siguiente entero de teclado
		numero= sc.nextInt();
		
		//El String no es un tipo básico, el String sabe hacer cosas
		//Es un poco especial, podemos inicializar Strings sin poner new
		String nombre = "Eduardo";
		System.out.println("Me llamo " + nombre + ", "
				+ "eso son "+  nombre.length() + " letras");
		
		for(int i=0;i<nombre.length();i++) {
			char caracter=nombre.charAt(i);
			System.out.println(caracter);
		}
		
	}

}
