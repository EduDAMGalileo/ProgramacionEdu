package metodos;

public class AmbitoVariablesMetodos {

    public static void metodoA() {
    	// Declaramos e inicializamos 'x' es una variable LOCAL de metodoA
        int x = 10; 
        //  Como hasta ahora, la podemos llamar desde el propio me´todo
        System.out.println("Dentro de metodoA, x vale: " + x); 
    }

    public static void metodoB() {
        // Si intentamos usar 'x' aquí, Java se queja porque no la conoce.
        // System.out.println(x);      
        
        System.out.println("Dentro de metodoB: la variable x de metodoA es invisible aquí.");
    }

    public static void main(String[] args) {
        System.out.println("--- Ejecutando metodoA ---");
        metodoA();

        System.out.println("\n--- Ejecutando metodoB ---");
        metodoB();

        // Tampoco podríamos usar 'x' aquí en el main:
        // System.out.println(x); // Error: x solo vive dentro de metodoA
    }
}