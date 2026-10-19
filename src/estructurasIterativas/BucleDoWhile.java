package estructurasIterativas;

public class BucleDoWhile {

	public static void main(String[] args) {
		// Repetir de PSeInt
		
		//Escribir los números del 1 al 10 con do while
		int i=1;
		do {
			System.out.print(i + " ");
			i++;
		} while (i<=10);

		System.out.println();
		
		//Si empezamos en cero la condición final cambia
		int j=0;
		do {
			j++;
			System.out.print(j + " ");
			
		} while (j<10);
	}

}
