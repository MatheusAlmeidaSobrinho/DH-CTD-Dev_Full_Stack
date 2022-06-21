public class Publico extends Paciente implements Comparable<Publico>
{
    private int numeroCarterinhaSus;


    public Publico(String nome, Consulta consulta, boolean eAPrimeiraConsulta, int numeroCarterinhaSus) {
        super(nome, consulta, eAPrimeiraConsulta);
        this.numeroCarterinhaSus = numeroCarterinhaSus;
    }

    @Override
    public int compareTo(Publico paciente){
    if (this.numeroCarterinhaSus == paciente.numeroCarterinhaSus){
        System.out.println("iguais");
        return 0;
    } else if (this.numeroCarterinhaSus < paciente.numeroCarterinhaSus){
        System.out.println("O maior �:" + paciente.numeroCarterinhaSus);
        return 1;
    } else {
        System.out.println("O maior �:" + this.numeroCarterinhaSus);
        return -1;
    }
}

}
