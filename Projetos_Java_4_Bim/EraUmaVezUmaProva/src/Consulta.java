public class Consulta
{
    private String dataConsulta;
    private String especialidade;
    private int hora;
    private int min;


    public Consulta(String dataConsulta, String especialidade, int hora, int min) {
        this.dataConsulta = dataConsulta;
        this.especialidade = especialidade;
        this.hora = hora;
        this.min = min;
    }
}
