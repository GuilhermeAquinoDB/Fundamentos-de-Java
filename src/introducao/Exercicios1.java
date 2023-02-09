package introducao;

import java.util.Scanner;

public class Exercicios1 {
	
	public static void main(String[] args) {

        float salario, abono, novoSalario;
        float nota1, nota2, nota3, nota4, media;
        float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
        float numero1, numero2, numero3, numero4, calculo;

        Scanner sc = new Scanner(System.in);

        /*--- Algoritmo de adição de abono sobre o Salario ----*/

        System.out.print("Digite seu Salário: ");
        salario = sc.nextFloat();

        System.out.print("Digite seu Abono: ");
        abono = sc.nextFloat();

        novoSalario = salario + abono;

        System.out.println("Seu novo Salário será de: " + novoSalario);

        /*----------Calcule a Média do Aluno--------------*/

        System.out.print("Digite sua primeira nota: ");
        nota1 = sc.nextFloat();

        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextFloat();

        System.out.print("Digite a terceira nota: ");
        nota3 = sc.nextFloat();

        System.out.print("Digite ultima nota : ");
        nota4 = sc.nextFloat();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("Sua média final foi de: %.1f ",media);

        /*------Elabore um Algoritmo representando RH sobre um calculo de folha de pagamento------------*/

        System.out.print("\nDigite seu Salário Bruto: ");
        salarioBruto = sc.nextFloat();

        System.out.print("Digite seu Adicional Noturno: ");
        adicionalNoturno= sc.nextFloat();

        System.out.print("Digite suas Horas Extras: ");
        horasExtras = sc.nextFloat();

        System.out.print("Digite os Descontos: ");
        descontos = sc.nextFloat();

        salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;

        System.out.printf("Seu salario Liquido foi de: %.2f", salarioLiquido);

        /*-- calcule e mostre a diferença do produto entre o n1 e n2 pelo produto entre o n3 e o n4.---*/

        System.out.print("Entre com o primeiro numero: ");
        numero1 = sc.nextFloat();

        System.out.print("Entre com o segundo numero: ");
        numero2 = sc.nextFloat();

        System.out.print("Entre com o terceiro numero: ");
        numero3 = sc.nextFloat();

        System.out.print("Entre com o quarto numero: ");
        numero4 = sc.nextFloat();

        calculo = (numero1 * numero2) - (numero3 * numero4);

        System.out.printf("A diferença foi de: %.0f", calculo);

        sc.close();
    }

}
