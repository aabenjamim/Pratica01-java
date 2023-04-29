package lista02;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int filho, x;
		double salario, somasalario, mediasalario, maior, mediafilho, somafilho,
		percentual, total;

		x=0;
		somasalario = 0;

		somafilho = 0;

		maior = 0;

		percentual = 0;

		for(x=0; x<3; x++){
			System.out.println("Qual o salário "+ (x+1) + "? ");
			salario = entrada.nextDouble();
			System.out.println("Qual o numero de filhos "+ (x+1) + "? ");
			filho = entrada.nextInt();
			somasalario = somasalario + salario;
			somafilho = somafilho + filho;
			if(salario>maior){
				maior = salario;
			}
			if(salario<=100){
				percentual = percentual + 1;
			}
		}

		mediasalario = somasalario/3;
		mediafilho = somafilho/3;
		total = (percentual/3)*100;
		

		System.out.println("A media dos salários é: "+ mediasalario);
		System.out.println("A media do numero de filhos é: "+ mediafilho);		
		System.out.println("O maior salário é: "+ maior);
		System.out.println("O percentual de pessoas com salário menor que 100 reais é: "+ total);

		entrada.close();
	}

}
