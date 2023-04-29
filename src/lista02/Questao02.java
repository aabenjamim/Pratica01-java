package lista02;

public class Questao02 {

	public static void main(String[] args) {
		
		int x, soma;

		soma = 0;

		for (x=1; x<=500; x++){
			if(x%2!=0 && x%3==0){
				soma = soma + x;
			}
		}
		System.out.println(soma);

	}

}
