package ExercicioIntegrador.naoUsadas;

import ExercicioIntegrador.models.IflyRoupa;
import ExercicioIntegrador.models.Roupa;

import java.util.HashMap;
import java.util.Map;

public class FlyRoupaTamanhoS implements IflyRoupa {
    private Map<String, Roupa> listaMaptamanhoS = new HashMap<>();

    @Override
    public void getRoupa(String tamanho, String tipo, boolean eNova, boolean eImportada) {
        String roupa = "[tamanho: " + tamanho + "] [tipo: " + tipo + "] [É nova: " + eNova + "] [É imporada: " + eImportada + "]";

        if (listaMaptamanhoS.containsKey(roupa)) {
            Roupa s = listaMaptamanhoS.get(roupa);
            s.setContador(s.getContador() + 1);
            System.out.println("Roupa existente, tamanho S, total: " + s.getContador());
            //return  s;

        } else {
            listaMaptamanhoS.put(roupa, new Roupa(tamanho, tipo, eNova, eImportada));
            System.out.println("Roupa Cadastrada na lista de tamanho S");
            //return listaMaptamanhoS.get(roupa);
        }
    }

    public Map<String, Roupa> getListaMaptamanhoS() {
        return listaMaptamanhoS;
    }
}
