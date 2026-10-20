package ejercicios.bloque2;

public class Ej2_67_MejorarCodigo {
	public static void main(String[] args) {

		//a
		boolean esSocio=false;

		if (esSocio) {
			System.out.println("Bienvenido");
		} 

		//b
		boolean aprobado=false;
		int nota=6;
		if (nota >= 5) {
			aprobado = true;
		} 

		//c
		int a=5;
		int b=6;
		if ((a == b)) {
			System.out.println("Iguales");

		}

		//d
		int x=3;
		int y=5;

		if (x > 0 && y > 0) { 
			System.out.println("Primer cuadrante");
		} 


		//e
		int n=9;
		
		if (n > 10) {
			System.out.println("Grande"); 
		}
		else { 
			System.out.println("Pequeño");
		}

	}
}

