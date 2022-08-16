package ExercicioIntegrador.service.impl;

import ExercicioIntegrador.models.Roupa;
import ExercicioIntegrador.service.IflyRoupa;
import java.util.HashMap;
import java.util.Map;

public class FlyRoupaTamanhoM implements IflyRoupa {
    private Map<String, Roupa> listaMaptamanhoM = new HashMap<>();

    @Override
    public void getRoupa(String tamanho, String tipo, boolean eNova, boolean eImportada) {
        String roupa = "[tamanho: " + tamanho + "] [tipo: " + tipo + "] [É nova: " + eNova + "] [É imporada: " + eImportada + "]";

        if (tamanho.equalsIgnoreCase("M")) {
            if (listaMaptamanhoM.containsKey(roupa)) {
                Roupa m = listaMaptamanhoM.get(roupa);
                m.setContador(m.getContador() + 1);
                System.out.println("Roupa existente, tamanho M, total: " + m.getContador());
            } else {
                listaMaptamanhoM.put(roupa, new Roupa(tamanho, tipo, eNova, eImportada));
                System.out.println("Roupa Cadastrada na lista de tamanho M");
            }
        }
    }

    public Map<String, Roupa> getListaMaptamanhoM() {
        return listaMaptamanhoM;
    }
}
