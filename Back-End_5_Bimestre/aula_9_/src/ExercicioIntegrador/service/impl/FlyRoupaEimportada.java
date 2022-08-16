package ExercicioIntegrador.service.impl;

import ExercicioIntegrador.models.Roupa;
import ExercicioIntegrador.service.IflyRoupa;

import java.util.HashMap;
import java.util.Map;

public class FlyRoupaEimportada implements IflyRoupa {
    private Map<String, Roupa> listaMapEimportada = new HashMap<>();


    @Override
    public void getRoupa(String tamanho, String tipo, boolean eNova, boolean eImportada) {
        String roupa = "[tamanho: " + tamanho + "] [tipo: " + tipo + "] [É nova: " + eNova + "] [É importada: " + eImportada + "]";

        if (eImportada) {
            if (listaMapEimportada.containsKey(roupa)) {
                Roupa i = listaMapEimportada.get(roupa);
                i.setContador(i.getContador() + 1);
                System.out.println("Roupa Obtida em roupas importadas total: " + i.getContador());
            } else {
                listaMapEimportada.put(roupa, new Roupa(tamanho, tipo, eNova, eImportada));
                System.out.println("Roupa Cadastrada em importadas");
            }
        }

    }

    public Map<String, Roupa> getListaMapEimportada() {
        return listaMapEimportada;
    }
}
