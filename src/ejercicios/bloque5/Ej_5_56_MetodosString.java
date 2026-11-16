package ejercicios.bloque5;

public class Ej_5_56_MetodosString {
	public static void main(String[] args) {
		//a
		String s ="Programación";
		boolean empieza = s.length() >= 3 && s.charAt(0) == 'p' && s.charAt(1) == 'r' && 
				s.charAt(2) == 'o';
		System.out.println(empieza);
		//El método de String que hace esto es startsWith
		
		empieza=s.startsWith("pro");
		System.out.println(empieza);
		
		//b
		int pos = -1; 
		for (int i = 0; i < s.length() && pos == -1; i++) {
			if (s.charAt(i) == 'n') {
				pos = i; 
			}
		}
		System.out.println(pos);
		//El métod de String que ya hace esto es indexOf
		System.out.println(s.indexOf('n'));
		
		//c
		String r = ""; 
		for (int i = 2; i < 6; i++) {
			r += s.charAt(i);
		}
		System.out.println(r);
		//El método que hace esto de la clase String es substring
		System.out.println(s.substring(2,6));
		
	}

}
