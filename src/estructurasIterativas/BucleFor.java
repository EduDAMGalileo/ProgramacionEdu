package estructurasIterativas;

public class BucleFor {
	public static void main(String[] args) {
		//Escribir de 1 a 10 con for
		
		//El bucle for tiene 3 partes
		//La de la izquierda (asignación) se ejecuta solo una vez y al llegar al for
		//La parte del medio (condición), se ejecuta una vez en cada pasada del bucle
		//La parte del final (incremento), se ejecuta al finalizar cada pasada del bucle
		

		for(int i=1; i<=10;i++) {
			System.out.print(i + " ");
		}
		
		//La variable i es local al bucle, no existe fuera
		//System.out.println(i + " ");
		System.out.println("\n");
		//Podemos contar al revés
		for(int i=10; i>0;i--) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n");
		//No hace falta que vayamos de uno en uno
		for(int i=10; i>0;i-=2) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n");
		//Por ejemplo, los números pares hasta 50
		for(int i=2; i<=50;i+=2) {
			System.out.print(i + " ");
		}
	}

}
