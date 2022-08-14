package ExercicioIntegrador.naoUsadas;

import ExercicioIntegrador.models.IflyRoupa;
import ExercicioIntegrador.models.Roupa;

import java.util.HashMap;
import java.util.Map;

public class FlyRoupaTamanhoX implements IflyRoupa {
    private Map<String, Roupa> listaMaptamanhoX = new HashMap<>();

    public FlyRoupaTamanhoX() {
        this.listaMaptamanhoX = new HashMap<>();
    }

    @Override
    public void getRoupa(String tamanho, String tipo, boolean eNova, boolean eImportada) {
        String roupa = "[tamanho: " + tamanho + "] [tipo: " + tipo + "] [É nova: " + eNova + "] [É imporada: " + eImportada + "]";

        if (listaMaptamanhoX.containsKey(roupa)) {
            Roupa x = listaMaptamanhoX.get(roupa);
            x.setContador(x.getContador() + 1);
            System.out.println("Roupa existente, tamanho X, total: " + x.getContador());
            //return x;

        } else {
            listaMaptamanhoX.put(roupa, new Roupa(tamanho, tipo, eNova, eImportada));
            System.out.println("Roupa Cadastrada na lista de tamanho X");
            //return listaMaptamanhoX.get(roupa);
        }
    }

    public Map<String, Roupa> getListaMaptamanhoX() {
        return listaMaptamanhoX;
    }
}
