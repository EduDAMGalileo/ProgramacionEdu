package algoritmos;

import java.util.Scanner;

public class ContarVocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un texto: ");
        String texto = sc.nextLine();

        int vocales = 0;

        for (int i = 0; i < texto.length(); i++) {
        	//Esto se profundiza con los String
            char c = Character.toLowerCase(texto.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vocales++;
            }
        }

        System.out.println("Vocales encontradas: " + vocales);
        sc.close();
    }
}