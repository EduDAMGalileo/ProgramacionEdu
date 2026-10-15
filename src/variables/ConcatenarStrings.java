package variables;

public class ConcatenarStrings {
    public static void main(String[] args) {

        // ==========================================
        // CONCATENACIÓN BÁSICA (Unir textos)
        // ==========================================
        String nombre = "Eduardo";
        String apellido = "Niévares";

        // Unimos las dos variables usando el signo '+' y añadiendo un espacio en medio
        String nombreCompleto = nombre + " " + apellido;

        System.out.println("1. Nombre completo: " + nombreCompleto);
        System.out.println("----------------------------------------------");

        // ==========================================
        // EL GRAN PELIGRO: Mezclar texto y números
        // Java lee de IZQUIERDA A DERECHA. 
        // ==========================================
        int a = 5;
        int b = 10;

        // Caso A: Si empieza sumando números, los suma matemáticamente primero
        System.out.println("2A. Suma normal (5 + 10): " + (a + b)); 
        // Resultado: 15 (porque los paréntesis obligan a sumar antes)

        // Caso B: Si pones el texto primero, Java convierte TODO lo demás en texto (lo pega)
        System.out.println("2B. Cuidado con el orden: " + a + b); 
        // Resultado: "510" (¡Sorpresa! No da 15, pega el 5 y el 10 como si fueran letras)

        System.out.println("----------------------------------------------");

        // ==========================================
        // CONCATENAR ASIGNANDO (El atajo +=)
        // ==========================================
        String frase = "Me gusta ";
        // Forma larga
        frase = frase + "Java "; 
        // Forma abreviada (equivale a: frase = frase + "muchísimo.")
        // Esto se vuelve a ver en los operadores
        frase += "muchísimo.";   

        System.out.println("3. Frase acumulada: " + frase);
    }
}
