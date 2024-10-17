import java.util.*;
public class T3EJ14 {

	public static void main(String[] args) {
		int numero;
		int resultado = 0;
		int resto;
		int exponente = 0;
		int n = 0;
		
		System.out.print("Introduce un numero decimal: ");
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();
		
		while (numero != 1) {
			resto = numero %2;
			
			exponente = 1;
			for (int i = 0; i<n; i++) {
				exponente = exponente * 10;
			}
			resultado = resultado + (resto * exponente);
			n++;
			numero = numero / 2;
		}
		
		resultado = resultado + exponente*10;
		System.out.print(resultado);
	}

}
