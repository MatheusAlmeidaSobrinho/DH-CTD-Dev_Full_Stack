package ExercicioIntegrador.service.impl;

import ExercicioIntegrador.models.Roupa;
import ExercicioIntegrador.service.IflyRoupa;
import java.util.HashMap;
import java.util.Map;

public class FlyRoupaTamanhoX implements IflyRoupa {
    private Map<String, Roupa> listaMaptamanhoX = new HashMap<>();

    @Override
    public void getRoupa(String tamanho, String tipo, boolean eNova, boolean eImportada) {
        String roupa = "[tamanho: " + tamanho + "] [tipo: " + tipo + "] [É nova: " + eNova + "] [É imporada: " + eImportada + "]";

        if (tamanho.equalsIgnoreCase("X")) {
            if (listaMaptamanhoX.containsKey(roupa)) {
                Roupa x = listaMaptamanhoX.get(roupa);
                x.setContador(x.getContador() + 1);
                System.out.println("Roupa existente, tamanho X, total: " + x.getContador());
            } else {
                listaMaptamanhoX.put(roupa, new Roupa(tamanho, tipo, eNova, eImportada));
                System.out.println("Roupa Cadastrada na lista de tamanho X");
            }
        }
    }

    public Map<String, Roupa> getListaMaptamanhoX() {
        return listaMaptamanhoX;
    }
}
