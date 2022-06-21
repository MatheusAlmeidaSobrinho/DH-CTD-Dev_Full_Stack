package MinhasClasses;

import interfaces.GravarImposto;

public class ContaCorrente extends Conta implements GravarImposto {
    @Override
    public void sacar(double valor) {
        valor += + 0.2;
        if(this.getSaldo() >= valor) {
        this.setSaldo(this.getSaldo() - valor);
        } else {
            System.out.println("Saldo MinhasClasses.Conta corrente insuficiente!" +
                    " Valor disponivel: " + this.getSaldo() + ", Valor solicitado com taxa: " + valor);
        }
    }


    @Override
    public double imposto(double porc) {
        porc = getSaldo() * porc / 100;
        if(this.getSaldo() >= 5000.0){
            this.setSaldo(this.getSaldo() - porc);
        } if(this.getSaldo() >= 1000.0){
            this.setSaldo(this.getSaldo() - porc);
        }
        return this.getSaldo();
    }
}
