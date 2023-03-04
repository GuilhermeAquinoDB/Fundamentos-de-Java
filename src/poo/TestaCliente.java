package poo;

public class TestaCliente {

	public static void main(String[] args) {
		
		// Instanciando 2 objetos da Classe Cliente
        Cliente cliente1 = new Cliente("João da Silva", "Rua das Flores, 123", "joao.silva@gmail.com", "11 99999-8888", 30);
        Cliente cliente2 = new Cliente("Maria dos Santos", "Avenida dos Pinheiros, 456", "maria.santos@hotmail.com", "11 98888-7777", 25);
        
        // Utilizando o método visualizar para exibir os dados dos clientes
        System.out.println("Dados do cliente 1:");
        cliente1.visualizar();
        System.out.println("\nDados do cliente 2:");
        cliente2.visualizar();
		
	}

}
