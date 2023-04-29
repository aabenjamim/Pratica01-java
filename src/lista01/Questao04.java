package lista01;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite as coordenadas do primeiro ponto (x1 y1): ");
        double x1 = entrada.nextDouble();
        double y1 = entrada.nextDouble();

        System.out.print("Digite as coordenadas do segundo ponto (x2 y2): ");
        double x2 = entrada.nextDouble();
        double y2 = entrada.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("A distância entre os pontos é: " + distancia);

        entrada.close();
		
	}

}
