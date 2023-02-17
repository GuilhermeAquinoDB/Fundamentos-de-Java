package lacosRepeticao;

import java.util.Scanner;

public class ExercicioWhile {

	public static void main(String[] args) {
		
		int menor = 0, maior = 0, idade = 0, numero = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(idade >= numero) {
			
			System.out.print("Digite uma idade: " );
			idade = sc.nextInt();
			
			if(idade < 21 && idade > 0) {
				menor++;
			} else if (idade > 50) {
				maior++;
			}
				
		}
		
		System.out.println("Total de pessoas menores de 21 anos: " + menor);
		System.out.println("Total de pessoas maiores de 50 anos: " + maior);
		
		sc.close();

	}

}
