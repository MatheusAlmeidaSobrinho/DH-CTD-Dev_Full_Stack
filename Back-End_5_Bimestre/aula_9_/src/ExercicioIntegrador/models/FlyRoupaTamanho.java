package ExercicioIntegrador.models;

import java.util.HashMap;
import java.util.Map;

public class FlyRoupaTamanho implements IflyRoupa {

    private Map<String, Roupa> listaMaptamanhoX = new HashMap<>();
    private Map<String, Roupa> listaMaptamanhoM = new HashMap<>();
    private Map<String, Roupa> listaMaptamanhoS = new HashMap<>();

    @Override
    public void getRoupa(String tamanho, String tipo, boolean eNova, boolean eImportada) {
        String roupa = "[Tamanho: " + tamanho + "] [Tipo: " + tipo + "] [É nova: " + eNova + "] [É importada: " + eImportada + "] ";

        if (tamanho.equalsIgnoreCase("X")) {

            if (listaMaptamanhoX.containsKey(roupa)) {
                Roupa x = listaMaptamanhoX.get(roupa);
                x.setContador(x.getContador() + 1);
                System.out.println("Roupa existente, tamanho X, total: " + x.getContador());

            } else {
                listaMaptamanhoX.put(roupa, new Roupa(tamanho, tipo, eNova, eImportada));
                System.out.println("Roupa Cadastrada na lista de tamanho X");
            }

        } else if (tamanho.equalsIgnoreCase("S")) {

            if (listaMaptamanhoS.containsKey(roupa)) {
                Roupa s = listaMaptamanhoS.get(roupa);
                s.setContador(s.getContador() + 1);
                System.out.println("Roupa existente, tamanho S, total: " + s.getContador());

            } else {
                listaMaptamanhoS.put(roupa, new Roupa(tamanho, tipo, eNova, eImportada));
                System.out.println("Roupa Cadastrada na lista de tamanho S");
            }
        } else if (tamanho.equalsIgnoreCase("M")) {

            if (listaMaptamanhoM.containsKey(roupa)) {
                Roupa m = listaMaptamanhoM.get(roupa);
                m.setContador(m.getContador() + 1);
                System.out.println("Roupa existente, tamanho M, total: " + m.getContador());

            } else {
                listaMaptamanhoM.put(roupa, new Roupa(tamanho, tipo, eNova, eImportada));
                System.out.println("Roupa Cadastrada na lista de tamanho M");
            }
        } else {
            System.out.println("Tamanho não reconhecido");
        }

    }

    // passei para o facade já q nao consigo acessar por aqui

//    public Map<String, Roupa> getListaMaptamanhoX() {
//        return listaMaptamanhoX;
//    }
//
//    public Map<String, Roupa> getListaMaptamanhoM() {
//        return listaMaptamanhoM;
//    }
//
//    public Map<String, Roupa> getListaMaptamanhoS() {
//        return listaMaptamanhoS;
//    }


}
