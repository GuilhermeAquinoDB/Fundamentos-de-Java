package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ExerciciosListESet {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<>();
		
		Set<Integer> integerSet = new HashSet<>();
		
		Scanner input = new Scanner(System.in);
		
		numeros.add(2);
        numeros.add(5);
        numeros.add(1);
        numeros.add(3);
        numeros.add(4);
        numeros.add(9);
        numeros.add(7);
        numeros.add(8);
        numeros.add(10);
        numeros.add(6);

       
        System.out.print("Digite um número inteiro: ");
        int numero = input.nextInt();

        if (numeros.contains(numero)) {
            System.out.printf("O número %d foi encontrado na posição %d da lista.", numero, numeros.indexOf(numero));
        } else {
            System.out.printf("O número %d não foi encontrado!", numero);
        }
/*******************************************************************************************************************************************/
        
        System.out.println("Digite 10 valores inteiros não repetidos:");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Digite o valor %d: ", i);
			int value = input.nextInt();

            if (integerSet.contains(value)) {
                System.out.println("O valor já existe na coleção. Digite outro valor.");
                i--;
            } else {
                integerSet.add(value);
            }
        }

        System.out.println("\nElementos da coleção:");

        Iterator<Integer> iterator = integerSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
	}

}
