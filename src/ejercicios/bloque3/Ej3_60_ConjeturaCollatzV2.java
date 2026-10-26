package ejercicios.bloque3;

import java.util.Scanner;

public class Ej3_60_ConjeturaCollatzV2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dame un número: ");
		int numero = sc.nextInt();
		
		while (numero!=1) {
			if(numero%2==0) {
				//es par
				System.out.println(numero + " es par --> " + numero + "/2 = " + numero/2 );
				numero=numero/2;
				
			}else {
				//es impar
				System.out.println(numero + " es impar --> " + numero + "*3+1=" + (numero*3+1));
				numero=numero*3+1;
			}
		}

	}

}
