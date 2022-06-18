public class Gerente extends Funcionario
{
    private int senha;

    @Override
    public double getBonificacao() {
        System.out.println("Gerente");
        return 500.00;
    }

    public boolean autenticaLogin(int senha)
    {
        if(this.senha == senha){
            return true;
        }
        return false;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
