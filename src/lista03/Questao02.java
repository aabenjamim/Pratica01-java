package lista03;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int num1, num2, num3, a, b, c;
		
		System.out.println("escreva o 1º número: ");
		num1 = entrada.nextInt();
		
		System.out.println("escreva o 2º número: ");
		num2 = entrada.nextInt();
		
		System.out.println("escreva o 3º número: ");
		num3 = entrada.nextInt();
		
		a = num1;
		b = num2;
		c = num3;

		
		if(num2>num1 && num2>num3) {
				c = num2;
				if(num1>num3) {
					a = num3;
					b=num1;
				} else {
					a= num1;
					b=num3;
				}
		} else if (num3<num1 && num3<num2){
				c = num1;
				if(num3>num2) {
					a = num2;
					b = num3;
				} else {
					a = num3;
					b = num2;
				}
		}
		
		System.out.println("A ordem crescente é: " + a + " "+ b + " "+ c);
		
		entrada.close();
	}

}
