package cadenasCaracteres;

public class ClaseCharacter {
	//La clase envoltorio Character nos permite hacer cosas con el tipo básico para caracteres
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = '5';
        char c3 = ' ';

        // Métodos de comprobación (devuelven true o false)
        System.out.println("¿Es 'a' una letra? " + Character.isLetter(c1));
        System.out.println("¿Es '5' un número? " + Character.isDigit(c2)); 
        System.out.println("¿Es ' ' un espacio? " + Character.isWhitespace(c3));
        System.out.println("¿Es 'a' mayúscula? " + Character.isUpperCase(c1));
        System.out.println("¿Es 'a' minúscula? " + Character.isLowerCase(c1));

        // Métodos de conversión (devuelven el carácter transformado)
        char c1Mayuscula = Character.toUpperCase(c1);
        System.out.println("'a' convertida a mayúscula: " + c1Mayuscula);

        char c4 = 'Z';
        char c4Minuscula = Character.toLowerCase(c4);
        System.out.println("'Z' convertida a minúscula: " + c4Minuscula);
    }
}