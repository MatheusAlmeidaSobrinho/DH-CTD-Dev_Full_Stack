package exercicioGuiado;

import java.util.HashMap;
import java.util.Map;

public class ComputadorFactory {
    private static Map<String, Computador> computadorMap = new HashMap<>();

    public Computador getComputador(int ram, int hd) {
        String id = "id: " + ram + "de RAM, " + hd + "Gb.";

        System.out.println(id);

        if (computadorMap.containsKey(id)) {
            Computador comp = computadorMap.get(id); // chamando o computador
            comp.setContador(comp.getContador() + 1); // incrementando
            System.out.println("Pc obtido");
            return comp;
        } else {
            computadorMap.put(id, new Computador(ram, hd));
            System.out.println("Pc criado");
            return computadorMap.get(id);
        }
    }
}
