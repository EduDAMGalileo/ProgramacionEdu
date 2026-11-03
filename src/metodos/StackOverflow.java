package metodos;

public class StackOverflow {

    // Un método que se llama a sí mismo infinitamente
    public static void bucleInfinito() {
        // Al no haber un 'if' que detenga esto, 
        // se acumulan llamadas en la pila indefinidamente.
    	// A esto se le llama recursividad y en ocasiones tiene sentido
        bucleInfinito(); 
    }

    public static void main(String[] args) {
        System.out.println("El programa va a empezar a desbordar la pila...");
        
        // Disparamos el bucle infinito de llamadas
        bucleInfinito();
        
        // Esta línea nunca llegará a ejecutarse
        System.out.println("Fin del programa");
    }
}