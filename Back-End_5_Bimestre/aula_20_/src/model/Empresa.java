package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Empresa implements Serializable {

    private String cnpj;
    private String nome;
    private List<Funcionario>  funcionario = new ArrayList<>();

    public Empresa(String cnpj, String nome) {
        this.cnpj = cnpj;
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Funcionario> getFuncionario() {
        return funcionario;
    }

    public void adicionaFuncionario(Funcionario funcionario) {
        this.funcionario.add(funcionario);
    }
}
