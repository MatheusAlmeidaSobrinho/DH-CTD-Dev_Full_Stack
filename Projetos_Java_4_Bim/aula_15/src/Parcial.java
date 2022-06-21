public class Parcial extends Exame{
    private int unidade;
    private int numTentativas;

    public boolean recuperar(){
        if(this.unidade <=3){
            if(this.numTentativas < 3){
                return true;
            }
            return false;
        }
        if(this.numTentativas < 2){
            return true;
        }
        return false;
    }
}