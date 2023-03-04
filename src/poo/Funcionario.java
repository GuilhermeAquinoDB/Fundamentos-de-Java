package poo;

public class Funcionario {

	private String nome;
    private int idade;
    private double salario;
    private String cargo;
    private boolean estaTrabalhando;

    public Funcionario(String nome, int idade, double salario, String cargo, boolean estaTrabalhando) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.cargo = cargo;
        this.estaTrabalhando = estaTrabalhando;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public boolean isEstaTrabalhando() {
        return estaTrabalhando;
    }

    public void setEstaTrabalhando(boolean estaTrabalhando) {
        this.estaTrabalhando = estaTrabalhando;
    }

    public void visualizar() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Cargo: " + cargo);
        System.out.println("Está trabalhando: " + estaTrabalhando);
    }
}
