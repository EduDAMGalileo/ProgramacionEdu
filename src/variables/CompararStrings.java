package variables;

public class CompararStrings {
    public static void main(String[] args) {
        // Ambas variables tienen el mismo texto dentro ("Hola")
        String palabra1 = "Hola";
        // Al usar 'new', forzamos a Java a crear un objeto nuevo. Ya veremos qué es eso de los objetos
        String palabra2 = new String("Hola"); 

        System.out.println("palabra1: " + palabra1);
        System.out.println("palabra2: " + palabra2);
        System.out.println("----------------------------------");

        //COMPARACIÓN CON == (Compara si están en el mismo sitio de la memoria)
        if (palabra1 == palabra2) {
            System.out.println("Con == : Son iguales");
        } else {
            System.out.println("Con == : ¡Son DISTINTOS! (Sorpresa para principiantes)");
        }

        //COMPARACIÓN CON .equals() (Compara las letras que contienen)
        if (palabra1.equals(palabra2)) {
            System.out.println("Con .equals() : Son IGUALES (Forma correcta)");
        } else {
            System.out.println("Con .equals() : Son distintos");
        }
    }
}
