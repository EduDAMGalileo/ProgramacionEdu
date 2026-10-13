package entradaSalida;

public class EjemploPrintf {
    public static void main(String[] args) {

        // ==========================================
        // TEXTO BÁSICO Y SALTOS DE LÍNEA
        // ==========================================
        
        // A diferencia de println, printf NO salta de línea por defecto.
        // Hay que indicarle el salto con '%n' (o con '\n').
        System.out.printf("¡Hola, mundo!%n");

        // Si no pones salto de línea, el siguiente texto saldrá pegado:
        System.out.printf("Esto sale ");
        System.out.printf("en la misma linea.%n%n");


        // ==========================================
        // NÚMEROS ENTEROS (%d)
        // ==========================================
        int edad = 20;
        int puntos = 1500;

        // El primer %d se sustituye por la variable 'edad'
        System.out.printf("Tengo %d anos.%n", edad);

        // Puedes poner varias variables (se rellenan en orden de izquierda a derecha):
        System.out.printf("Tienes %d anos y has conseguido %d puntos.%n%n", edad, puntos);


        // ==========================================
        // 3. NÚMEROS DECIMALES (%f y %.2f)
        // ==========================================
        double precio = 19.99;
        double pi = 3.14159265;

        // Con %f normal, Java muestra muchos decimales por defecto:
        System.out.printf("El valor de PI completo es: %f%n", pi);

        // Con '%.2f' le decimos que solo queremos 2 decimales (redondea automáticamente):
        System.out.printf("El producto cuesta: %.2f euros.%n", precio);

        // Con '%.4f' le pedimos exactamente 4 decimales:
        System.out.printf("PI con 4 decimales: %.4f%n%n", pi);


        // ==========================================
        // TEXTO (%s), CARACTERES (%c) Y BOOLEANOS (%b)
        // ==========================================
        String nombre = "Laura";
        char inicial = 'L';
        boolean esMayorDeEdad = true;

        System.out.printf("Nombre: %s%n", nombre);
        System.out.printf("Inicial: %c%n", inicial);
        
        // %b es especial de Java para booleanos (imprime true o false):
        System.out.printf("¿Es mayor de edad?: %b%n%n", esMayorDeEdad);


        // ==========================================
        // COMBINANDO TODO EN UNA SOLA FRASE
        // ==========================================
        String producto = "Teclado";
        int unidades = 3;
        double precioUnitario = 25.50;

        // Observa cómo coinciden en orden: %s -> producto | %d -> unidades | %.2f -> precioUnitario
        System.out.printf("Pedido: Compraste %d unidades de '%s' a %.2f euros cada uno.%n%n", 
                          unidades, producto, precioUnitario);


        // ==========================================
        // TRUCOS EXTRA PARA DAR FORMATO
        // ==========================================

        // '\t' sirve para tabular (crear columnas alineadas)
        System.out.printf("Producto\tPrecio%n");
        System.out.printf("Manzana\t\t1.20%n");
        System.out.printf("Pan\t\t0.80%n%n");

        // Para imprimir el símbolo '%' literal, tienes que escribir dos: '%%'
        int bateria = 85;
        System.out.printf("Nivel de bateria: %d%%%n", bateria);
    }
}
