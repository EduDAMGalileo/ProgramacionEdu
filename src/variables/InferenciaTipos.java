package variables;

import java.util.ArrayList; // Para el ejemplo con listas

public class InferenciaTipos {
    public static void main(String[] args) {

        // Forma tradicional:
        int edadTradicional = 25;
        String nombreTradicional = "Ana";

        // Con inferencia de tipos (Java deduce el tipo por el valor a la derecha):
        var edad = 25;          // Java sabe que es un 'int'
        var nombre = "Ana";     // Java sabe que es un 'String'
        var altura = 1.78;      // Java sabe que es un 'double' (decimal)
        var esEstudiante = true;// Java sabe que es un 'boolean'
        var inicial = 'A';      // Java sabe que es un 'char'

        // Podemos usar printf:
        System.out.printf("Hola %s, tienes %d anos y mides %.2f metros.%n%n", 
                          nombre, edad, altura);


        // =============================================
        // OJO: JAVA SIGUE SIENDO ESTRICTO CON LOS TIPOS
        // =============================================
        var puntuacion = 100; // Nace siendo de tipo 'int'

        puntuacion = 200; // CORRECTO: Sigue siendo un número entero.

        // La siguiente línea daría un ERROR DE COMPILACIÓN si quitas el comentario //:
        // puntuacion = "cien"; 
        // Error: incompatible types: String cannot be converted to int.


        // ==========================================
        // ¿CÓMO SABER QUÉ TIPO ELIGIÓ JAVA?
        // ==========================================
        // Truco: podemos preguntarle a Java qué clase le asignó:
        var ciudad = "Madrid";
        var precio = 9.99;

        // Imprimirá: String
        System.out.printf("El tipo de 'ciudad' es: %s%n", ciudad.getClass().getSimpleName());

        // Para tipos primitivos como double, al envolverlos Java los trata como Double:
        System.out.printf("El tipo de 'precio' es: %s%n%n", ((Object) precio).getClass().getSimpleName());


        // ==========================================
        // 4. ¿DÓNDE ES REALMENTE ÚTIL 'var'?
        // ==========================================
        // Es muy cómodo cuando los nombres de las clases son larguísimos
        // y nos evita repetir la misma palabra dos veces.

        // Sin var (muy repetitivo):
        ArrayList<String> listaNombres1 = new ArrayList<String>();

        // Con var (mucho más limpio y legible):
        var listaNombres2 = new ArrayList<String>();
        listaNombres2.add("Carlos");
        listaNombres2.add("Elena");

        System.out.printf("La lista tiene %d elementos: %s%n%n", 
                          listaNombres2.size(), listaNombres2);


        // ==========================================
        // 5. LO QUE NUNCA DEBES HACER (ERRORES COMUNES)
        // ==========================================

        // ERROR 1: No asignarle un valor de inmediato.
        // var x; 
        // -> ¡Mal! Java necesita el valor para saber el tipo.

        // ERROR 2: Inicializar con null directamente.
        // var vacio = null; 
        // -> ¡Mal! Java no sabe null de qué cosa (¿un String nulo? ¿un Scanner nulo?).
    }
}
