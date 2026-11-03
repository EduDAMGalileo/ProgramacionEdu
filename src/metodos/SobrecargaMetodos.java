package metodos;

public class SobrecargaMetodos {

    // Versión 1: Recibe dos números enteros (int)
    public static int mayor(int a, int b) {
    	//Ver operador ternario
        return a > b ? a : b;
    }

    // Versión 2: Recibe dos números decimales (double)
    public static double mayor(double a, double b) {
        return a > b ? a : b;
    }

    // Versión 3: Recibe tres números enteros (int) y REUTILIZA la versión de dos
    public static int mayor(int a, int b, int c) {
        return mayor(mayor(a, b), c); 
    }

    public static void main(String[] args) {
        System.out.println("=== PRUEBAS DE SOBRECARGA DE MÉTODOS ===\n");

        // Llama a mayor(int, int) porque los argumentos son enteros
        int resultado1 = mayor(3, 7);
        System.out.println("mayor(3, 7) -> Llama a mayor(int, int)");
        System.out.println("Resultado: " + resultado1 + "\n");

        // Llama a mayor(double, double) porque los argumentos tienen decimales
        double resultado2 = mayor(2.5, 1.8);
        System.out.println("mayor(2.5, 1.8) -> Llama a mayor(double, double)");
        System.out.println("Resultado: " + resultado2 + "\n");

        // Llama a mayor(int, int, int) porque le pasamos tres argumentos enteros
        int resultado3 = mayor(4, 9, 2);
        System.out.println("mayor(4, 9, 2) -> Llama a mayor(int, int, int)");
        System.out.println("Resultado: " + resultado3);
    }
}