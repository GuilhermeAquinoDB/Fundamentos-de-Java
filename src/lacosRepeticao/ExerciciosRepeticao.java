package lacosRepeticao;

import java.util.Scanner;

public class ExerciciosRepeticao {
	
	public static void main(String[] args) {
		
	int x, idade, genero, psicologico = 0, pessoas = 0, calma = 0, nervosas = 0, agressivos = 0, outrosCalmos = 0, idososNervosos = 0, menoresCalmo = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(x = 1000; x <= 1999; x++ ) {
			if(x % 11 == 5) {
				System.out.println(x);
			}
			
		}
		
	/*---------------------------------------------------------------------------------------------------------*/	
		
	while (pessoas < 150) {
		 	System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
			System.out.print("Digite sua idade: ");
			idade = sc.nextInt();
		
			System.out.print("Digite as opções para gênero: 1 - feminino 2 - masculino 3 - Outros ");
			genero = sc.nextInt();
		
			System.out.print("Digite as opções para psicológicos: 1 - pessoa Calma 2 - pessoa Nervosa 3 - pessoa Agressiva ");
			psicologico = sc.nextInt();
			
			pessoas++;
			
			if (genero == 3 && psicologico == 1) {
				outrosCalmos++;
				calma++;
			} else if (genero == 1 && psicologico == 2) {
				nervosas++;
			} else if ( genero == 2 && psicologico == 3) {
				agressivos++;
			} else if (psicologico == 1 ) {
				calma++; 
			} else if (idade > 40 && psicologico == 2) {
				idososNervosos++;
			} if (idade < 18 && psicologico == 1) {
				menoresCalmo++;
			
			}
		}
		
		System.out.print("Pessoas calma: "+ calma);
		System.out.println("\nMulheres Nervosas: "+ nervosas);
		System.out.println("Homens Agressivos: "+ agressivos);
		System.out.println("Outros calmos: "+ outrosCalmos);
		System.out.println("Pessoas Nervosas com mais de 40 anos: "+ idososNervosos);
		System.out.println("Pessoas Calma com menos de 18 anos: "+ menoresCalmo);
		
		sc.close();
	}

}
