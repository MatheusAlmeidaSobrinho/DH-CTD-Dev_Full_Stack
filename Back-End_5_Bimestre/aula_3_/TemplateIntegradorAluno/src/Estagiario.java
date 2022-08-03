public class Estagiario extends Vendedor{

    public Estagiario(String nome){
        super.nome = nome;
        super.pontosPorVenda = 5;
    }

    @Override
    public int calcularPontos() {
        return this.vendas * super.pontosPorVenda;
    }

    @Override
    public String mostrarCategoria() {
        if (calcularPontos() < 50) {
            return "[Nome Estagiario: " + this.nome + ", pontuacao: " + this.calcularPontos() + ", categoria: Novato]";
        } else {
            return "[Nome Estagiario: " + this.nome + ", pontuacao: " + this.calcularPontos() + ", categoria: Experiente]";
        }
    }

}
