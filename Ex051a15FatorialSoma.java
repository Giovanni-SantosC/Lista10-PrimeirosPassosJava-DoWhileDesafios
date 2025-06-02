package lista10;

import java.util.Scanner;
import java.math.BigDecimal;
import java.util.InputMismatchException;

public class Ex051a15FatorialSoma {

	public static BigDecimal calcularFatorial(int n) {
		if(n == 0) {
			return BigDecimal.ONE;
		}
		
		if(n < 0) {
			return BigDecimal.ZERO;
		}
		
		BigDecimal fatorial = BigDecimal.ONE;
		for(int i = 1 ; i < n; i++) {
			fatorial = fatorial.multiply(new BigDecimal(i));
		}
		return fatorial;
	}
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		BigDecimal somaTotalFatoriais = BigDecimal.ZERO;
		int contadorLeituras = 0;
		
		System.out.println("Somatório das Fatoriais de 15 Números Inteiros ");
		System.out.println("Digite 15 Números Inteiros: ");
		System.out.println("Não pode Digitar Numeros Negativos.");
		
		do {
			
			int numeroLido;
			
			try {
				System.out.println("Digite o " + (contadorLeituras + 1) + "º Número:");
				numeroLido = sc.nextInt();
			if(numeroLido < 0) {
				System.out.println("Numero Negativo Não Sera Somado: ");
			}
			
			else {
				BigDecimal fatorialDoNumeroLido = calcularFatorial(numeroLido);
				somaTotalFatoriais = somaTotalFatoriais.add(fatorialDoNumeroLido);
				System.out.println("Fatorial de " + numeroLido + " é: " + fatorialDoNumeroLido);
			}
			
			contadorLeituras++;
			
			}
			
			
			catch(InputMismatchException e) {
				
				System.out.println("Entrada Invalida. Digite Apenas Numeros Inteiros. ");
				sc.next();
			}
			
		}
		while(contadorLeituras < 15);
		
		System.out.println("Resultado Final");
		System.out.println("O Somatorio total das Fatoriais Dos Numeros Validos é " + somaTotalFatoriais);
		
		sc.close();
	}
	
}
