package ExercicioIntegrador.models;

import ExercicioIntegrador.models.Roupa;

import java.util.HashMap;
import java.util.Map;

public class FlyRoupaEnova{
    private Map<Boolean, Roupa> listaMapEnova = new HashMap<>();

    public Roupa getRoupa(String tamanho, String tipo, boolean eNova, boolean eImportada) {
        String roupa = "[tamanho: " + tamanho + "] [tipo: " + tipo + "] [É nova: " + eNova + "] [É importada: " + eImportada + "]";

        if(eUsado(String.valueOf(eNova))) {
            if (listaMapEnova.containsKey(roupa)) {
                Roupa n = listaMapEnova.get(roupa);
                n.setContador(n.getContador() + 1);
                System.out.println("Roupa Obtida em roupas usadas total: " + n.getContador());
                return n;
            } else {
                listaMapEnova.put(Boolean.valueOf(roupa), new Roupa(tamanho, tipo, eNova, eImportada));
                System.out.println("Roupa Cadastrada em roupas usadas");
                return listaMapEnova.get(roupa);
            }

        }
        return null;
    }

    public boolean eUsado(String roupa){
        if(roupa.equalsIgnoreCase("usado")){
            return true;
        }
        return false;
    }

}