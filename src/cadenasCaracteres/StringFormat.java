package cadenasCaracteres;

public class StringFormat {
    public static void main(String[] args) {
        String articulo = "Ratón";
        int unidades = 3;
        double precioUnitario = 12.50;
        double total = unidades * precioUnitario;

        // Con String.format: guardamos una sola línea formateada
        // %s = texto, %d = entero, %.2f = decimal con 2 cifras
        String resumen = String.format("Has comprado %d de %s por %.2f € cada uno.", unidades, articulo, precioUnitario);
        System.out.println(resumen);

        // Con .formatted() (Java 15+): hace exactamente lo mismo pero más corto
        String aviso = "Total a pagar: %.2f €".formatted(total);
        System.out.println(aviso);

        // 3. Con BLOQUE DE TEXTO (""") y .formatted(): ideal para varias líneas sin usar \n
        String ticket = """
                ========================
                         TICKET
                ========================
                Artículo: %-12s
                Cantidad: %d
                Total:    %.2f €
                ========================
                """.formatted(articulo, unidades, total);

        // Imprimimos el ticket que ya teníamos guardado
        System.out.println(ticket);
    }
}