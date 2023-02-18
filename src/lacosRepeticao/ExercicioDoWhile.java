package lacosRepeticao;

import java.util.Scanner;

public class ExercicioDoWhile {
	
	public static void main(String[] args) {
		
		int numero, contador = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Digite um número: ");
			numero = sc.nextInt();
			
			if(numero > 0) {
				contador += numero;
			}
		
		} while( numero != 0);
		
		System.out.println("A soma dos números positivos é: " + contador);
	}

}
