package cadenasCaracteres;

public class StringBuilderMutable {
	
	public static void modificarString(String s) {
		s = s.concat(" Jaime");
		//s = s + " Jaime";
	}
	
	public static void modificarString(StringBuilder sb) {
		sb.append(" Jaime");
	}
	
	public static void main(String[] args) {
		String s = "Eduardo";
		StringBuilder sb = new StringBuilder("Eduardo");
		
		modificarString(s);
		modificarString(sb);
		System.out.println("El String tiene: " + s + " y el StringBuilder: " + sb);
	}

}
