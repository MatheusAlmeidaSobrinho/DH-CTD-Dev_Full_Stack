public class Emprestimo
{
    private int numeroCliente;
    private String nomeCliente;
    private double dividaCliente;

    public Emprestimo(int numeroCliente, String nomeCliente, double dividaCliente)
    {
       this.numeroCliente = numeroCliente;
       this.nomeCliente = nomeCliente;
       this.dividaCliente = dividaCliente;

    }
    public void cliente()
    {
     System.out.println("Cliente: " + nomeCliente + " afiliado numero: " + numeroCliente);
    }

    public double divida()
    {
       return this.dividaCliente;
    }

    public void jurosMensalDivida()
    {
     this.dividaCliente += (this.dividaCliente * 3) / 100;
    }

    public void aumentarDivida()
    {
     this.dividaCliente += this.dividaCliente;
    }

    public void quitarDivida()
    {
     this.dividaCliente -= this.dividaCliente;
     System.out.println("Parabens por quitar sua divida.");
    }

    public void clienteDeve(){
     if(dividaCliente > 0)
     {
      System.out.println("Tem divida atual de: " + dividaCliente + "reais.");
     }
     else
     {
      System.out.println("Nao possui dividas atualmente.");
     }
    }

}
