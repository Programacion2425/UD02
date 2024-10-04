
import java.util.Scanner;

/*
 * T2EJ19 – Para aprobar la asignatura se requiere una asistencia como mínimo del 85%
a las clases. Escribe un programa que solicite al usuario el número de clases impartidas
y el número de clases asistidas por el usuario y muestre por consola el porcentaje de
clases asistidas y si puede aprobar la asignatura. Hay que tener en cuenta si todas las
faltas de asistencia son justificadas o no, para ello, el programa preguntará al usuario
si las faltas están justificadas o no.
 * */

public class T2EJ19 {

	public static void main(String[] args) {

		// entero nClasesTotales
		// entero nClasesAsistidas

		int nClasesTotales;
		int nClasesAsistidas;
		boolean estanJustificadas;

		// leer(nClasesTotales)
		// leer(nClasesAsistidas)
		// leer(estanJustificadas)

		Scanner sc = new Scanner(System.in);
		nClasesTotales = sc.nextInt();
		nClasesAsistidas = sc.nextInt();
		estanJustificadas = sc.nextBoolean();

		if (estanJustificadas || nClasesAsistidas / nClasesTotales >= 0.85) {
			System.out.println("Alcanzas más del 85% de asistencia");
			System.out.println((nClasesAsistidas / nClasesTotales)*100);
		} else {
			System.out.println("No alcanzas el 85% de asistencia");
			System.out.println((nClasesAsistidas / nClasesTotales)*100);
		}
	}

}
