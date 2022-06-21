import java.util.ArrayList;
import java.util.List;

public abstract class Paciente
{
    private String dataNascimento;
    private String nome;
    private String sobrenome;
    private Consulta consulta;
    private boolean eAPrimeiraConsulta;

    public Paciente(String nome, Consulta consulta, boolean eAPrimeiraConsulta) {
        this.nome = nome;
        this.consulta = consulta;
        this.eAPrimeiraConsulta = eAPrimeiraConsulta;
    }

    public boolean temQueAvaliar() {
        if(this.iseAPrimeiraConsulta()) {
            this.seteAPrimeiraConsulta(true);
        }
        return false;
    }


    public boolean iseAPrimeiraConsulta() {
        return eAPrimeiraConsulta;
    }

    public void seteAPrimeiraConsulta(boolean eAPrimeiraConsulta) {
        this.eAPrimeiraConsulta = eAPrimeiraConsulta;
    }
}
