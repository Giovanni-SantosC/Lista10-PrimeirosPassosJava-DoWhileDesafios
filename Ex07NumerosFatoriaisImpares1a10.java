package lista10;


public class Ex07NumerosFatoriaisImpares1a10 {

	public static int calcularFatorial(int n) {
	int fatorial = 1;
	for(int i = 1; i <= n; i++){
		fatorial *= i;
		}
	return fatorial;
	}
	
	public static void main(String[]args) {
		
		
		System.out.println("Fatorial dos Números Impares de 1 a 10: ");
		int contadora = 1;
		
		
		do {
			if(contadora % 2 != 0) {
				
				int resultadoFatorial = calcularFatorial(contadora);
				System.out.println("O Fatorial do Número " + contadora + "! é: " + resultadoFatorial);
			}
			contadora++;
		}
		
		while(contadora < 11);
		
		
	}
	
}
