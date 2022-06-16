package models;

public class IR
{
    private double salario;

    public IR(double salario) {
        this.salario = salario;
    }

    public double calculaIR(double salario,double porcentagem)
    {
        if( this.salario <= 1000){
            return (this.salario * porcentagem ) / 100;
        }
        else if ( this.salario <= 2000){
            return (this.salario * porcentagem ) / 100;
        }
        else if ( this.salario <= 3000){
            return (this.salario * porcentagem ) / 100;
        }
        return this.salario;
    }
}
