
/*
 * Escribe un programa que pida un número n, 
 * y diga qué números primos hay entre 1 y n. 
 * Un número primo será aquel que únicamente sea 
 * divisible por 1 y por el mismo.
 * **/

import java.util.Scanner;

public class T3EJ16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();

		for (int i = 1; i <= numero; i++) {
			
			int n = 2;
			while (i % n != 0 && n < i) {
				n++;
			}

			if (n == i) {
				System.out.println(i + " es primo");
			} else {
				System.out.println(i + " NO es primo");
			}

		}

	}

}
