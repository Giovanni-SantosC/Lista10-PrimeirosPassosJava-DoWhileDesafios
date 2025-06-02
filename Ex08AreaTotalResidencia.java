package lista10;

import java.util.Scanner;

public class Ex08AreaTotalResidencia {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		String continuar = "SIM";
		double areaResidencial = 0.0;
		
		System.out.println("Media de Comodos: ");
		System.out.println(" ");
		
		do{
			
	    
		System.out.println("Digite o Nome do Comodo");
		String comodo = sc.nextLine();
		
		System.out.println("Digite a Largura do(a)" + comodo + ":" );
		Double largura = sc.nextDouble();
		
		System.out.println("Digite o Comprimento do(a)" + comodo + ":");
		double comprimento = sc.nextDouble();
		
		double area = largura * comprimento;
		System.out.println("A Area de " + comodo + " é: " + area);
		
		areaResidencial += area;
		
		System.out.println("Quer Continuar Calculando Novos Comodos ? (SIM) OU (NÃO):");
		sc.nextLine();
		 continuar = sc.nextLine();
		}
		
		while(continuar.equalsIgnoreCase("SIM"));
		
		if(!continuar.equalsIgnoreCase("SIM")) {
			System.out.println("Resultado Final: ");
			System.out.println(" ");
			System.out.println("O Valor Total da Residencia ou Comodo é " + areaResidencial);
		}
		
		
		sc.close();
		
	
	
}
}
