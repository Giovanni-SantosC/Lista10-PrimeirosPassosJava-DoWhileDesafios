package lista10;

import java.util.Scanner;

public class Ex06MediaNumeros {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Media de Valores Informado: ");
		System.out.println("Para o Programa Parar Digite um Numero Negativo.");
		
		boolean teste = true;
		int contadora = 0;
		double numeroLido;
		double somaNumeroLido = 0.0;
		double media = 0.0;
		
		
		do {
			
			System.out.println("Digite o Numero " + (contadora + 1) + "º: ");
			numeroLido = sc.nextDouble();
			
			if(numeroLido < 0) {
				System.out.println("Numero Informado e Negativo.");
				System.out.println(" ");
				teste = false;
				if(contadora == 0) {
					contadora = 1;
				}
				
               
			}
			
			if(numeroLido >= 0) {
				somaNumeroLido += numeroLido;
				teste = true;
				contadora++;
			}
			
		}
		
		while(teste);	
		
		media = somaNumeroLido / contadora;
		
		System.out.println("Resultado Final: ");
		System.out.println(" ");
		System.out.println("A Media dos Valores Inseridos é: " + media);
		System.out.println("O Total Desses Valores é " + somaNumeroLido);
		
		sc.close();
	}
	
}
