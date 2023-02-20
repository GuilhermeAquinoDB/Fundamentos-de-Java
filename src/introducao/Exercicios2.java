package introducao;

import java.util.Scanner;

public class Exercicios2 {

	public static void main(String[] args) {
		
		int anos = 0, meses = 0, dias = 0, diasTotal = 0, horas, minutos, segundos, segundosTotal, a, b, c;
		double d, r, s;
		
		Scanner sc = new Scanner(System.in);
		
/*		System.out.print("Digite a idade em anos: ");
		anos = sc.nextInt();
		
		System.out.print("Digite a idade em meses: ");
        meses = sc.nextInt();
        
        System.out.print("Digite a idade em dias: ");
        dias = sc.nextInt();
        
        diasTotal = anos * 365 + meses * 30 + dias;

        
        System.out.println("A idade expressa em  dias é: " + diasTotal);
        
  /*----------------------------------------------------------------------------*/
        
   /*     System.out.print("Digite sua idade expressa em dias : ");
        diasTotal = sc.nextInt();
        
        anos = diasTotal / 365;
        meses = (diasTotal % 365) / 30;
        dias = (diasTotal % 365) % 30;
        
        //10824 **20/02/2023**     
        System.out.print("Você tem: " + anos + ", meses " + meses + ", e dias "+ dias);
        
 	/*-------------------------------------------------------------------------------------------*/
        
		
/*		System.out.print("Qual a duração do Evento expressa em segundos : ");
		segundosTotal = sc.nextInt();
		
		
		horas = segundosTotal / 3600;	
		minutos = (segundosTotal % 3600) / 60;
		segundos = segundosTotal % 60;
		
		System.out.println("Esse Evento terá a duração de: "+ horas + " horas, " + minutos + " minutos e " + segundos + " segundos.");
		
	/*---------------------------------------------------------------------------------------------------------------------------------*/
		
		System.out.print("Digite o primeiro numero inteiro e positivo: ");
		a = sc.nextInt();
		
		System.out.print("Digite o segundo numero inteiro e positivo: ");
		b = sc.nextInt();
		
		System.out.print("Digite o terceiro numero inteiro e positivo: ");
		c = sc.nextInt();
		
		r = Math.sqrt(a + b);
		
		s = Math.sqrt(b + c);
		
		d = r + s / 2;
		
		System.out.printf("A seguinte expressão foi: %.2f", d);
		
		sc.close();
        
	}

}
