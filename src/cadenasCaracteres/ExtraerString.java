package cadenasCaracteres;

public class ExtraerString {
    public static void main(String[] args) {
        
        String palabra = "Programar";

        // substring(i): extrae desde el índice i hasta el final
        String desdeIndiceTres = palabra.substring(3);
        System.out.println("substring(3) en 'Programar': " + desdeIndiceTres);

        // substring(i, j): extrae desde i (incluido) hasta j (excluido)
        // La longitud resultante siempre es (j - i) -> 3 - 0 = 3 caracteres
        String trozoInicio = palabra.substring(0, 3);
        System.out.println("substring(0, 3) en 'Programar': " + trozoInicio);
        
        
        //Ahora más de una palabra
        System.out.println("\n--- Extracción dinámica sobre una frase ---");

        String s = "Programación en Java";
        System.out.println("Cadena original: \"" + s + "\" (longitud: " + s.length() + ")");

        // Localizamos dinámicamente las posiciones de los espacios
        int primerEspacio = s.indexOf(" ");
        int ultimoEspacio = s.lastIndexOf(" ");

        // Primera palabra: desde el inicio (0) hasta el primer espacio
        // Al ser el límite final excluido, el espacio no se incluye
        String primeraPalabra = s.substring(0, primerEspacio);
        System.out.println("Primera palabra: " + primeraPalabra);

        // Última palabra: desde justo después del último espacio (+ 1) hasta el final
        String ultimaPalabra = s.substring(ultimoEspacio + 1);
        System.out.println("Última palabra: " + ultimaPalabra);

        // Palabra intermedia: entre el primer espacio (+ 1) y el último espacio
        String palabraIntermedia = s.substring(primerEspacio + 1, ultimoEspacio);
        System.out.println("Palabra intermedia: " + palabraIntermedia);

        System.out.println("\n--- Extracciones por cantidad fija de caracteres ---");

        // Los primeros N caracteres: substring(0, N)
        String primerosCuatro = s.substring(0, 4);
        System.out.println("Primeros 4 caracteres: " + primerosCuatro); 
        
        // Los últimos N caracteres: substring(longitud - N)
        String ultimosCuatro = s.substring(s.length() - 4);
        System.out.println("Últimos 4 caracteres: " + ultimosCuatro);

        // Cadena completa cubriendo desde 0 hasta length()
        String todaLaCadena = s.substring(0, s.length());
        System.out.println("Cadena completa: " + todaLaCadena);
    }
}