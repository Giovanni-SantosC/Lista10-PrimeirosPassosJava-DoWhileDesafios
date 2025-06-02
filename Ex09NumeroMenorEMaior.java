package lista10;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ex09NumeroMenorEMaior {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int numeroInserido = 0;
		Integer numeroMaior = null;
		Integer numeroMenor = null;
		
		System.out.println("Verificação de Numero Maior e Menor:");
		System.out.println(" ");
		do{
			try {
			System.out.println("Digite um Valor: ");
			numeroInserido = sc.nextInt();
			
			if(numeroInserido >= 0) {
			
			if(numeroMaior == null || numeroInserido > numeroMaior) {
				numeroMaior = numeroInserido;
			}
			
			if(numeroMenor == null || numeroInserido < numeroMenor) {
				numeroMenor = numeroInserido;
			}
			
			}
			else {
				System.out.println("Numero Negativo Detectado.");
			}
			
			
			}catch(InputMismatchException e) {
				System.out.println("Entra Invalida Digite Apenas Numeros Inteiros");
				sc.next();
				numeroInserido = 0;
			}
		}
		
		while(numeroInserido >= 0);
		
		sc.close();
		
		System.out.println("Resultado Final: ");
		System.out.println(" ");
		if(numeroMaior != null && numeroMenor != null) {
			System.out.println("o Numero Maior Digitado é " + numeroMaior + " é Numero Menor Digitado é " + numeroMenor);
		}
		else {
			System.out.println("Valor Inserido Invalido.");
		}
		
		
	}
	
}
