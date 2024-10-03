import java.util.Scanner;

public class T2EJ9 {

	/*
	 * T2EJ9 - Escribe un programa que calcule el dinero recaudado en un concierto.
	 * La aplicación solicitará el aforo máximo del local, el precio por entrada
	 * (todas tienen el mismo precio) y el número de entradas vendidas. Hay que
	 * tener en cuenta que si el número de entradas vendidas no supera el 20% del
	 * aforo, el concierto se suspenderá.
	 */

	public static void main(String[] args) {
		
		double dineroRecaudado;
		int aforoMaximo;
		double precioEntrada;
		int entradasVendidas;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Introduce aforo maximo: ");
		aforoMaximo = sc.nextInt();
		
		System.out.print("Introduce precio por entrada: ");
		precioEntrada = sc.nextDouble();
		
		System.out.print("Introduce numero de entradas vendidas: ");
		entradasVendidas = sc.nextInt();
		
		dineroRecaudado = entradasVendidas*precioEntrada;
		
		if (entradasVendidas <= aforoMaximo*0.2) {
			System.out.println("SI se suspende");
		}

	}

}
