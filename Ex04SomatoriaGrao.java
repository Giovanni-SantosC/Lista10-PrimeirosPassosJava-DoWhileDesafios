package lista10;

public class Ex04SomatoriaGrao {

	public static void main(String[] args) {
		
		double graosNoQuadroAtual = 1.0;
		double somatorioTotalDeGraos = 0.0;
		
		System.out.println("Calcula de Grãos de Trigos no Tabuleiro de Xadrez");
		System.out.println("Quadro | Grãos no Quadro | Somatorio Total");
		System.out.println("  ");
		
		int quadro = 1;
		
		do {
			
			if(quadro == 1) {
				graosNoQuadroAtual = 1;
			}
			
			else {
				graosNoQuadroAtual *= 2;
			}
			
			somatorioTotalDeGraos += graosNoQuadroAtual;
			
			 System.out.printf("%-6d\t%,-18.0f\t%,-20.0f\n", quadro, graosNoQuadroAtual, somatorioTotalDeGraos);
			 
			 quadro++;
		}
		while(quadro < 65);
		
		System.out.println("  ");
		System.out.println("Somatorio Total de Grãos em 64: ");
		System.out.printf("%,.0f grãos\n", somatorioTotalDeGraos);
		
	}
	
}
