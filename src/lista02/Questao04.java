package lista02;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		int num, mult;
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("digite um valor: ");
		num = entrada.nextInt();

		System.out.println(num);

		mult = num;

		while(mult<100){
			mult *= 3;
			System.out.println(mult);
		}
		
		entrada.close();

	}

}
