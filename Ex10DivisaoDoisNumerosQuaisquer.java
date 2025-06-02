package lista10;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ex10DivisaoDoisNumerosQuaisquer {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dividendo = 0;
		int divisor = 0;
		boolean entradaValida = false;
		
		System.out.println("Divisão Inteira Usando Apenas Looping: ");
		
		while(!entradaValida) {
			
			try {
				System.out.println("Digite o Dividendo: ");
				dividendo = sc.nextInt();
				System.out.println("Digite o Divisor: ");
				divisor = sc.nextInt();
				entradaValida = true;
			}
			catch(InputMismatchException e) {
				System.out.println("Entrada Invalida.");
				sc.next();
			}
			
		}
		
		int quociente = 0;
		int resto;
		int sinalResultado = 1;
		
		if(divisor == 0) {
			System.out.println("Divisão por Zero Não e Permitida.");
		}
		
		else if(dividendo == 0) {
			quociente = 0;
			resto = 0;
			System.out.println("Quociente da Divisão é: " + quociente);
			System.out.println("Resto da Divisão é: " + resto);
		}
		
		else {
			if((dividendo < 0 && divisor > 0) || (dividendo > 0 && divisor < 0))
			sinalResultado = -1;
		}
		
		int dividendoAbs = Math.abs(dividendo);
		int divisorAbs = Math.abs(divisor);
		
		while(dividendoAbs >= divisorAbs) {
			dividendo -= divisorAbs;
			quociente++;
		}
		
		resto = dividendoAbs;
		
		quociente = quociente * sinalResultado;
		
		if(dividendo < 0 && resto != 0) {
			resto = -resto;
		}
		
		System.out.println("O Quociente da Divisão é: " + quociente);
		System.out.println("O Resto da Divisão é: " + resto);
		
	}
	
}
