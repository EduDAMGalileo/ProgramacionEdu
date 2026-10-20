package operadores;

public class Operadores {
    public static void main(String[] args) {

        // =======================================================
        // OPERADORES ARITMÉTICOS (+, -, *, /, %)
        // =======================================================
        System.out.println("=== 1. ARITMÉTICOS ===");

        int a = 10;
        int b = 3;

        int suma = a + b;           
        int resta = a - b;          
        int multiplicacion = a * b; 

        // ¡CUIDADO CON LA DIVISIÓN ENTRE ENTEROS!
        // Como 'a' y 'b' son enteros, el resultado descarta los decimales:
        int divisionEntera = a / b; 

        // Si quieres decimales reales, al menos uno debe ser double:
        double divisionReal = (double) a / b;

        // MÓDULO (%): Calcula el RESTO de la división entera.
        // 10 dividido entre 3 es 3, y SOBRA 1.
        int resto = a % b; // Da 1

        System.out.printf("Suma: %d | Resta: %d | Multiplicación: %d%n", suma, resta, multiplicacion);
        System.out.printf("Division entera: %d | División con decimales: %.2f%n", divisionEntera, divisionReal);
        System.out.printf("Resto (módulo): %d%n%n", resto);


        // =======================================================
        // INCREMENTO (++) Y DECREMENTO (--)
        // =======================================================
        System.out.println("=== 2. INCREMENTO Y DECREMENTO ===");

        int vidas = 3;
        vidas++; // Equivale a: vidas = vidas + 1; (ahora es 4)
        System.out.printf("Vidas tras vidas++: %d%n", vidas);

        vidas--; // Equivale a: vidas = vidas - 1; (vuelve a ser 3)
        System.out.printf("Vidas tras vidas--: %d%n", vidas);

        // Diferencia entre prefijo (++x) y sufijo (x++):
        int x = 5;
        // x++ usa el valor actual y LUEGO suma:
        System.out.printf("Usando x++ en impresion: %d (pero en memoria ya vale %d)%n", x++, x);

        int y = 5;
        // ++y suma PRIMERO y luego usa el valor:
        System.out.printf("Usando ++y en impresion: %d%n%n", ++y);


        // =======================================================
        // ASIGNACIÓN COMPUESTA (+=, -=, *=, /=, %=)
        // =======================================================
        System.out.println("=== 3. ASIGNACIÓN COMPUESTA (Atajos) ===");

        int monedas = 50;

        monedas += 10; // Atajo de: monedas = monedas + 10; (pasa a 60)
        monedas -= 5;  // Atajo de: monedas = monedas - 5;  (pasa a 55)
        monedas *= 2;  // Atajo de: monedas = monedas * 2;  (pasa a 110)
        monedas /= 10; // Atajo de: monedas = monedas / 10; (pasa a 11)
        monedas %= 4;  // Atajo de: monedas = monedas % 4;  (11 dividido entre 4 sobra 3)

        System.out.printf("Monedas finales tras operaciones: %d%n%n", monedas);


        // =======================================================
        // OPERADORES RELACIONALES / COMPARACIÓN
        // Devuelven SIEMPRE un booleano (true o false)
        // =======================================================
        System.out.println("=== 4. COMPARACIÓN ===");

        int edad = 18;

        boolean esMayorDeEdad   = edad >= 18; // Mayor o igual que (true)
        boolean esMenor         = edad < 18;  // Menor estricto que (false)
        boolean esIgual         = edad == 18; // ¡OJO! DOBLE IGUAL (==) para comparar
        boolean esDiferente     = edad != 20; // Diferente o distinto (!=) (true)

        System.out.printf("¿Es mayor o igual a 18?: %b%n", esMayorDeEdad);
        System.out.printf("¿Es menor de 18?: %b%n", esMenor);
        System.out.printf("¿Es exactamente 18?: %b%n", esIgual);
        System.out.printf("¿Es distinto de 20?: %b%n%n", esDiferente);


        // =======================================================
        // OPERADORES LÓGICOS (&&, ||, !)
        // Sirven para unir varias comparaciones
        // =======================================================
        System.out.println("=== 5. OPERADORES LÓGICOS ===");

        boolean tieneEntrada = true;
        boolean tieneIdentificacion = false;

        // AND (&&): Devuelve true si TODAS las condiciones son verdaderas.
        // Si una sola falla, todo es falso.
        boolean puedeEntrar = tieneEntrada && tieneIdentificacion;
        System.out.printf("¿Puede entrar? (&& requiere ambas): %b%n", puedeEntrar); // false

        // OR (||): Devuelve true con que AL MENOS UNA sea verdadera.
        // Solo es falso si todas son falsas.
        boolean aviso = tieneEntrada || tieneIdentificacion;
        System.out.printf("¿Cumple al menos una? (||): %b%n", aviso); // true

        // NOT (!): Invierte el valor. Lo que es true pasa a false y viceversa.
        boolean lucesEncendidas = true;
        boolean lucesApagadas = !lucesEncendidas; // Pasa a false
        System.out.printf("Negacion de luces: !true = %b%n", lucesApagadas);


    }
}
