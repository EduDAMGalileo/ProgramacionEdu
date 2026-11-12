package metodos;

public class MetodoMultiplicar {
	static int n=8;
	
	public static int multiplicar(int num, int multiplicador) {
		num=num*multiplicador;
		System.out.println("En el método: " +  num);
		return num;
	}
	
	public static int devolverNumero() {
		return n;
	}
	
	public static void main(String[] args) {
		int numero=5;
		int multiplicador=4;
		System.out.println("En el main, antes del método: " +  numero);
		multiplicar(numero, multiplicador);
		//¿20 o 5?
		System.out.println("En el main, después del método: " +  numero);
	}
}
