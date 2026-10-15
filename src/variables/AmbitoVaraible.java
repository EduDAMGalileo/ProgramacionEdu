package variables;

public class AmbitoVaraible {
	//Esto tiene mucho más sentido cuando veamos bucles, métodos y demás
	public static void main(String[] args) {
		// x existe hasta el final de main
		int x = 10;
		// y solo existe dentro de este bloque
	    {
	        int y = 20;                  
	        // OK: las dos son visibles
	        System.out.println(x + y);   
	    }
	    // Sabe qué es x pero no qué es y
	    System.out.println(x + y);           
	}


}
