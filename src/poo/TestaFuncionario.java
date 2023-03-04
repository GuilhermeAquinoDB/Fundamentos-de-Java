package poo;

public class TestaFuncionario {
	
	public static void main(String[] args) {
        Funcionario f1 = new Funcionario("João", 30, 2000.0, "Analista de Sistemas", true);
        Funcionario f2 = new Funcionario("Maria", 25, 1500.0, "Programadora", false);

        f1.visualizar();
        System.out.println();
        f2.visualizar();
    }
}
