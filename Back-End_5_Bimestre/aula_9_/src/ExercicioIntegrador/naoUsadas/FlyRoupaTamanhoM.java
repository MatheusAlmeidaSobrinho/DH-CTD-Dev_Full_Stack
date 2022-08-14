package ExercicioIntegrador.naoUsadas;

import ExercicioIntegrador.models.IflyRoupa;
import ExercicioIntegrador.models.Roupa;

import java.util.HashMap;
import java.util.Map;

public class FlyRoupaTamanhoM implements IflyRoupa {
    private Map<String, Roupa> listaMaptamanhoM = new HashMap<>();

    @Override
    public void getRoupa(String tamanho, String tipo, boolean eNova, boolean eImportada) {
        String roupa = "[tamanho: " + tamanho + "] [tipo: " + tipo + "] [É nova: " + eNova + "] [É imporada: " + eImportada + "]";

        if (listaMaptamanhoM.containsKey(roupa)) {
            Roupa m = listaMaptamanhoM.get(roupa);
            m.setContador(m.getContador() + 1);
            System.out.println("Roupa existente, tamanho M, total: " + m.getContador());
            //return  m;

        } else {
            listaMaptamanhoM.put(roupa, new Roupa(tamanho, tipo, eNova, eImportada));
            System.out.println("Roupa Cadastrada na lista de tamanho M");
            //return listaMaptamanhoM.get(roupa);
        }
    }

    public Map<String, Roupa> getListaMaptamanhoM() {
        return listaMaptamanhoM;
    }
}
