import java.util.Scanner;

public class ExplicacionEstructurasControl {

	public static void main(String[] args) {

		// Condicional if
//		int n;
//		n = 11;
//		if(n>=10) { //cuando es verdadero
//			System.out.println("La variable es mayor o igual a 10");
//		}

		// Condicional if...else
//		int n;
//		n = 5;
//		if(n>=10) {//cuando es verdadero
//			System.out.println("La variable es mayor o igual a 10");
//		}else {//cuando es falso 
//			System.out.println("La variable NO es mayor o igual a 10");
//		}

//		// Condicional if...else if....else
//		int opcion;
//		
//		System.out.println("1.- Añadir usuario");
//		System.out.println("2.- Eliminar usuario");
//		System.out.println("3.- Salir");
//
//		System.out.print("Introduce opcion que deseas: ");
//		
//		Scanner sc = new Scanner(System.in);
//		opcion = sc.nextInt();
//
//		if(opcion==1) {
//			System.out.println("Añado un nuevo usuario");
//		}else if(opcion==2) {
//			System.out.println("Elimino un usuario");
//		}else if(opcion>=2) {
//			System.out.println("Adios!!!");
//		}else {
//			System.out.println("La opcion no está entre 1 y 3");
//		}

		// switch
		int opcion;

		System.out.println("1.- Añadir usuario");
		System.out.println("2.- Eliminar usuario");
		System.out.println("3.- Salir");

		System.out.print("Introduce opcion que deseas: ");

		Scanner sc = new Scanner(System.in);
		opcion = sc.nextInt();

		switch (opcion) {
		case 1: {
			System.out.println("Añado un nuevo usuario");
			break;
		}
		case 2: {
			System.out.println("Elimino un usuario");
			break;
		}
		case 3: {
			System.out.println("Adios!!");
			break;
		}
		default:
			System.out.println("La opcion no está entre 1 y 3");
		}

	}

}
