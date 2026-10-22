package estructurasIterativas;

public class TresBucles {
	public static void main(String[] args) {
		
		int i=1;
		while(i<=10) {
			System.out.print(i + " ");
			i++;  //i=i+1;
		}
		
		//Escribir los números del 1 al 10 con do while
		i=1;
		do {
			System.out.print(i + " ");
			i++;
		} while (i<=10);
		
		//Contando hasta 10 con for
		for(int j=1; j<=10; j++) {
			System.out.print(j + " ");
		}

	}

}
