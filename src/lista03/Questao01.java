package lista03;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int num1, num2, num3, maior;
		
		System.out.println("escreva o 1º número: ");
		num1 = entrada.nextInt();
		
		System.out.println("escreva o 2º número: ");
		num2 = entrada.nextInt();
		
		System.out.println("escreva o 3º número: ");
		num3 = entrada.nextInt();
		
		maior = num1;
		
		if(num2>num1 && num2>num3) {
				maior = num2;
		} else if (num3>num1 && num3>num2){
				maior = num3;
		}
		
		System.out.println("o maior número é: " + maior);
		
		entrada.close();
	}

}
