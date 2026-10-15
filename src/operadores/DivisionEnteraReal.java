package operadores;

public class DivisionEnteraReal {
    public static void main(String[] args) {

        int a = 7;
        int b = 2;

        System.out.println("Dividiendo " + a + " entre " + b + ":");
        System.out.println("----------------------------------------------");

        // DIVISIÓN ENTERA: ambos son int -> Java descarta los decimales
        int resultadoEntero = a / b;
        System.out.println("1. int / int: " + resultadoEntero); 
        // Imprime 3 (pierde el .5)

        // LA TRAMPA:
        // Guardar la división entera en una variable double NO la arregla
        double trampa = a / b; 
        System.out.println("2. double trampa = a / b: " + trampa); 
        // Imprime 3.0 (primero calcula 7/2 = 3 y luego lo convierte a double)

        System.out.println("----------------------------------------------");
        System.out.println("SOLUCIONES (al menos uno debe ser double):");

        // Con 'casting' (conversión explícita):
        double solucion1 = (double) a / b;
        System.out.println("3. (double) a / b: " + solucion1); 

        double solucion2 = a / (double) b;
        System.out.println("4. a / (double) b: " + solucion2); 

        // Con números directos (literales decimales):
        double solucion3 = 7.0 / 2;
        System.out.println("5. 7.0 / 2: " + solucion3);        
        
        double solucion4 = 7 / 2.0;
        System.out.println("6. 7 / 2.0: " + solucion4);      
    }
}