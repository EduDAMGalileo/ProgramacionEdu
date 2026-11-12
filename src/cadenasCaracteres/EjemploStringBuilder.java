package cadenasCaracteres;

public class EjemploStringBuilder {
	public static void main(String[] args) {

		// CREACIÓN: Puedes empezar vacío o con un texto inicial
		StringBuilder sb = new StringBuilder("Hola");

		// append(): Añade cosas al final
		// Se pueden encadenar llamadas (.append().append()...)
		// Acepta texto, números, caracteres, booleanos, etc.
		sb.append(" mundo");
		sb.append("! ").append("Año: ").append(2026);
		System.out.println("1. append:       " + sb);

		//insert(posición, texto): Inserta en cualquier parte intermedia
		// Insertamos en el índice 4 (justo después de "Hola")
		sb.insert(4, " a todo el");
		System.out.println("2. insert:       " + sb);

		// delete(inicio, fin): Elimina un tramo de caracteres
		// Borramos desde el índice 4 hasta el 15 (quitamos " a todo el")
		sb.delete(4, 15);
		System.out.println("3. delete:       " + sb);

		// deleteCharAt(posición): Borra un único carácter
		// Truco muy usado: borrar la última coma o el último carácter sobrante
		sb.deleteCharAt(sb.length() - 1); // Quita el último carácter (el '6')
		System.out.println("4. deleteCharAt: " + sb);

		// reverse(): Invierte el texto por completo (¡en el mismo objeto!)
		StringBuilder espejo = new StringBuilder("Java");
		espejo.reverse();
		System.out.println("5. reverse:      " + espejo);

		// -----------------------------------------------------------
		// toString(): CONVERSIÓN A STRING
		// -----------------------------------------------------------
		// Recuerda: StringBuilder sirve para CONSTRUIR el texto de forma eficiente.
		// Cuando ya lo tienes listo, lo pasas a un String normal e inmutable:
		String textoTerminado = sb.toString();

		System.out.println("\n--- YA ES UN STRING ---");
		System.out.println("Tipo: " + textoTerminado.getClass().getSimpleName());
		System.out.println("Texto final: " + textoTerminado);
	}
}