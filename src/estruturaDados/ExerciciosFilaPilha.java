package estruturaDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ExerciciosFilaPilha {
	
	 public static void main(String[] args) {
		 
	        Queue<String> filaClientes = new LinkedList<String>();
	        Stack<String> pilha = new Stack<>();
	        
	        Scanner sc = new Scanner(System.in);
	        
	        int opcao = -1;

	        while (opcao != 0) {
	            System.out.println("Menu: ");
	            System.out.println("1 - Adicionar um novo cliente na fila.");
	            System.out.println("2 - Listar todos os clientes na fila.");
	            System.out.println("3 - Chamar (retirar) uma pessoa da fila.");
	            System.out.println("0 - Sair do programa.");

	            System.out.print("Digite a opção desejada: ");
	            opcao = sc.nextInt();
	            sc.nextLine();

	            switch (opcao) {
	                case 1:
	                    System.out.print("Digite o nome do cliente: ");
	                    String nome = sc.nextLine();
	                    filaClientes.add(nome);
	                    System.out.println(nome + " foi adicionado(a) à fila.");
	                    break;

	                case 2:
	                    if (filaClientes.isEmpty()) {
	                        System.out.println("A fila está vazia.");
	                    } else {
	                        System.out.println("Clientes na fila: ");
	                        for (String cliente : filaClientes) {
	                            System.out.println(cliente);
	                        }
	                    }
	                    break;

	                case 3:
	                    if (filaClientes.isEmpty()) {
	                        System.out.println("A fila está vazia.");
	                    } else {
	                        String clienteChamado = filaClientes.remove();
	                        System.out.println(clienteChamado + " foi chamado(a) e retirado(a) da fila.");
	                    }
	                    break;

	                case 0:
	                    System.out.println("Programa finalizado.");
	                    break;

	                default:
	                    System.out.println("Opção inválida.");
	                    break;
	            }
	        }
	        
/*------------------------------------------------------------------------------------------------------------------------------------*/
	        
	        while (opcao != 0) {
	            System.out.println("Escolha uma opção:");
	            System.out.println("1 - Adicionar um novo livro na pilha");
	            System.out.println("2 - Listar todos os livros da pilha");
	            System.out.println("3 - Retirar um livro da pilha");
	            System.out.println("0 - Sair");

	            opcao = sc.nextInt();
	            sc.nextLine();

	            switch (opcao) {
	                case 1:
	                    System.out.println("Digite o nome do livro:");
	                    String livro = sc.nextLine();
	                    pilha.push(livro);
	                    System.out.println("Livro adicionado na pilha.");
	                    break;
	                case 2:
	                    if (pilha.empty()) {
	                        System.out.println("A pilha está vazia.");
	                    } else {
	                        System.out.println("Livros na pilha:");
	                        for (String l : pilha) {
	                            System.out.println(l);
	                        }
	                    }
	                    break;
	                case 3:
	                    if (pilha.empty()) {
	                        System.out.println("A pilha está vazia.");
	                    } else {
	                        String livroRetirado = pilha.pop();
	                        System.out.println("Livro " + livroRetirado + " retirado.");
	                    }
	                    break;
	                case 0:
	                    System.out.println("Programa finalizado.");
	                    break;
	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	                    break;
	            }
	        }
	        
	        sc.close();
	    }
}

