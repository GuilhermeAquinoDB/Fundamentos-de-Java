package lacosCondicionais;

import java.util.Scanner;

public class ExerciciosIf {
	
	public static void main(String[] args) {
		
		int a, b, c, soma, numero;
		
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
		
	/*-------------------------------------------------------------------------*/
		
		System.out.print("Digite um n�mero: ");
		numero = sc.nextInt();
		
		if(numero % 2 == 0 && numero > 0) {
			System.out.print("O n�mero " + numero + " � par e positivo!");
		} else if(numero % 2 == 0 && numero < 0) {
			System.out.print("O n�mero " + numero + " � par e negativo!");
		} else if(numero < 0) {
			System.out.print("O n�mero " + numero + " � impar e negativo!");
		} else {
			System.out.print("O n�mero " + numero + " � impar e positivo!");
		}
	
		sc.close();
	}

}
