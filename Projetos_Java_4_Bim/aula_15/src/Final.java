public class Final extends Exame implements Comparable<Final>{

    private double notaOral;
    private String descricao;

    public double media(){
        return (super.getNota() + this.notaOral)/2;
    }

    @Override
    public boolean aprovado(){
        if(this.media() >=4){
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Final f){
        if(this.media() == f.media()){
            return 0;
        }
        if(this.media() > f.media()){
            return 1;
        }
        return -1;
    }
}