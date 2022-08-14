package exercicioMesa;

import exercicioGuiado.Computador;
import exercicioGuiado.ComputadorFactory;

public class Main {
    public static void main(String[] args) {
        ArvoreFactory arvoreFactory = new ArvoreFactory();

        Arvore arvTipo1 = arvoreFactory.getArvore(100,200,"Verde");
        Arvore arvTipo2 = arvoreFactory.getArvore(200,400,"Vermelha");
        Arvore arvTipo3 = arvoreFactory.getArvore(300,600,"Roxa");

        System.out.println(arvTipo1.toString());
        System.out.println(arvTipo2.toString());
        System.out.println(arvTipo3.toString());

        int contador = 0;
        int contador2 = 0;
        int contador3 = 0;

        for(int i = 0; i < 100; i++){
            System.out.println(arvTipo1);
            if(arvTipo1.getCor().equals("Verde")){
                contador++;
            }
            System.out.println(arvTipo2);
            if (arvTipo2.getCor().equals("Vermelha")){
                contador2++;
            }
            System.out.println(arvTipo3);
            if (arvTipo3.getCor().equals("Roxa")){
                contador3++;
            }
        }
        System.out.println("verdinha: " + contador/3 + "%");
        System.out.println("vermelha: " + contador2/3 + "%");
        System.out.println("vermelha: " + contador3/3 + "%");

    }


}
