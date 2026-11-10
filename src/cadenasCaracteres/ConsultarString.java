package cadenasCaracteres;

public class ConsultarString {
    public static void main(String[] args) {
        
    	// Ejemplo para ver los métodos de consulta
        // length() -> Devuelve el número total de caracteres
        String saludo = "Hola";
        System.out.println("length():");
        // Para mostrar las comillas tenemos que escaparlas con la \
        System.out.println("\"Hola\".length() = " + saludo.length());
        
        // charAt(i) -> Devuelve el carácter en la posición i (empieza en 0)
        System.out.println("\ncharAt(i):");
        System.out.println("\"Hola\".charAt(1) = " + saludo.charAt(1));
        
        // isEmpty() -> true si la longitud es exactamente 0
        String vacia = "";
        String soloEspacios = "   ";
        System.out.println("\nisEmpty():");
        System.out.println("\"\".isEmpty() = " + vacia.isEmpty());                   
        System.out.println("\"   \".isEmpty() = " + soloEspacios.isEmpty());        

        // isBlank() -> true si está vacía o solo contiene espacios en blanco
        System.out.println("\nisBlank():");
        System.out.println("\"   \".isBlank() = " + soloEspacios.isBlank());

        // indexOf(s) -> Posición de la primera aparición (o -1 si no está)
        System.out.println("\nindexOf(s):");
        System.out.println("\"Hola\".indexOf(\"la\") = " + saludo.indexOf("la"));
        System.out.println("\"Hola\".indexOf(\"xyz\") = " + saludo.indexOf("xyz"));

        // indexOf(s, desde) -> Busca a partir de un índice específico
        String fruta = "banana";
        // En "banana": índices -> b(0) a(1) n(2) a(3) n(4) a(5)
        System.out.println("\nindexOf(s, desde):");
        System.out.println("\"banana\".indexOf(\"a\", 2) = " + fruta.indexOf("a", 2));

        // lastIndexOf(s) -> Posición de la última aparición (o -1 si no está)
        System.out.println("\nlastIndexOf(s):");
        System.out.println("\"banana\".lastIndexOf(\"a\") = " + fruta.lastIndexOf("a"));

        // contains(s) -> true si contiene el texto indicado
        String frase = "Hola mundo";
        System.out.println("\ncontains(s):");
        System.out.println("\"Hola mundo\".contains(\"mun\") = " + frase.contains("mun")); 

        // startsWith(s) y endsWith(s) -> true si empieza o termina por ese texto
        String archivo = "foto.jpg";
        System.out.println("\nstartsWith(s) / endsWith(s):");
        System.out.println("\"foto.jpg\".startsWith(\"foto\") = " + archivo.startsWith("foto")); 
        System.out.println("\"foto.jpg\".endsWith(\".jpg\") = " + archivo.endsWith(".jpg"));
    }
}