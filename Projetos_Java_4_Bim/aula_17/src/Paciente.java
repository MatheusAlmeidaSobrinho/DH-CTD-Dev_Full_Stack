import java.util.*;

public class Paciente {
    String nome;
    String sobrenome;

    String historiaClinica;
    Date dataInternacao;
    Date dataAlta;



    Paciente(String nome, String sobrenome, String historiaClinica, Date dataInternacao) throws PatientException{
        Date hoje = new Date(2022,06,21);
        this.nome = nome;
        this.sobrenome = sobrenome;
        dataAlta = null;
        this.dataInternacao = dataInternacao;
        if (dataInternacao.after(hoje)){
            throw new PatientException("O IRMAO TA DOIDAO? VEIO DO FUTURO AGORA?");
        } else {
            System.out.println("registrado na data: " + this.getDataInternacao());
        }

    }

    public Date getDataInternacao() {
        return dataInternacao;
    }

    public Date getDataAlta() {
        return dataAlta;
    }

    public void darAlta(Date dataAlta) {
        if (dataAlta.after(dataInternacao))
            System.out.println("Ok");
        else
            System.out.println("Não pode");
    }

}