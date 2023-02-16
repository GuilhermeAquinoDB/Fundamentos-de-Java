package lacosCondicionais;

import java.util.Scanner;

public class ExerciciosIf {
	
	public static void main(String[] args) {
		
		int a, b, c, soma, numero;
		
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
		
	/*-------------------------------------------------------------------------*/
		
		System.out.print("Digite um número: ");
		numero = sc.nextInt();
		
		if(numero % 2 == 0 && numero > 0) {
			System.out.print("O número " + numero + " é par e positivo!");
		} else if(numero % 2 == 0 && numero < 0) {
			System.out.print("O número " + numero + " é par e negativo!");
		} else if(numero < 0) {
			System.out.print("O número " + numero + " é impar e negativo!");
		} else {
			System.out.print("O número " + numero + " é impar e positivo!");
		}
	
		sc.close();
	}

}
