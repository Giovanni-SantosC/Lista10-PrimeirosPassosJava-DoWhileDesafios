package lista10;

public class Ex03NumerosDivisiveisPor4 {

	public static void main(String[]args) {
		
		int contadora = 1;
		int contagemNumerosDivisiveisPor4 = 0;
		
		System.out.println("Numeros Divisivel por 4 Entre 1 a 200: ");
		System.out.println(" ");
		
		do {
			
			if(contadora % 4 == 0) {
				System.out.println("Numero Divisivel por 4: " + contadora);
				System.out.println(" ");
				
				contagemNumerosDivisiveisPor4++;
			}
			
			contadora++;
		}
		
		
		while(contadora < 201);
		
		System.out.println("Total de Numeros Divisiveis por 4: " + contagemNumerosDivisiveisPor4);
	}
	
}
