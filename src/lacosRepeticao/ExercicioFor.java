package lacosRepeticao;

import java.util.Scanner;

public class ExercicioFor {
	
	public static void main(String[] args) {
		
		int x, numero,par = 0, impar = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(x = 1; x <= 10; x++ ) {
			System.out.print("Digite o "+ x +"° numero: ");
			numero = sc.nextInt();
			if(numero % 2 == 0) {
				par++;
			} else {
				impar++;
			}
			if(x == 10) {
				System.out.println("Total de números de pares: " + par);
				System.out.println("Total números ímpares: " + impar);
			}
		}
		sc.close();
		
	}

}
