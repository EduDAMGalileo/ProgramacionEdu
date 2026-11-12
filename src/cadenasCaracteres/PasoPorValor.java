package cadenasCaracteres;

public class PasoPorValor {

    public static void main(String[] args) {
        String nombre = "Eduardo";
        System.out.println("Al inicio en main: " + nombre);

        // Intento 1: Intentamos cambiarlo con un método void
        intentarCambiar(nombre);
        System.out.println("Tras intentarCambiar(): " + nombre); 
        // Sigue siendo "Eduardo" porque el cambio no afecta a la variable original

        // Intento 2: La forma correcta (devolver el nuevo texto y reasignarlo)
        nombre = cambiarDeVerdad();
        System.out.println("Tras reasignar con cambiarDeVerdad(): " + nombre);
        // Ahora sí es "Roberto"
    }

    // Este método NO cambia el nombre en el main
    public static void intentarCambiar(String texto) {
        // 'texto' es solo una copia local.
        // Al hacer esto, solo hacemos que la copia apunte a "Roberto".
        texto = "Roberto"; 
    }

    // La forma correcta en Java: el método DEVUELVE el nuevo String
    public static String cambiarDeVerdad() {
        return "Roberto";
    }
}