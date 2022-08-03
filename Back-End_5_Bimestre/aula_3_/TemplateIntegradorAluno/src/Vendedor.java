
//validação que usa propriedades de subclasse apenas!!
//Classe abstrata Vendedor - aqui vai o Template Method
public abstract class Vendedor {

    protected String nome;
    protected int vendas = 0;
    protected int pontosPorVenda;

    public void vender(int qtdVendas){
        this.vendas += qtdVendas;
        System.out.println(this.nome +" realizou "+ qtdVendas + " vendas.");
    }

    /*Método que calcula os pontos do Vendedor de acordo com seus aspectos
    a serem considerados*/
    public abstract int calcularPontos();

    /*TEMPLATE METHOD - recebe o total de pontos calculados a partir
    da subclasse e valida cada item para retornar a categoria*/
    public String mostrarCategoria() {
        if (calcularPontos() < 20){
            return "[Nome Vendedor: " + this.nome + ", pontuacao: " + calcularPontos() + ", categoria: Novato]";
        }
        else if (calcularPontos() > 19 && calcularPontos() < 31){
            return "[Nome Vendedor: " + this.nome + ", pontuacao: " + calcularPontos() + ", categoria: Aprendiz]";
        }
        else if (calcularPontos() > 30 && calcularPontos() < 41){
            return "[Nome Vendedor: " + this.nome + ", pontuacao: " + calcularPontos() + ", categoria: Bom]";
        }
        else {
            return "[Nome Vendedor: " + this.nome + ", pontuacao: " + calcularPontos() + ", categoria: Mestre Jedi]";
        }
    }
}





