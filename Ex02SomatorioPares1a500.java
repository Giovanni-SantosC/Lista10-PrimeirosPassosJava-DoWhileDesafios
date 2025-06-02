package lista10;

public class Ex02SomatorioPares1a500 {

	public static void main(String[]args) {
		
		int contadora = 1;
		int soma = 0;
		int contagemNumerosPares = 0;
		
		System.out.println("Soma Dos Valores Pares de 1 a 500: ");
		System.out.println(" ");
		
		do {
			
			if(contadora % 2 == 0) {
				soma += contadora;
				contagemNumerosPares++;
			}
			
			contadora++;
		}
		
		while(contadora < 501);
		
		
		System.out.println("A Somatoria dos Numeros Pares de 1 a 500 é: " + soma);
		System.out.println("Contem " + contagemNumerosPares + " Numeros Pares Entre 1 a 500.");
	}
	
	
	
}
