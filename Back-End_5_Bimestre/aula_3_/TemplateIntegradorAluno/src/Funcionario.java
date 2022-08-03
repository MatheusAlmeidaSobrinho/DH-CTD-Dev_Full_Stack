import java.util.ArrayList;

public class Funcionario extends Vendedor {

    private int anosAntiguidade;
    private ArrayList<Vendedor> afiliados = new ArrayList<>();
    public Funcionario(String nome, int anosAntiguidade){
        super.nome = nome;
        super.pontosPorVenda = 10;
        this.anosAntiguidade = anosAntiguidade;
    }

     public void addAfiliado(Vendedor afiliado){
        this.afiliados.add(afiliado);
        System.out.println(afiliado.nome + " agora e afiliado de: " + super.nome);
     }

    @Override
    public int calcularPontos() {
        return (this.afiliados.size()*10) + (this.anosAntiguidade*5 + super.pontosPorVenda);
    }
    @Override
    public String mostrarCategoria() {
        if (calcularPontos() < 20){
            return "[Nome Funcionario: " + super.nome + ", pontuacao: " + this.calcularPontos() + ", categoria: Novato]";
        }
        else if (calcularPontos() > 19 && calcularPontos() < 31){
            return "[Nome Funcionario: " + super.nome + ", pontuacao: " + this.calcularPontos() + ", categoria: Aprendiz]";
        }
        else if (calcularPontos() > 30 && calcularPontos() < 41){
            return "[Nome Funcionario: " + super.nome + ", pontuacao: " + this.calcularPontos() + ", categoria: Bom]";
        }
        else {
            return "[Nome Funcionario: " + super.nome + ", pontuacao: " + this.calcularPontos() + ", categoria: Mestre Jedi]";
        }
    }

}
