package Enterprise;

public class Empresa {
    private String nome;
    private String cnpj;
    private Funcionario[] quadroFuncionarios;

    public Empresa(String nome, String cnpj, Funcionario[] quadroFuncionarios) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.quadroFuncionarios = quadroFuncionarios;
    }
}
