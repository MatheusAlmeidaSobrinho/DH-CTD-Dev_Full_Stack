public class Afiliado extends Vendedor{

    public Afiliado(String nome){
        super.nome = nome;
        super.pontosPorVenda = 15;
    }

    @Override
    public int calcularPontos() {
        return (this.vendas * pontosPorVenda);
    }

    @Override
    public String mostrarCategoria() {
        if (calcularPontos() < 20){
            return "[Nome Afiliado: " + super.nome + ", pontuacao: " + this.calcularPontos() + ", categoria: Novato]";
        }
        else if (calcularPontos() > 19 && calcularPontos() < 31){
            return "[Nome Afiliado: " + super.nome + ", pontuacao: " + this.calcularPontos() + ", categoria: Aprendiz]";
        }
        else if (calcularPontos() > 30 && calcularPontos() < 41){
            return "[Nome Afiliado: " + super.nome + ", pontuacao: " + this.calcularPontos() + ", categoria: Bom]";
        }
        else {
            return "[Nome Afiliado: " + super.nome + ", pontuacao: " + this.calcularPontos() + ", categoria: Mestre Jedi]";
        }
    }

}
