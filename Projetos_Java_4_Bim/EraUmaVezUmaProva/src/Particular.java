public class Particular extends Paciente
{
    private double valorConsulta;
    private String rg;

    public Particular(String nome, Consulta consulta, boolean eAPrimeiraConsulta, double valorConsulta, String rg) {
        super(nome, consulta, eAPrimeiraConsulta);
        this.valorConsulta = valorConsulta;
        this.rg = rg;
    }

}
