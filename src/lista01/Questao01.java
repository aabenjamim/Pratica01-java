package lista01;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int tempo, minuto, segundo, hora;
		
		tempo = entrada.nextInt();
		hora= tempo/3600;
		minuto = (tempo%3600)/60;
		segundo = (tempo%60);
		
		System.out.println("O tempo total é: " + hora + ":" + minuto + ":" + segundo);
		
		entrada.close();
	}

}