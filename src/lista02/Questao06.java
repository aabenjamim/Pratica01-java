package lista02;

import java.util.Scanner;

public class Questao06 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero, x, num;
		System.out.println("numero: ");
		numero = entrada.nextInt();
		x=1;
		num = x;
		
		do{
			x++;
			num+=x;
			
		} while (x<numero);
		System.out.println(num);
		
		entrada.close();
	}
}
