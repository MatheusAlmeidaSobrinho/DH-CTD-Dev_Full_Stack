package Enterprise;

public abstract class Funcionario {
    private String nome;
    private String sobrenome;
    private String cpf;
    private String email;
    private int matricula;
    private double salario;

    public Funcionario(String nome, String sobrenome, String cpf, String email, int matricula, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.email = email;
        this.matricula = matricula;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getSalario() {
        return salario;
    }

    public double pagamentoPadrao()
    {
        return salario;
    }
}
