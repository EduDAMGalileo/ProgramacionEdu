package metodos;

public class PasoPorValor{

    public static void duplicar(int n) {
        n = n * 2;
        System.out.println("Dentro: " + n);   
    }
    
    public static int duplicarBien(int n) {
        return n * 2;
    }


    public static void main(String[] args) {
        int x = 5;
        
        // Llamamos al método pasándole 'x'
        duplicar(x);
        
        // Comprobamos qué vale 'x' después de la llamada
        System.out.println("Fuera: " + x);
        
        // ahora sí: x vale 10
        x = duplicarBien(x);
        System.out.println("Con return: " + x);
        
        
        
    }
}