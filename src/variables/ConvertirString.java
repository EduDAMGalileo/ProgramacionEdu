package variables;

public class ConvertirString {
    public static void main(String[] args) {

        // ========================================================
        // ¿POR QUÉ ES NECESARIO CONVERTIR?
        // Todo lo que leemos del teclado (Scanner), webs o archivos
        // llega como String (texto).
        // ========================================================
        String texto1 = "10";
        String texto2 = "5";

        // Si no convertimos, el '+' junta los textos (concatena)
        System.out.println("Sin convertir (texto1 + texto2): " + (texto1 + texto2)); 

        System.out.println("----------------------------------------------");

        // ========================================================
        // De String a INT (Entero) -> Integer.parseInt()
        // ========================================================
        int numero1 = Integer.parseInt(texto1);
        int numero2 = Integer.parseInt(texto2);

        System.out.println("1. A int (ahora sí suma): " + (numero1 + numero2));

        // ========================================================
        // De String a DOUBLE (Decimal) -> Double.parseDouble()
        // ========================================================
        String textoPrecio = "19.99"; // Ojo: en Java los decimales en código van con punto (.)
        double precio = Double.parseDouble(textoPrecio);

        System.out.println("2. A double: " + precio);
        System.out.println("   Precio con descuento: " + (precio - 5.00));

        // ========================================================
        //  De String a BOOLEAN (Verdadero/Falso) -> Boolean.parseBoolean()
        // ========================================================
        String textoActivo = "true";
        boolean activo = Boolean.parseBoolean(textoActivo);

        System.out.println("3. A boolean: " + activo);

        // ========================================================
        // De String a CHAR (Carácter único) -> .charAt(0)
        // (Nota: No existe un "parseChar", tomamos la primera letra)
        // ========================================================
        String textoLetra = "M";
        // Posición 0 (la primera letra), esto es raro, ya lo sé
        char inicial = textoLetra.charAt(0); 

        System.out.println("4. A char: " + inicial);
    }
}
