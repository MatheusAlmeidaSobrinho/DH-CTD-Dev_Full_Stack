package modules;
import java.util.ArrayList;
import java.util.List;

public class Aluno
{
    private String nome;
    private String sobrenome;
    private int matricula;
    private List<Parcial> parciais = new ArrayList<Parcial>();
    private List<Final> finals = new ArrayList<Final>();

    public Aluno(String nome, String sobrenome, int matricula) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.matricula = matricula;
    }
}
