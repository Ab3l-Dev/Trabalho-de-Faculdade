package classes;

public class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String nome, int idade, double salario, String departamento, Endereco endereco) {
        super(nome, idade, salario, endereco);
        this.departamento = departamento;
    } 

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public String getDepartamento() {
        return departamento;
    }
}
