package vetoresMatrizes;

import java.util.Scanner;

public class ExercicioVetores {
	
	public static void main(String[] args) {
		
		int vetorNumeros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6}, x = 0 , chute = 0;
		
		double[][] notas = new double[10][4]; // matriz para armazenar as notas dos alunos
        double[] medias = new double[10]; // vetor para armazenar as m�dias de cada aluno
	
		Scanner sc = new Scanner(System.in);
		
	/*	System.out.print("Digite o n�mero que voc� deseja encontrar: ");
		chute = sc.nextInt();
	
		int posicao = -1;
		
		for(x = 0; x <  vetorNumeros.length; x++ ) {
			if (vetorNumeros[x] == chute) {
				posicao = x;
				break;
			}
		}
			
		if(posicao != -1) {
			System.out.printf("O n�mero %d foi encontrado e est� localizado na posi��o: %d",chute, posicao );
		} else {
			
			System.out.print("O numero " + chute + " n�o foi encontrado!\n");
			
		}
			
	/******************************************************************************************************************/
		
	// la�o para ler as notas de cada aluno
	    for (int i = 0; i < 10; i++) {
	         System.out.printf("Notas do aluno %d:\n", i+1);
	         for (int j = 0; j < 4; j++) {
	              System.out.printf("Digite a nota do %d� bimestre: ", j+1);
	              notas[i][j] = sc.nextDouble();
	         }
	          System.out.println();
	    }
	
	  // la�o para calcular a m�dia de cada aluno
	    for (int i = 0; i < 10; i++) {
	         double soma = 0;
	         for (int j = 0; j < 4; j++) {
	             soma += notas[i][j];
	         }
	          medias[i] = soma / 4;
	     }
	
	 // exibe as m�dias de cada aluno
	   System.out.println("M�dias dos alunos:");
	     for (int i = 0; i < 10; i++) {
	          System.out.printf("Aluno %d: %.1f\n", i+1, medias[i]);
	     }
	}
}



