package lacosCondicionais;

import java.util.Scanner;

public class ExerciciosIf {
	
	public static void main(String[] args) {
		
		int a, b, c, soma;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número A: ");
		a = sc.nextInt();
		
		System.out.print("Digite o número B: ");
		b = sc.nextInt();
		
		System.out.print("Digite o número C: ");
		c = sc.nextInt();
		
		soma = a + b;
		
		if(soma > c) {
			System.out.print("A soma de A + B é Maior do que C");
		} else if (soma == c) {
			System.out.print("A soma de A + B é Igual a C ");
		} else {
			System.out.print("A soma de A + B é Menor do que C ");
		}
		
	/*------------------------------------------------------------------------------------------------------*/
		
		
		
	}

}
