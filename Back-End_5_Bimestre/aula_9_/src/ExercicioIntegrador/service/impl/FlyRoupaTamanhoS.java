package ExercicioIntegrador.service.impl;

import ExercicioIntegrador.models.Roupa;
import ExercicioIntegrador.service.IflyRoupa;
import java.util.HashMap;
import java.util.Map;

public class FlyRoupaTamanhoS implements IflyRoupa {
    private Map<String, Roupa> listaMaptamanhoS = new HashMap<>();

    @Override
    public void getRoupa(String tamanho, String tipo, boolean eNova, boolean eImportada) {
        String roupa = "[tamanho: " + tamanho + "] [tipo: " + tipo + "] [É nova: " + eNova + "] [É imporada: " + eImportada + "]";

        if (tamanho.equalsIgnoreCase("S")) {
            if (listaMaptamanhoS.containsKey(roupa)) {
                Roupa s = listaMaptamanhoS.get(roupa);
                s.setContador(s.getContador() + 1);
                System.out.println("Roupa existente, tamanho S, total: " + s.getContador());
            } else {
                listaMaptamanhoS.put(roupa, new Roupa(tamanho, tipo, eNova, eImportada));
                System.out.println("Roupa Cadastrada na lista de tamanho S");
            }
        }
    }

    public Map<String, Roupa> getListaMaptamanhoS() {
        return listaMaptamanhoS;
    }
}
