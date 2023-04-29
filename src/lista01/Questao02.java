package lista01;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idade, anos, meses, dias;
		
		idade = entrada.nextInt();

		anos = idade/365;

		meses = (idade%365)/30;

		dias = (idade%365)%30;
		
		System.out.println("Sua idade é: " + anos + " anos " +
		meses + " meses " +  dias + " dias");
		
		entrada.close();
	}
	

}