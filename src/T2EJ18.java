
/*
 * T2Ej18 – Una empresa da una bonificación del 5% a sus empleados cada 5 años.
 * Escribe un programa que solicite al usuario su salario y los años de servicio
 * y muestre por consola el importe de la bonificación
 */

import java.util.Scanner;

public class T2EJ18 {

	public static void main(String[] args) {
		
		//real salario
		double salario;
		
		//entero aniosServicio
		int aniosServicio;
		
		//real bonificacion
		double bonificacion;
		
		//escribir(Introduce....)
		System.out.print("Introduce salario: ");
		//leer(salario)
		Scanner sc = new Scanner(System.in);
		salario= sc.nextDouble();
		
		//escribir(Introduce....)
		System.out.println("Introduce anios servicio");
		//leer(aniosServicio)
		aniosServicio = sc.nextInt();
		
		//bonificacion = salario * ((aniosServicio/5)*5)/100
		bonificacion = salario * ((aniosServicio/5)*5)/100;
		//salario = salario + bonificacion
		salario = salario + bonificacion;
		
		//escribier(salario)
		System.out.println(salario);

	}

}
