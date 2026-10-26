package utilidades;

public class EjemploMath {
    public static void main(String[] args) {
        
        System.out.println("=== OPERACIONES BÁSICAS CON MATH ===");
        
        //Número mayor y menor
        int a = 15;
        int b = 28;
        System.out.println("El mayor entre " + a + " y " + b + " es: " + Math.max(a, b));
        System.out.println("El menor entre " + a + " y " + b + " es: " + Math.min(a, b));

        // Valor absoluto (quitar el signo negativo)
        int saldo = -45;
        System.out.println("El valor absoluto de " + saldo + " es: " + Math.abs(saldo));

        //Raíz cuadrada (devuelve un double)
        double numero = 25.0;
        System.out.println("La raíz cuadrada de " + numero + " es: " + Math.sqrt(numero));

        // Potencia: Math.pow(base, exponente)
        // Ojo: devuelve double, por eso si queremos int se suele convertir, pero como double va perfecto
        System.out.println("2 elevado a 3 es: " + Math.pow(2, 3));

        //Constantes útiles
        System.out.println("El valor de PI es: " + Math.PI);
        System.out.println("El valor de e es: " + Math.E);

        // Usándolo dentro de un bucle:
        System.out.println("\nTabla de cuadrados del 1 al 5:");
        for (int i = 1; i <= 5; i++) {
            double cuadrado = Math.pow(i, 2);
            System.out.println(i + " al cuadrado = " + cuadrado);
        }
    }
}

