
public class AproximacionPI {
	
	public static void main(String[] args) {
		
		int m = 90000;
		
		double sumatorio = 0;
				
		for (int n = 0; n < m; n++) {

			double nominador = Math.pow(-1.0, n);
			double denominador = 2*n + 1;
			
			double division = nominador / denominador;
			
			sumatorio = sumatorio + division;
			
		}
		
		System.out.println(sumatorio*4);
		
		
		
		
	}

}


