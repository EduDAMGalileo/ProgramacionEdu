package ejercicios.bloque2;

public class Ej2_70_EliminandoComparaciones {
	//Aparentemente el ejercicio ya está resuelto
	public static void main(String[] args) 
	{
		int temp=40;
		
		if (temp < 0) System.out.println("Helada"); 
		else if (temp >= 0 && temp < 15) 
		{
			System.out.println("Frío"); 
		}
		else if (temp >= 15 && temp < 25) 
		{
			System.out.println("Agradable"); 
		}
		else if (temp >= 25) 
		{
			System.out.println("Calor"); 
		}
	}

}
