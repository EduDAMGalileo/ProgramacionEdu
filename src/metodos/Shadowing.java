package metodos;

public class Shadowing {
    
    // Variable de clase (estática), ya veremos esto con más detalle
	// Es visible para todos los métodos de la clase,
    // a menos que un método decida crear su propia variable con el mismo nombre.
    public static int total = 0;              

    public static void sumar(int total) {     
        // ¡Cuidado aquí! El parámetro 'total' (que vale 10) 
        // OCULTA a la variable de clase 'total' (que vale 0).
        
    	// Modifica SOLO el PARÁMETRO (pasa de 10 a 15), fijate en los colores de eclipse
        total = total + 5;             
        
        System.out.println("Dentro del método sumar, total vale: " + total);
    }

    public static void main(String[] args) {
        System.out.println("Valor de la variable de clase antes de llamar: " + total); 
        
        sumar(10);
        
        // Sigue imprimiendo 0 porque el método modificó su parámetro local, 
        // ¡jamás tocó la variable de clase de arriba!
        System.out.println("Valor de la variable de clase después de llamar: " + total);
    }
}