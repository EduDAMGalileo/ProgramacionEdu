package cadenasCaracteres;

public class TransformarString {
    public static void main(String[] args) {
        
        // Demostración de inmutabilidad:
        // La cadena original nunca cambia; si no guardamos el retorno, se pierde.
        String saludo = "Hola";
        saludo.toUpperCase(); 
        System.out.println("Original sin asignar (no cambia): " + saludo);

        // toUpperCase() y toLowerCase(): Guardamos el resultado en una nueva variable
        String enMayusculas = saludo.toUpperCase();
        String enMinusculas = saludo.toLowerCase();
        System.out.println("toUpperCase(): " + enMayusculas);
        System.out.println("toLowerCase(): " + enMinusculas);

        // strip(): Quita espacios al principio y al final
        String conEspacios = "   hola   ";
        String sinEspaciosStrip = conEspacios.strip();
        System.out.println("strip(): \"" + sinEspaciosStrip + "\"");

        // trim(): El método tradicional para quitar espacios iniciales y finales
        String sinEspaciosTrim = conEspacios.trim();
        System.out.println("trim(): \"" + sinEspaciosTrim + "\"");

        // replace(a, b): Devuelve una copia cambiando cada coincidencia
        String nota = "7.5";
        String notaEspañola = nota.replace(".", ",");
        System.out.println("replace(\".\", \",\"): " + notaEspañola);

        // repeat(n): Repite la cadena las veces indicadas
        String guiones = "-".repeat(5);
        System.out.println("repeat(5): " + guiones);
        
        String eco = "Ja".repeat(3);
        System.out.println("repeat(3): " + eco); //
    }
}
