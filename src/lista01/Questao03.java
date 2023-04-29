package lista01;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		double nota1, nota2, nota3, media;

		nota1 = entrada.nextFloat();
		nota2 = entrada.nextFloat();
		nota3 = entrada.nextFloat();

		media = 0.2*nota1 + 0.3*nota2 + 0.5*nota3;
		
		System.out.println("Sua média é: " + media);
		
		entrada.close();
		
	}

}
