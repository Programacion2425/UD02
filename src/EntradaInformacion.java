import java.util.Scanner;

public class EntradaInformacion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numeroPersonas = sc.nextInt();
		
		for(int i =0; i<numeroPersonas;i++) {
			int anioPersona = sc.nextInt();
			
			System.out.println(anioPersona);
		}
		

	}

}
