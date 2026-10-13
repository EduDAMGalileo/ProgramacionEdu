package operadores;

//OJO, ver después de ver estructuras condicionales, sino no se va a entender
public class OperadorTernario {
    public static void main(String[] args) {

        // =======================================================
        // EJEMPLO 1: MAYOR O MENOR DE EDAD (La comparativa directa)
        // =======================================================
        System.out.println("=== EJEMPLO 1: COMPARATIVA CON IF-ELSE ===");

        int edad = 20;

        // --- FORMA A: Con 'if-else' tradicional (Ocupa 8 líneas) ---
        String estadoIf;
        if (edad >= 18) {
            estadoIf = "Mayor de edad";
        } else {
            estadoIf = "Menor de edad";
        }
        System.out.printf("Con if-else: %s%n", estadoIf);


        // --- FORMA B: Con operador ternario (Solo 1 línea) ---
        // (¿edad >= 18?) ? si_es_true : si_es_false;
        String estadoTernario = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
        System.out.printf("Con ternario: %s%n%n", estadoTernario);



        // =======================================================
        // EJEMPLO 2: CON NÚMEROS (Calcular el mayor de dos valores)
        // =======================================================
        System.out.println("=== EJEMPLO 2: OBTENER UN NÚMERO ===");

        int num1 = 15;
        int num2 = 40;

        // ¿Es num1 mayor que num2?
        // Si es sí -> quédate con num1
        // Si es no -> quédate con num2
        int mayor = (num1 > num2) ? num1 : num2;

        System.out.printf("Entre %d y %d, el mayor es: %d%n%n", num1, num2, mayor);



        // =======================================================
        // EJEMPLO 3: APLICAR UN DESCUENTO SEGÚN UN BOOLEANO
        // =======================================================
        System.out.println("=== EJEMPLO 3: APLICAR UN DESCUENTO ===");

        boolean esSocio = true;
        double precioBase = 100.0;

        // Si es socio tiene 20% de descuento (paga el 80%), si no, paga el 100%
        double totalAPagar = esSocio ? (precioBase * 0.80) : precioBase;

        System.out.printf("Precio final a cobrar: %.2f euros%n%n", totalAPagar);



        // =======================================================
        // EJEMPLO 4: DIRECTO DENTRO DE UN PRINTF (Muy cómodo)
        // =======================================================
        System.out.println("=== EJEMPLO 4: DIRECTO DENTRO DEL PRINTF ===");

        int intentos = 1;

        // Un truco genial para poner el texto en singular o plural automáticamente:
        // Si intentos == 1 muestra "intento", si no muestra "intentos"
        System.out.printf("Te queda %d %s restante.%n", intentos, (intentos == 1) ? "intento" : "intentos");

        int intentosVarios = 3;
        System.out.printf("Te quedan %d %s restantes.%n%n", intentosVarios, (intentosVarios == 1) ? "intento" : "intentos");



        // =======================================================
        // EJEMPLO 5: TERNARIO ANIDADO (Más de 2 opciones)
        // =======================================================
        System.out.println("=== EJEMPLO 5: TERNARIO ANIDADO (Equivalente a if - else if - else) ===");

        int nota = 7;

        // Si es >= 9 -> "Sobresaliente"
        // Si no, comprobamos si es >= 5 -> "Aprobado"
        // Si no -> "Suspenso"
        String resultadoNota = (nota >= 9) ? "Sobresaliente" 
        					 : (nota >= 7) ? "Notable" 
                             : (nota >= 5) ? "Aprobado" 
                             : "Suspenso";

        System.out.printf("Con nota %d el resultado es: %s%n", nota, resultadoNota);
    }
}