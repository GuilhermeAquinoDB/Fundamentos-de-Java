package lacosCondicionais;

import java.util.Scanner;

public class ExerciciosSwitch {

	public static void main(String[] args) {

		int opcao, quantidade, operacao;
		float preco, numero1, numero2, soma, subtracao, multiplicacao, divisao;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");
		System.out.print("Digite o código do Produto \n - 1 Cachorro Quente R$ 10 \n - 2 X-Salada R$ 15 \n - 3 X-Bacon R$ 18"
				+ "\n - 4 Bauru R$ 12 \n - 5 Refrigerante R$ 8 \n - 6 Suco de Laranja R$ 13");
		opcao = sc.nextInt();
		
		System.out.println("Digite a Quantidade de produtos: ");
		quantidade = sc.nextInt();
		
		
		switch (opcao) {
		case 1: 
			preco = quantidade * 10;
			System.out.println("Cachorro Quente - Valor Total: " + preco);
			break;
		case 2: 
			preco = quantidade * 15;
			System.out.println("X-Salada - Valor Total: " + preco);
			break;
		case 3: 
			preco = quantidade * 18;
			System.out.println("X-Bacon - Valor Total: " + preco);
			break;
		case 4: 
			preco = quantidade * 12;
			System.out.println("Bauru Valor - Total: " + preco);
			break;
		case 5: 
			preco = quantidade * 8;
			System.out.println("Refrigerante - Valor Total: " + preco);
			break;
		case 6: 
			preco = quantidade * 13;
			System.out.println("Suco de Laranja - Valor Total: " + preco);
			break;
		
		default:
			System.out.println("Opção inválida!");
		}
		
	/*-------------------------------------------------------------------------------------*/
		
		System.out.print("Digite o 1° numero: ");
		numero1 = sc.nextFloat();
		
		System.out.print("Digite o 2° numero: ");
		numero2 = sc.nextFloat();
		
		System.out.print("Escolha a opração - 1 Soma, 2 - Subtração, 3 - Multiplicação, 4 - Divisão");
		operacao = sc.nextInt();
		
		switch (operacao) {
		case 1: 
			soma = numero1 + numero2;
			System.out.println(" A soma de " + numero1 + " + " + numero2 + " foi de: " + soma);
			break;
		case 2: 
			subtracao = numero1 - numero2;
			System.out.println(" A subtração de " + numero1 + " - " + numero2 + " foi de: " + subtracao);
			break;
		case 3: 
			multiplicacao = numero1 * numero2;
			System.out.println(" A multiplicação de " + numero1 + " * " + numero2 + " foi de: " + multiplicacao);
			break;
		case 4: 
			divisao = numero1 / numero2;
			System.out.println(" A divisão de " + numero1 + " / " + numero2 + " foi de: " + divisao);
			break;
		default:
			System.out.println("Operação inválida!");
		}
		
		sc.close();
	}

}
