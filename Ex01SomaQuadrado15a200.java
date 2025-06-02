package lista10;

public class Ex01SomaQuadrado15a200 {

	public static void main(String[]args) {
		
		int contadora = 15;
		int quadrado = 0;
		
	do {
		
		quadrado = contadora * contadora;
		System.out.println("O Quadrado do Numero " + contadora + " é = " + quadrado);
		System.out.println(" ");
		
		contadora++;
		
	}	
	while(contadora < 201);
	}
	
}
