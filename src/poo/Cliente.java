package poo;

public class Cliente {
	
	// Atributos da Classe Cliente
    private String nome;
    private String endereco;
    private String email;
    private String telefone;
    private int idade;
    
    // Construtor com parâmetros
    public Cliente(String nome, String endereco, String email, String telefone, int idade) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.idade = idade;
    }
    
    // Métodos Get e Set para todos os Atributos
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    // Método visualizar
    public void visualizar() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("E-mail: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Idade: " + idade);
    }

}
