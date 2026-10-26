package utilidades;

//Tenemos que importar la clase
import java.util.Random; 

public class EjemploRandom {
    public static void main(String[] args) {
        
        // Creamos el objeto generador de números aleatorios, de momento hay que tener fe
        Random aleatorio = new Random();

        System.out.println("=== LANZAMIENTO DE DADOS (1 al 6) ===");
        
        // Tiramos un dado de 6 caras 5 veces usando un bucle 'for'
        for (int i = 1; i <= 5; i++) {
            // aleatorio.nextInt(6) genera números del 0 al 5.
            // Si le sumamos 1, conseguimos números del 1 al 6.
            int dado = aleatorio.nextInt(6) + 1;
            
            System.out.println("Tirada " + i + ": ha salido un " + dado);
            
            if (dado == 6) {
                System.out.println("¡Premio! Sacaste la puntuación máxima.");
            }
        }

        System.out.println("\n=== OTROS TIPOS DE DATOS ALEATORIOS ===");

        // Moneda al aire (Booleano: true o false)
        boolean moneda = aleatorio.nextBoolean();
        if (moneda) {
            System.out.println("Moneda: Cara");
        } else {
            System.out.println("Moneda: Cruz");
        }

        // Decimal aleatorio entre 0.0 y 1.0
        double probabilidad = aleatorio.nextDouble();
        System.out.println("Decimal aleatorio: " + probabilidad);

        // Número en un rango personalizado: Ej. Temperatura entre 15 y 30 grados
        // Fórmula: minimo + aleatorio.nextInt(maximo - minimo + 1)
        // 16 posibilidades (de 0 a 15)
        int temperatura = 15 + aleatorio.nextInt(16); 
        System.out.println("Temperatura simulada: " + temperatura + " ºC");
    }
}