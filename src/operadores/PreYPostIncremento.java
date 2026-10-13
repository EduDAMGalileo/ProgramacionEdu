package operadores;

public class PreYPostIncremento {
    public static void main(String[] args) {

        // =======================================================
        // CASO 1: CUANDO VAN SOLOS (NO HAY NINGUNA DIFERENCIA)
        // =======================================================
        System.out.println("=== 1. CUANDO VAN EN SU PROPIA LÍNEA ===");

        int a = 5;
        int b = 5;

        a++; // Post-incremento
        ++b; // Pre-incremento

        // Los dos acaban valiendo exactamente lo mismo: 6
        System.out.printf("Valor de 'a' tras a++: %d%n", a);
        System.out.printf("Valor de 'b' tras ++b: %d%n%n", b);


        // =======================================================
        // CASO 2: AL ASIGNARLOS A OTRA VARIABLE (AQUÍ SÍ SE NOTA)
        // =======================================================
        System.out.println("=== 2. AL ASIGNAR A OTRA VARIABLE ===");

        // --- POST-INCREMENTO (x++) ---
        int vidas = 10;
        // Paso 1: 'resultado1' se queda con el valor actual de 'vidas' (10)
        // Paso 2: 'vidas' se incrementa a 11 en memoria
        int resultado1 = vidas++;

        System.out.println("POST-INCREMENTO (vidas++):");
        System.out.printf("resultado1 recibió: %d (el valor viejo)%n", resultado1);
        System.out.printf("vidas ahora vale:   %d (ya subio)%n%n", vidas);


        // --- PRE-INCREMENTO (++x) ---
        int monedas = 10;
        // Paso 1: 'monedas' se incrementa de inmediato a 11 en memoria
        // Paso 2: 'resultado2' recibe ese nuevo valor ya sumado (11)
        int resultado2 = ++monedas;

        System.out.println("PRE-INCREMENTO (++monedas):");
        System.out.printf("resultado2 recibió: %d (el valor nuevo)%n", resultado2);
        System.out.printf("monedas ahora vale: %d%n%n", monedas);


        // =======================================================
        // CASO 3: DENTRO DE UN PRINTF / PRINTLN
        // =======================================================
        System.out.println("=== 3. DENTRO DE UN PRINTF ===");

        int contador = 1;

        // Imprime '1' porque primero lo lee; después de imprimir, sube a 2:
        System.out.printf("Con post-incremento (contador++): %d%n", contador++);
        
        // Comprobamos que en memoria ya había subido:
        System.out.printf("Valor real que quedó en memoria: %d%n", contador);

        // Con pre-incremento: primero sube de 2 a 3, y luego imprime el 3:
        System.out.printf("Con pre-incremento (++contador): %d%n%n", ++contador);


        // =======================================================
        // CASO 4: PRE Y POST DECREMENTO (--x y x--)
        // Funciona exactamente bajo la misma regla pero restando
        // =======================================================
        System.out.println("=== 4. PRE Y POST DECREMENTO (--) ===");

        int numero = 20;

        System.out.printf("numero-- imprime el valor actual: %d%n", numero--);
        System.out.printf("Valor en memoria ahora mismo:     %d%n", numero); 
        System.out.printf("--numero resta primero e imprime:  %d%n%n", --numero);


        // =======================================================
        // CASO 5: LA TÍPICA PREGUNTA TRAMPA DE EXAMEN
        // =======================================================
        System.out.println("=== 5. EL EJERCICIO CLÁSICO DE EXAMEN ===");

        int p = 5;
        // ¿Qué vale 'total'?
        // p++ entrega 5 (y p pasa a 6)
        // ++p suma p a 7 (y entrega 7)
        // La suma es: 5 + 7 = 12
        int total = p++ + ++p;

        System.out.printf("El resultado de (p++ + ++p) es: %d%n", total);
        System.out.printf("El valor final de p en memoria es: %d%n", p); 
    }
}