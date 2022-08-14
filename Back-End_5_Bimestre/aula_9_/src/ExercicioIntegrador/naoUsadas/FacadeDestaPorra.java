package ExercicioIntegrador.naoUsadas;

import ExercicioIntegrador.models.FlyRoupaTamanho;
import ExercicioIntegrador.models.IflyRoupa;
import ExercicioIntegrador.models.Roupa;

import java.util.Map;

public class FacadeDestaPorra implements IflyRoupa {
//    private FlyRoupaTamanhoX roupaTamanhoX;
//    private FlyRoupaTamanhoM roupaTamanhoM;
//    private FlyRoupaTamanhoS roupaTamanhoS;
    private FlyRoupaTamanho roupaTamanho;

    public FacadeDestaPorra() {
//        this.roupaTamanhoX = new FlyRoupaTamanhoX();
//        this.roupaTamanhoM = new FlyRoupaTamanhoM();
//        this.roupaTamanhoS = new FlyRoupaTamanhoS();
        this.roupaTamanho = new FlyRoupaTamanho();
    }

    @Override
    public void getRoupa(String tamanho, String tipo, boolean eNova, boolean eImportada) {
//        roupaTamanhoX.getRoupa(tamanho, tipo, eNova, eImportada);
//        roupaTamanhoM.getRoupa(tamanho, tipo, eNova, eImportada);
//        roupaTamanhoS.getRoupa(tamanho, tipo, eNova, eImportada);
        roupaTamanho.getRoupa(tamanho, tipo, eNova, eImportada);
    }

    public Map<String, Roupa> getListaMaptamanhoX() {
        return roupaTamanho.getListaMaptamanhoX();
    }

    public Map<String, Roupa> getListaMaptamanhoM() {
        return roupaTamanho.getListaMaptamanhoM();
    }

    public Map<String, Roupa> getListaMaptamanhoS() {
        return roupaTamanho.getListaMaptamanhoS();
    }
}

//public class FacadeDesconto {
//
//    private ApiCartao apiCartao;
//    private ApiProduto apiProduto;
//    private ApiQuantidade apiQuantidade;
//
//    public FacadeDesconto() { // aqui é um construtor sem volta de parametro, mais ja ajudando na hora do exercicioAula.Main pra estar diretos aqui
//        apiCartao = new ApiCartao();
//        apiProduto = new ApiProduto();
//        apiQuantidade = new ApiQuantidade();
//    }
//
//    public int calcularDesconto(Cartao cartao, Produto produto, int quantidade){
//        int desconto = 0;
//
//        desconto += apiCartao.desconto(cartao);
//        desconto += apiProduto.desconto(produto);
//        desconto += apiQuantidade.desconto(quantidade);
//
//        return desconto;
//    }
//}