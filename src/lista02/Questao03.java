package lista02;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double  soma, valor;
		int cont;

		System.out.println("digite um valor: ");
		valor = entrada.nextDouble();
		soma = valor;
		cont = 1;

		while(valor >= 0){
			System.out.println("digite um valor: ");
			valor = entrada.nextDouble();
			if(valor>0){
			soma += valor;
			cont ++;
			}
		}
			System.out.println("a soma é: "+ soma);
			System.out.println("a média é: "+ (soma/cont));
			System.out.println("a quantidade de valores foi: "+ cont);
			
		entrada.close();

	}

}
