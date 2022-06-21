import java.util.*;

public class Aluno {
    private String nome;
    private String sobrenome;
    private String matricula;
    private List<Parcial> parciais = new ArrayList<Parcial>();
    private List<Final> finais = new ArrayList<Final>();

    public Aluno(String nome, String sobrenome, String matricula) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.matricula = matricula;
    }
}