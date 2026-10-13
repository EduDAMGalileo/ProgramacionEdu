package variables;

public class TiposDeVariables {
    public static void main(String[] args) {

        // =======================================================
        // TIPOS PRIMITIVOS: NÚMEROS ENTEROS (Sin decimales)
        // =======================================================

        // byte: Ocupa 1 byte. Rango de -128 a 127.
        // Se usa poco, solo para ahorrar mucha memoria en casos muy concretos.
        byte edadHumana = 25;

        // short: Ocupa 2 bytes. Rango de -32.768 a 32.767.
        short añoActual = 2024;

        // int: Ocupa 4 bytes. Rango aprox: de -2.000 millones a 2.000 millones.
        // ES EL MÁS USADO Y EL ESTÁNDAR para números enteros en Java.
        int poblacionCiudad = 1500000;

        // long: Ocupa 8 bytes. Para números descomunales.
        // OJO: Hay que ponerle una 'L' mayúscula al final para que Java sepa que es long.
        long distanciaEstrellas = 9460730472580800L;

        System.out.println("--- 1. NÚMEROS ENTEROS ---");
        System.out.printf("byte: %d%n", edadHumana);
        System.out.printf("short: %d%n", añoActual);
        System.out.printf("int (el estandar): %d%n", poblacionCiudad);
        System.out.printf("long (con L al final): %d%n%n", distanciaEstrellas);


        // =======================================================
        // TIPOS PRIMITIVOS: NÚMEROS DECIMALES
        // =======================================================

        // float: Ocupa 4 bytes. Precisión de unos 6-7 decimales.
        // OJO: Obligatorio poner una 'f' al final, si no Java cree que es double.
        float temperatura = 23.5f;

        // double: Ocupa 8 bytes. Precisión de hasta 15-16 decimales.
        // ES EL MÁS USADO Y EL ESTÁNDAR para decimales en Java.
        double precioCoche = 24999.95;

        System.out.println("--- 2. NÚMEROS DECIMALES ---");
        System.out.printf("float (con f al final): %.1f grados%n", temperatura);
        System.out.printf("double (el estandar): %.2f euros%n%n", precioCoche);


        // =======================================================
        // TIPOS PRIMITIVOS: CARÁCTER Y BOOLEANO
        // =======================================================

        // char: Guarda UN ÚNICO símbolo o letra.
        // Obligatorio usar COMILLAS SIMPLES (' '). Ocupa 2 bytes.
        char nota = 'A';
        char simbolo = '@';

        // boolean: Solo puede tener dos estados: true (verdadero) o false (falso).
        // Se usa continuamente en condiciones (if, bucles).
        boolean tienePermiso = true;
        boolean juegoTerminado = false;

        System.out.println("--- 3. CARACTERES Y BOOLEANOS ---");
        System.out.printf("char (una sola letra): %c y simbolo %c%n", nota, simbolo);
        System.out.printf("boolean: ¿Tiene permiso? %b | ¿Fin? %b%n%n", tienePermiso, juegoTerminado);


        // =======================================================
        // TIPOS DE REFERENCIA (El rey: String)
        // =======================================================

        // String: NO es un primitivo, es una Clase/Objeto (por eso empieza con mayúscula).
        // Sirve para almacenar palabras o textos enteros.
        // Obligatorio usar COMILLAS DOBLES (" ").
        String mensajeBienvenida = "Bienvenido al curso de Java";

        System.out.println("--- 4. CADENAS DE TEXTO (String) ---");
        System.out.printf("String: %s%n%n", mensajeBienvenida);


        // =======================================================
        // CONSTANTES (Variables que NO pueden cambiar)
        // =======================================================

        // Se usa la palabra 'final' delante del tipo.
        // Por convención entre programadores, su nombre se escribe EN MAYÚSCULAS.
        final double PI = 3.14159;
        final int DIAS_DE_LA_SEMANA = 7;

        // Si intentaras hacer: PI = 3.20; -> DARÍA ERROR, no te dejaría compilar.

        System.out.println("--- 5. CONSTANTES (con final) ---");
        System.out.printf("Constante PI: %.5f | Dias: %d%n", PI, DIAS_DE_LA_SEMANA);
    }
}
