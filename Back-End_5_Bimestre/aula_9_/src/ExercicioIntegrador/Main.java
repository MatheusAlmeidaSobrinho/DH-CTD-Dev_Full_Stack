package ExercicioIntegrador;

import ExercicioIntegrador.service.impl.FacadeRoupa;

public class Main {
    public static void main(String[] args) {
        FacadeRoupa f = new FacadeRoupa();

        f.getRoupa("X", "CALÇA", true, true);
        f.getRoupa("X", "BLUSA", false, true);
        f.getRoupa("X", "CALÇA", true, false);
        f.getRoupa("S", "CALÇA", true, true);

        f.getRoupa("M", "CAMISA", false, false);
        f.getRoupa("M", "CAMISA", false, false);
        f.getRoupa("M", "CAMISA", false, false);
        f.getRoupa("M", "CALCA", false, false);
        f.getRoupa("M", "CALCA", true, false);
        f.getRoupa("M", "CALCA", false, true);

        System.out.println("X:" + f.getListaMaptamanhoX().size());
        System.out.println("S:" + f.getListaMaptamanhoS().size());
        System.out.println("M:" + f.getListaMaptamanhoM().size());
        System.out.println("NOVA:" + f.getListaMapEnova().size());
        System.out.println("IMPORTADA:" + f.getListaMapEimportada().size());


    }
}
