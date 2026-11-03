package metodos;
public class EjemploDebug {


	public static int cuadrado(int n) {
		return n * n;
	}

	public static int sumaDeCuadrados(int a, int b) {
		return cuadrado(a) + cuadrado(b);
	}

	public static void main(String[] args) {
		int r = sumaDeCuadrados(3, 4);
		System.out.println(r);           
	}
}