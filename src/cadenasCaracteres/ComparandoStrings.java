package cadenasCaracteres;

public class ComparandoStrings {
	public static void main(String[] args) {
		String nombre = new String("Eduardo");
		String nombre2 = new String("Eduardo");
		
		if (nombre==nombre2) {
			System.out.println("Te llamas Eduardo");
		}else {
			System.out.println("No te llamas Eduardo");
		}
		
		if (nombre.equals(nombre2)) {
			System.out.println("Te llamas Eduardo");
		}else {
			System.out.println("No te llamas Eduardo");
		}
		
		String nombre3=nombre;
		
		if (nombre==nombre3) {
			System.out.println("Te llamas Eduardo");
		}else {
			System.out.println("No te llamas Eduardo");
		}
		
		nombre3="Carlos";
		System.out.println(nombre + " " +  nombre2 + " " + nombre3);
		
		nombre3="Eduardo";
		
		if (nombre==nombre3) {
			System.out.println("Te llamas Eduardo");
		}else {
			System.out.println("No te llamas Eduardo");
		}
		
		String nombre4="Paco";
		if(nombre4=="Paco") {
			System.out.println("Son Iguales");
		}else {
			System.out.println("No son Iguales");
		}
		
		nombre4="Edu";
		nombre4="Eduardo";
		
	}

}
