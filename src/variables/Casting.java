package variables;

public class Casting {
	public static void main (String[] args) {
		int entero = 556;
		
		//Podemos inicializar una variable con otra
		//Aquí el cambio es automático (Widening)
		long grande = entero;
		
		//Esto no se puede hacer, si descomentamos la línea de abajo falla
		//No puedo meter una caja grande en una caja pequeña (Narrowing)
		//byte pequeña = entero;
		
		//Podemos hacer un cast, java me deja hacerlo, por mi cuenta y riesgo
		int enteroQueCabe=125;
		int enteroQueNoCabe=5000;
		byte pequeña = (byte) enteroQueCabe;
		byte pequeña2 = (byte) enteroQueNoCabe;
		
		System.out.println("Vamos a analizar la problemática \n" + 
		"-Entero que cabe " + pequeña + "\n" +
		"-Entero que no cabe" + pequeña2);
		
		//Supongamos ahora que tenemos un número en un String
		String edad = "42";
		//Edad lo toma como texto, y al ponerle + 1 ese 1 lo pasa a texto
		System.out.println("El año que viene tendré " + edad + 1 + " años");
		System.out.println("El año que viene tendré " + (Integer.parseInt(edad) + 1) + " años");
		
		int numero = 40;
		numero=numero+10;
		System.out.println("Número sumado: " + numero);
		System.out.println("Número sumado: " + (numero + 10));
	}
}
