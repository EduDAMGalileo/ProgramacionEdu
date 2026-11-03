package metodos;

public class TiposDeMetodos {

    // Tipo 1: SIN parámetros y SIN valor de retorno (void)
    // Se usa solo para ejecutar una acción (como imprimir un aviso).
    public static void mostrarCabecera() {
        System.out.println("=== CALCULADORA DE EJEMPLO ===");
    }


    // Tipo 2: CON parámetros y SIN valor de retorno (void)
    // Recibe datos para trabajar con ellos, pero no devuelve nada.
    public static void imprimirSuma(int a, int b) {
        int suma = a + b;
        System.out.println("La suma de " + a + " + " + b + " es: " + suma);
    }

    // Tipo 3: SIN parámetros y CON valor de retorno
    // No necesita datos externos, pero calcula y devuelve un resultado.
    public static double obtenerIvaActual() {
        return 0.21; // Devuelve un valor decimal
    }

    // Tipo 4: CON parámetros y CON valor de retorno
    // Recibe datos, realiza operaciones con ellos y devuelve un resultado final.

    public static int multiplicar(int a, int b) {
        int resultado = a * b;
        return resultado; // Devuelve un entero al método que lo llamó
    }

    // MÉTODO PRINCIPAL (MAIN) - Donde probamos los 4 tipos
    public static void main(String[] args) {
        
        // Probamos método SIN parámetros y SIN retorno
        mostrarCabecera();

        // Probamos método CON parámetros y SIN retorno
        imprimirSuma(8, 5);

        // Probamos método SIN parámetros y CON retorno (guardamos lo que devuelve)
        double iva = obtenerIvaActual();
        System.out.println("El IVA aplicado es: " + iva);

        // Probamos método CON parámetros y CON retorno
        int producto = multiplicar(4, 6);
        System.out.println("El resultado de la multiplicación es: " + producto);
    }
}