package cadenasCaracteres;

public class CompararStrings {
    public static void main(String[] args) {

        // Literales idénticos:
        // Java optimiza la memoria usando el "String Pool" (reserva un solo objeto "hola").
        // Tanto 'a' como 'b' apuntan exactamente a la misma dirección de memoria.
        String a = "hola";
        String b = "hola";

        System.out.println("--- Literales idénticos (String Pool) ---");
        System.out.println("a == b: " + (a == b));
        System.out.println("a.equals(b): " + a.equals(b));

        // Objeto creado explícitamente con 'new':
        // 'new' fuerza la creación de un objeto nuevo e independiente en memoria.
        // Aunque el contenido visual sea "hola", las direcciones de memoria son distintas.
        String c = new String("hola");

        System.out.println("\n--- Objeto creado con 'new' ---");
        System.out.println("a == c: " + (a == c));
        System.out.println("a.equals(c): " + a.equals(c));

        // El caso trampa más habitual: texto generado dinámicamente.
        // Ocurre al leer datos por teclado, unir variables, leer de ficheros o usar métodos.
        // Al construirse en tiempo de ejecución, Java crea un objeto nuevo en memoria.
        // Es decir, en el 99% de los casos
        String inicio = "ho";
        String dinamico = inicio + "la";

        System.out.println("\n--- Texto generado en tiempo de ejecución ---");
        System.out.println("Texto a: " + a);
        System.out.println("Texto dinamico: " + dinamico);
        System.out.println("a == dinamico: " + (a == dinamico));
        System.out.println("a.equals(dinamico): " + a.equals(dinamico));

        // Comparación ignorando mayúsculas y minúsculas:
        String mayusculas = "HOLA";

        System.out.println("\n--- Diferencias entre mayúsculas y minúsculas ---");
        System.out.println("a.equals(mayusculas): " + a.equals(mayusculas));
        System.out.println("a.equalsIgnoreCase(mayusculas): " + a.equalsIgnoreCase(mayusculas));
    }
}