package ejercicios.bloque2;

import java.util.Random;
import java.util.Scanner;

//REGLAS
//El papel gana a la piedra
//La piedra gana a la tijera
//La tijera gana al papel
public class Ej2_60_PiedraPapelTijera {
	
	public static final int PIEDRA=1;
	public static final int PAPEL=2;
	public static final int TIJERA=3;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Elige: ");
		System.out.println("1-Piedra");
		System.out.println("2-Papel");
		System.out.println("3-Tijeras");
		
		int usuario=sc.nextInt();
		if (usuario==PIEDRA) {
			System.out.println("Has elegido Piedra");	
		} else if (usuario==PAPEL) {
			System.out.println("Has elegido Papel");	
		} else if (usuario==TIJERA) {
			System.out.println ("Has elegido Tijeras");	
		} else {
			System.out.println("Elección no valida");
		}
		
		//Genera un número entre 0 y 2
		int ordenador = rand.nextInt(3);
		//Sumando uno, genera entre 1 y 3
		ordenador++;

		
		//Aquí realmente estamos repitiendo código, pero de momento no sabemos como no repetir en este caso
		if (ordenador==PIEDRA) {
			System.out.println("El ordenador ha elegido Piedra");	
		} else if (ordenador==PAPEL) {
			System.out.println("El ordenador ha elegido Papel");	
		} else if (ordenador==TIJERA) {
			System.out.println ("El ordenador ha elegido Tijeras");	
		} else {
			System.out.println("Elección no valida");
		}	

		//Ahora dilucidamos el resultado
		if (((usuario==PIEDRA) && (ordenador==TIJERA)) || ((usuario==TIJERA) && (ordenador==PAPEL))
				|| ((usuario==PAPEL) && (ordenador==PIEDRA))){
			System.out.println("Has ganado!!");
		}else if (((usuario==PAPEL) && (ordenador==TIJERA)) || ((usuario==PIEDRA) && (ordenador==PAPEL))
				|| ((usuario==TIJERA) && (ordenador==PIEDRA)))
			System.out.println("Has perdido!!");
		else {
			System.out.println("Empate!!");
		}
		
		
		sc.close();
	}

}

