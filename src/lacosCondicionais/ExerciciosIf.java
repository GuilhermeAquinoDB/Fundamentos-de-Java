package lacosCondicionais;

import java.util.Scanner;

public class ExerciciosIf {
	
	public static void main(String[] args) {
		
		int a, b, c, soma;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o n�mero A: ");
		a = sc.nextInt();
		
		System.out.print("Digite o n�mero B: ");
		b = sc.nextInt();
		
		System.out.print("Digite o n�mero C: ");
		c = sc.nextInt();
		
		soma = a + b;
		
		if(soma > c) {
			System.out.print("A soma de A + B � Maior do que C");
		} else if (soma == c) {
			System.out.print("A soma de A + B � Igual a C ");
		} else {
			System.out.print("A soma de A + B � Menor do que C ");
		}
		
	/*------------------------------------------------------------------------------------------------------*/
		
		
		
	}

}
