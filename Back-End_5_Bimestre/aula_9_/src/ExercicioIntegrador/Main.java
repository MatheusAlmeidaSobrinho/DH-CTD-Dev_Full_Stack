package ExercicioIntegrador;


import ExercicioIntegrador.models.FlyRoupaTamanho;
import ExercicioIntegrador.naoUsadas.FacadeDestaPorra;

public class Main {
    public static void main(String[] args) {
        FacadeDestaPorra f = new FacadeDestaPorra();

//        f.getRoupa("X","CAL�A",false,false);
//        f.getRoupa("X","CAL�A",false,false);
//
//        f.getRoupa("X","CAL�A",false,false);
//        f.getRoupa("X","CAL�A",false,false);
//
//        f.getRoupa("X","CAL�A",false,false);
//        f.getRoupa("X","CAL�A",false,false);
//
//        f.getRoupa("X","CAL�A",true,true);
//        f.getRoupa("X","CAL�A",true,true);

        f.getRoupa("X","CAL�A",true,true); // 4 cal�as iguais
        f.getRoupa("X","CAL�A",true,true);
        f.getRoupa("X","CAL�A",true,true);
        f.getRoupa("l","CAL�A",true,true);

        f.getRoupa("M","CAMISA",false,false); //3 camisas iguais
        f.getRoupa("M","CAMISA",false,false);
        f.getRoupa("M","CAMISA",false,false);

//        System.out.println(f.getListaMaptamanhoX());
//        System.out.println(f.getListaMaptamanhoX().size());

        int qtdCalcaXcomprada = f.getListaMaptamanhoX().size();

//        System.out.println(f.getListaMaptamanhoM());
//        System.out.println(f.getListaMaptamanhoM().size());

        int qtdCamisaMcomprada = f.getListaMaptamanhoM().size();

        // criando duas variaveis s� pra fazer o teste pedido de 2 itens de cada iguais, n�o importando a quantidade deles
        System.out.println("Total itens comprados: " + (qtdCalcaXcomprada + qtdCamisaMcomprada));

    }
}
