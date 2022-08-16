package ExercicioIntegrador.service.impl;

import ExercicioIntegrador.models.Roupa;
import ExercicioIntegrador.service.IflyRoupa;
import java.util.HashMap;
import java.util.Map;

public class FlyRoupaEnova implements IflyRoupa {
    private Map<String, Roupa> listaMapEnova = new HashMap<>();

    public void getRoupa(String tamanho, String tipo, boolean eNova, boolean eImportada) {
        String roupa = "[tamanho: " + tamanho + "] [tipo: " + tipo + "] [É nova: " + eNova + "] [É importada: " + eImportada + "]";

        if (eNova) {
            if (listaMapEnova.containsKey(roupa)) {
                Roupa n = listaMapEnova.get(roupa);
                n.setContador(n.getContador() + 1);
                System.out.println("Roupa Obtida em roupas novas total: " + n.getContador());
            } else {
                listaMapEnova.put(roupa, new Roupa(tamanho, tipo, eNova, eImportada));
                System.out.println("Roupa Cadastrada em roupas nova");
            }
        }

    }

    public Map<String, Roupa> getListaMapEnova() {
        return listaMapEnova;
    }
}