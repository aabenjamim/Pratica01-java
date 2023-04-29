package lista02;

public class Questao05 {

	public static void main(String[] args) {
		
		int numero=233;
		System.out.println("numero");

		
		do{

			if(numero>=300 && numero<=400){

				numero += 3;

				System.out.println(numero);
				System.out.println("somando de 3 em 3");
			}
			else{
				numero += 5;
				System.out.println(numero);
				System.out.println("somando de 5 em 5");
			}
		} while (numero<=456);

	}

}
