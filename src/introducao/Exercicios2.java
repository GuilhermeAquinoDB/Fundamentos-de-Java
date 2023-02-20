package introducao;

import java.util.Scanner;

public class Exercicios2 {

	public static void main(String[] args) {
		
		int anos = 0, meses = 0, dias = 0, diasTotal = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a idade em anos: ");
		anos = sc.nextInt();
		
		System.out.print("Digite a idade em meses: ");
        meses = sc.nextInt();
        
        System.out.print("Digite a idade em dias: ");
        dias = sc.nextInt();
        
        diasTotal = anos * 365 + meses * 30 + dias;

        
        System.out.println("A idade expressa em  dias é: " + diasTotal);
        
  /*----------------------------------------------------------------------------*/
        
        System.out.print("Digite sua idade expressa em dias : ");
        diasTotal = sc.nextInt();
        
        anos = diasTotal / 365;
        meses = (diasTotal % 365) / 30;
        dias = (diasTotal % 365) % 30;
        
        //10824 **20/02/2023**     
        System.out.print("Você tem: " + anos + ", meses " + meses + ", e dias "+ dias);
        
 /*-------------------------------------------------------------------------------------------*/
        
		sc.close();
        
	}

}
