package ExercicioIntegrador.service.impl;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class FacadeRoupaTest {

    static FacadeRoupa facadeRoupa = new FacadeRoupa();

    @BeforeAll
    static void doBefore() {
        facadeRoupa.getRoupa("X", "CALÇA", true, true);
        facadeRoupa.getRoupa("X", "CALÇA", false, false);
        facadeRoupa.getRoupa("X", "CAMISA", false, false);
        facadeRoupa.getRoupa("X", "CAMISA", true, true);
        // Aqui criando 4 tipos de roupas diferentes mesmo possuindo o mesmo tamanho:
        // totalizando 4 listas para o tamanho X / 2 novas / 2 importadas

        facadeRoupa.getRoupa("M", "CAMISA", false, false);
        facadeRoupa.getRoupa("M", "CAMISA", false, false);
        facadeRoupa.getRoupa("M", "CAMISA", false, false);
        facadeRoupa.getRoupa("M", "CAMISA", false, false);
        facadeRoupa.getRoupa("M", "CAMISA", false, false);
        facadeRoupa.getRoupa("M", "CAMISA", false, false);
        // Aqui fazendo a repetição para validar contagem: 6 roupas identicas:
        // totalizando 1 lista para o tamanho M / 0 nova / 0 importada

        facadeRoupa.getRoupa("S", "CALÇA", true, true);
        facadeRoupa.getRoupa("S", "CALÇA", true, true);
        facadeRoupa.getRoupa("S", "CALÇA", true, true);
        facadeRoupa.getRoupa("S", "CALÇA", true, true);
        // Aqui fazendo a repetição para validar contagem: 4 roupas identicas:
        // totalizando 1 lista para o tamanho S / 1 nova / 1 importada

        System.out.println();// pra nao juntar com o teste debaixo =]
    }

    @Test
    public void tamanhoDasListas() {
        System.out.println("Qtd listas do tamanho X:" + facadeRoupa.getListaMaptamanhoX().size());
        System.out.println("Qtd listas do tamanho S:" + facadeRoupa.getListaMaptamanhoS().size());
        System.out.println("Qtd listas do tamanho M:" + facadeRoupa.getListaMaptamanhoM().size());
        System.out.println("Qtd listas de roupas NOVAS:" + facadeRoupa.getListaMapEnova().size());
        System.out.println("Qtd listas de roupas IMPORTADAS:" + facadeRoupa.getListaMapEimportada().size());
        // Pode ser invocado sem o .size() para ver exatamente a quais listas eles se referem.
        System.out.println();// pra nao juntar com o teste debaixo =]
    }

    @Test
    public void getQuantidadeItensPedidos() {
        int pedidosDiferentes = facadeRoupa.getListaMaptamanhoX().size()
                + facadeRoupa.getListaMaptamanhoS().size()
                + facadeRoupa.getListaMaptamanhoM().size();

        int somaItens = facadeRoupa.getListaMaptamanhoX().size()
                      + facadeRoupa.getListaMaptamanhoS().size()
                      + facadeRoupa.getListaMaptamanhoM().size()
                      + facadeRoupa.getListaMapEnova().size()
                      + facadeRoupa.getListaMapEimportada().size();


        System.out.println("->Total Itens pedidos:");
        System.out.println("Foram solicitadas: 14 roupas sendo que entre elas temos: " + pedidosDiferentes +
                " roupas pedidas diferentes e " + somaItens + " listas geradas!");
        System.out.println();// pra nao juntar com o teste debaixo =]
    }

    @Test
    public void testeValidacaoTamanhos(){
        int listaX = facadeRoupa.getListaMaptamanhoX().size();
        int listaM = facadeRoupa.getListaMaptamanhoM().size();
        int listaS = facadeRoupa.getListaMaptamanhoS().size();

        assertEquals(4,listaX);
        assertEquals(1,listaM);
        assertEquals(2,listaS); // Erro proposital validando que a lista do tamanho S contem somente 1 lista.
    }


}